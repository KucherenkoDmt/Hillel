package WebDriver;

import HomeWork.Log.AbstractLogger;
import HomeWork.UrlBuilder.Url;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import javax.xml.bind.Element;
import java.io.IOException;

public class WebdriverHomeWork extends AbstractLogger {
    WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws IOException {
        WebdriverHomeWork webdriverHomeWork = new WebdriverHomeWork();
        webdriverHomeWork.webDriverhomeWork();
    }

    public void webDriverhomeWork() throws IOException {
        log("Create url");
        Url urlOfComments = new Url.UrlBuilder("comments.azurewebsites.net").build();
        System.out.println(urlOfComments.getUrl());

        log("Navigate to Url ");
        driver.get(urlOfComments.getUrl());

        log("Get element \"New...\" and click");
        driver.findElement(By.xpath("//*[@id='command-navigation']/input[1]")).click();

        log("Add comment text");
        int number = (int) (999 * Math.random());
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

        log("Click Return");
        driver.findElement(By.linkText("Return")).click();

        log("Check comment on all pages");
        int counter = 1;
        while (!isElementPresent(By.xpath("//*[@class='textcolumn'][contains(text(),'" + commentText + "')]"))) {
            counter++;
            driver.get("http://comments.azurewebsites.net/?page=" + counter);
        }
        log("Check comment's number");
        boolean namberAndCategories = false;
        String numberOfcomment = driver.findElement(By.xpath("//*[@class='textcolumn'][contains(text(),'" + commentText + "')]/../*[@class='numbercolumn']")).getText();
        int number2 = Integer.parseInt(numberOfcomment);
        String categoriesOfcomment = driver.findElement(By.xpath("//*[@class='textcolumn'][contains(text(),'" + commentText + "')]/../*[@class='categorycolumn']")).getText();
        namberAndCategories = (number == number2 && categories.equals(categoriesOfcomment));

        log("Value of comments is the same: " + namberAndCategories);

        log("Close driver");
         driver.quit();
    }

    @Override
    protected void doLogging(String stringToLog) throws IOException {
        System.out.println(stringToLog);
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
