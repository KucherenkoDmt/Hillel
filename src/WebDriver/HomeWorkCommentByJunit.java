package WebDriver;

import HomeWork.Log.ConsoleLogger;
import HomeWork.Log.Logger;
import HomeWork.UrlBuilder.Url;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class HomeWorkCommentByJunit {


    WebDriver driver = new ChromeDriver();
    Logger logger = new ConsoleLogger();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Before
    public void setUp() throws IOException {
        log("Create url");
        Url urlOfComments = new Url.UrlBuilder("comments.azurewebsites.net").build();
        System.out.println(urlOfComments.getUrl());

        log("Navigate to Url ");
        driver.get(urlOfComments.getUrl());


    }

    @Test
    public void addComment() throws IOException, InterruptedException {
        int number = (int) (999 * Math.random());
        log("Get element \"New...\" and click");
        driver.findElement(By.xpath("//*[@id='command-navigation']/input[1]")).click();

        log("Add comment text");
        String commentText = "some text" + number;
        driver.findElement(By.id("Text")).sendKeys(commentText);

        log("Add original number");
        driver.findElement(By.id("Number")).sendKeys(number + "");

        log("Add 1 category");
        String categories = "Cat1";
        driver.findElement(By.xpath("//*[@class=\"categoryitem\"]/span[contains(text(),'" + categories + "')]/../*[@type]")).click();
        driver.findElement(By.name("CurSelect")).click();

        log("Click save");
        driver.findElement(By.xpath("//*[@id='editor-navigation']/input[1]")).click();
        Thread.sleep(2500);

        log("Click Return");
        driver.findElement(By.linkText("Return")).click();

        log("Check comment on all pages");
        int counter = 1;
        while (!isElementPresent(By.xpath("//*[@class='textcolumn'][contains(text(),'" + commentText + "')]"))) {
            counter++;
            Thread.sleep(500);
            driver.get("http://comments.azurewebsites.net/?page=" + counter);
        }
        log("Check comment's number");
        boolean namberAndCategories = false;
        String numberOfcomment = driver.findElement(By.xpath("//*[@class='textcolumn'][contains(text(),'" + commentText + "')]/../*[@class='numbercolumn']")).getText();
        int number2 = Integer.parseInt(numberOfcomment);
        String categoriesOfcomment = driver.findElement(By.xpath("//*[@class='textcolumn'][contains(text(),'" + commentText + "')]/../*[@class='categorycolumn']")).getText();
        namberAndCategories = (number == number2 && categories.equals(categoriesOfcomment));

        Assert.assertEquals("number is not the same", number, number2);
        Assert.assertEquals("categories is not the same", categories, categoriesOfcomment);

        log("Value of comments is the same: " + namberAndCategories);


    }

    @After
    public void tearDown() throws IOException {
        log("Close driver");
        driver.quit();
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
}
