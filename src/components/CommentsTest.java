package components;

import HomeWork.Log.ConsoleLogger;
import HomeWork.Log.Logger;
import HomeWork.UrlBuilder.Url;
import components.newCommentPageElements.CommentFields.CommentFields;
import components.newCommentPageElements.CategoryButtons.CategorySelector;
import components.pages.NewCommentPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class CommentsTest {
    WebDriver driver;
    Logger logger;
    WebDriverWait wait;

    @Before
    public void setUp() throws IOException {
        driver = new FirefoxDriver();
        logger = new ConsoleLogger();
        wait = new WebDriverWait(driver, 10);
        log("Create url");
        Url urlOfComments = new Url.UrlBuilder("comments.azurewebsites.net").withHttps(false).build();
        System.out.println(urlOfComments.getUrl());

        log("Navigate to Url ");
        driver.get(urlOfComments.getUrl());


    }

    @Test
    public void addComment() throws IOException, InterruptedException {

        int number = ThreadLocalRandom.current().nextInt(50, 999);
        log("Get element \"New...\" and click");
        click("//input[@value='New...']");
        wait.until(ExpectedConditions.titleIs("Editor"));

        log("Add comment text");
        String commentText = "some text" + number;
     //   type("//*[@id='Text']", commentText);

        log("Add original number");
     //   type("//*[@id='Number']", number + "");

        CommentFields commentfiels = new CommentFields(driver.findElement(By.xpath("//div[@id='commentfields']")));
        commentfiels.commentText().typeText(commentText);
        commentfiels.commentNumber().typeText(number + "");
        commentfiels.commentActive().check();

        log("Add 1 category");
        String categories = "Cat1";
        // WebElement categoryCheckBox = driver.findElement(By.cssSelector("#alvailablecategories")).findElement(By.cssSelector(".categoryitem")).findElement(By.cssSelector("input#Categories"));
        // categoryCheckBox.click();
        click("//*[@class=\"categoryitem\"]/span[contains(text(),'" + categories + "')]/../*[@type]");
        driver.findElement(By.name("CurSelect")).click();

      /*  WebElement element = driver.findElement(By.xpath("//div[@id='categoryselector']"));
        CategorySelector categorySelector = new CategorySelector(element);
        categorySelector.availableCats().categories().get(0).checkBox().check();
        Thread.sleep(500);
        categorySelector.selectedButtons().add().click();*/

        log("Click save");
        click("//*[@id='editor-navigation']/input[1]");
        Thread.sleep(2500);

        log("Click Return");
        driver.findElement(By.linkText("Return")).click();

        log("Check comment on all pages");
        findComment(commentText);
        //   boolean namberAndCategories = false;
        log("Get comment's number");
        String numberOfcomment = driver.findElement(By.xpath("//*[@class='textcolumn'][contains(text(),'" + commentText + "')]/../*[@class='numbercolumn']")).getText();
        int number2 = Integer.parseInt(numberOfcomment);
        log("Get categories of comments");
        String categoriesOfcomment = driver.findElement(By.xpath("//*[@class='textcolumn'][contains(text(),'" + commentText + "')]/../*[@class='categorycolumn']")).getText();
        //  namberAndCategories = (number == number2 && categories.equals(categoriesOfcomment));
        log("Check comments namber and categories");
        Assert.assertEquals("number is not the same", number, number2);
        Assert.assertEquals("categories is not the same", categories, categoriesOfcomment);
        //  log("Value of comments is the same: " + namberAndCategories);
    }

   // @Test
    public void pageObjectHomeWork() throws IOException {
        log("Get element \"New...\" and click");
        click("//input[@value='New...']");
        wait.until(ExpectedConditions.titleIs("Editor"));

        NewCommentPage commentPage = new NewCommentPage(driver);
        log("add text");
        commentPage.form().commentText().addText("Commentariy");
        log("add number");
        commentPage.form().commentNumber().typeText("541");
        log("check checkbox");
        commentPage.form().commentActive().check();
        log("set first cat");
        commentPage.selector().availableCats().categories().get(1).checkBox().check();
        log("click add cat");
        commentPage.selector().selectedButtons().add().click();
        log("save");
        commentPage.headerButtons().saveButton();
        log("return");
        commentPage.headerButtons().returnButton();
    }

  //  @Test
    public void deleteComment() throws IOException, InterruptedException {
        String commentToDelete = "Comment Text 29";
        log("Check comment on all pages");
        findComment(commentToDelete);
        Thread.sleep(3000);
        log("Get line of comment");
        WebElement lineOfComment = driver.findElement(By.xpath("//*[@class='textcolumn'][contains(text(),'" + commentToDelete + "')]/parent::*"));
        log("Click on checkbox");
        lineOfComment.findElement(By.className("checkedcolumn")).findElement(By.xpath("input[@type='checkbox']")).click();
        log("Delete comment");
        driver.findElement(By.xpath("//input[@value='Delete']")).click();
        log("Accept deleting");
        driver.findElement(By.xpath("//button/span")).click();
        log("Check deleting of comment");
        Assert.assertFalse("Comment still is on page", findCommentBoolean(commentToDelete));
        log("Comment success deleting");
    }

    @After
    public void tearDown() throws IOException {
        log("Close driver");
        driver.quit();
    }

    private Boolean findCommentBoolean(String commentText) throws IOException, InterruptedException {
        int pageNumber = 1;
        while (!isElementPresent(By.xpath("//*[@class='textcolumn'][contains(text(),'" + commentText + "')]"))) {
            Thread.sleep(500);
            log("On page " + pageNumber + " resualt of looking for comment is: " + isElementPresent(By.xpath("//*[@class='textcolumn'][contains(text(),'" + commentText + "')]")));
            if (driver.findElement(By.className("webgrid-footer")).findElements(By.partialLinkText(">")).size() != 0) {
                driver.findElement(By.className("webgrid-footer")).findElement(By.partialLinkText(">")).click();
            } else {
                log("Comment is not on page");
                return false;
            }
            pageNumber++;
        }
        log("Comment is on page: " + pageNumber++);
        return true;
    }

    private void findComment(String commentText) throws IOException, InterruptedException {
        int pageNumber = 1;
        while (!isElementPresent(By.xpath("//*[@class='textcolumn'][contains(text(),'" + commentText + "')]"))) {
            Thread.sleep(500);
            log("On page " + pageNumber + " resualt of looking for comment is: " + isElementPresent(By.xpath("//*[@class='textcolumn'][contains(text(),'" + commentText + "')]")));
            driver.findElement(By.className("webgrid-footer")).findElement(By.partialLinkText(">")).click();
            pageNumber++;
        }
        log("Comment is on page: " + pageNumber++);
    }


    protected void log(String stringToLog) throws IOException {
        logger.log(stringToLog);
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void click(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public void type(String xpath, String text) {
        driver.findElement(By.xpath(xpath)).clear();
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }
}
