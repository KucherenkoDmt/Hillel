package components;

import HomeWork.Log.ConsoleLogger;
import HomeWork.Log.Logger;
import HomeWork.UrlBuilder.Url;
import components.newCommentPageElements.CategoryButtons.CategorySelector;
import components.pages.NewCommentPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HomeTaskTest {
    Logger logger;
    WebDriver driver;
    WebDriverWait wait;


    @Before
    public void setUp() throws IOException {
        logger = new ConsoleLogger();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);

        log("Setting window size");
        driver.manage().window().setSize(new Dimension(1280, 760));

        log("Navigating to Comments website");
        String url = new Url.UrlBuilder("comments.azurewebsites.net")
                .withHttps(false)
                .build()
                .getUrl();

        driver.get(url);
    }


    @Test
    public void addCommentE2eTest() throws IOException {
        final String commentText = "test comment";
        final int commentNumber = ThreadLocalRandom.current().nextInt(50, 999);

        log("Click New comment button");
        click("//input[@value='New...']");

        log("Wait for page navigation to happen");
        wait.until(ExpectedConditions.titleIs("Editor"));

        log("Set comment text");
        type("//input[@name=\"Text\"]", commentText);

        log("Add number to numberField");
        type("//input[@name='Number']", "" + commentNumber);

        NewCommentPage newCommentPage = new NewCommentPage(driver);

        CategorySelector categorySelector = newCommentPage.selector();

        categorySelector.availableCats().categories().get(0).checkBox().check();

        categorySelector.selectedButtons().add().click();

        log("Click SaveReturn button");
        click("//input[@value='Save & Return']");

        log("Checking comment is in the list");

        log("Sorting comments in the DESC order by Clicking Number twice");
        driver.findElement(By.partialLinkText("Number")).click();
        driver.findElement(By.partialLinkText("Number")).click();

        log("Navigating to the correct page");
        navigateToPageWithComments(commentNumber);

        log("Getting our comment");
        WebElement createdComment = getRowElementByNumber(commentNumber);

        log("Check comment is presented on list");
        assertNotNull("Text added not properly", createdComment);

        log("Check comment text is right");
        assertEquals("Text added not properly",
                createdComment.findElement(By.cssSelector(".textcolumn")).getText(), commentText);

        log("Check comment category is right");
        assertEquals("Text added not properly",
                createdComment.findElement(By.cssSelector(".categorycolumn")).getText(), "Cat0");

    }

    /*@Test
    public void pageObjectExample() {
        AddCommentPageObject pageObject = new AddCommentPageObject(driver);


        pageObject.fillForm("Commentariy", 592, false);

        pageObject.firstCategoryCheckbox().click();

        pageObject.addCategorryButton().click();

        pageObject.saveButton().click();

        pageObject.returnButton().click();
    }*/

    @Test
    public void pageObjectHomeWork() {
        NewCommentPage commentPage = new NewCommentPage(driver);
        commentPage.form().commentText().addText("Commentariy");
        commentPage.form().commentNumber().addText("541");
        commentPage.form().commentActive().check();
        commentPage.selector().availableCats().categories().get(0).checkBox().check();
        commentPage.selector().selectedButtons().add().click();
        commentPage.headerButtons().saveButton();
        commentPage.headerButtons().returnButton();
    }


      /*  @Test
        public void hillelExample (){
            final String commentText = "Comment Text";
            final int commentNumber = ThreadLocalRandom.current().nextInt(50, 999);
            final boolean isActive = false;

            AddCommentHillelObject pageObject = new AddCommentHillelObject(driver);

            pageObject.form().commentField().clear();

            pageObject.form().commentField().addText(commentText);

            pageObject.form().numberField().addText("" + commentNumber);

            pageObject.form().isActiveCheckBox().checkBox().check();

            pageObject.fillForm(commentText, commentNumber, isActive);

            pageObject.categorySelector().availableCats().categories().get(0).checkBox().check();

            pageObject.categorySelector().selectButtons().add().click();


        }*/

        @After
        public void tearDown () {
            driver.quit();
        }


    private void log(String textToLog) throws IOException {
        logger.log(textToLog);
    }

    private void navigateToPageWithComments(int commentNumber) throws IOException {
        List<WebElement> numbers = driver.findElements(By.cssSelector(".numbercolumn"));
        int firstCommentNumber = Integer.valueOf(numbers.get(0).getText());
        int lastCommentNumber = Integer.valueOf(numbers.get(numbers.size() - 1).getText());

        log("Clicking next page button if the comment is not on the page");
        while (!(firstCommentNumber >= commentNumber && lastCommentNumber <= commentNumber)) {

            log("You are on the wrong page! First comment #: " + firstCommentNumber +
                    ", your comment #" + commentNumber
                    + " ,last comment number" + lastCommentNumber);

            driver.findElement(By.cssSelector(".webgrid-footer")).findElement(By.partialLinkText(">")).click();

            numbers = driver.findElements(By.cssSelector(".numbercolumn"));

            firstCommentNumber = Integer.valueOf(numbers.get(0).getText());
            lastCommentNumber = Integer.valueOf(numbers.get(numbers.size() - 1).getText());
        }

        log("You are on the right page! First comment #: " + firstCommentNumber +
                ", your comment #: " + commentNumber
                + " ,last comment #: " + lastCommentNumber);
    }

    private WebElement getRowElementByNumber(int elementNumber) throws IOException {
        List<WebElement> rows =
                driver.findElement(By.cssSelector("tbody"))
                        .findElements(By.cssSelector("tr"));

        for (WebElement row : rows) {
            if (row.findElement(By.cssSelector(".numbercolumn")).getText().equals("" + elementNumber)) {
                log("Element by Number is FOUND!");
                return row;
            }

        }

        log("Element by Number is NOT FOUND!");
        log("Return null if element not found");
        return null;
    }


    private void type(String xpath, String textToType) {
        driver.findElement(By.xpath(xpath)).sendKeys(textToType);
    }

    private void click(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }
}


