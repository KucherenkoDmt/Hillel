package WebDriver;

import HomeWork.Log.AbstractLogger;
import HomeWork.Log.ConsoleLogger;
import HomeWork.Log.Logger;
import HomeWork.UrlBuilder.Url;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

import java.io.IOException;

public class WebdriverHomeWork extends AbstractLogger {
    public static void main(String[] args) throws IOException {
        WebdriverHomeWork webdriverHomeWork = new WebdriverHomeWork();
        webdriverHomeWork.webDriverhomeWork();
    }

    public void webDriverhomeWork() throws IOException {
        log("Create url");
        Url urlOfComments = new Url.UrlBuilder("comments.azurewebsites.net").build();
        System.out.println(urlOfComments.getUrl());

        log("Create webdriver instance");
        WebDriver driver = new ChromeDriver();

        log("Navigate to Url ");
        driver.get(urlOfComments.getUrl());

        log("get element \"New...\" and click");
        driver.findElement(By.xpath("//*[@id='command-navigation']/input[1]")).click();

        log("Add comment text");
        String comentText = "some text"+(int)Math.random();
        driver.findElement(By.id("Text")).sendKeys(comentText);

        log("Add original number");
        int number = (int) (999*Math.random());
        driver.findElement(By.id("Number")).sendKeys(number+"");

        log("Add 1 category");
        driver.findElement(By.xpath("//*[@class=\"categoryitem\"]/span[contains(text(),'Cat1')]/../*[@type]")).click();
        driver.findElement(By.name("CurSelect")).click();

        log("click save");
        driver.findElement(By.xpath("//*[@id='editor-navigation']/input[1]")).click();

        log("Click Return");
        driver.findElement(By.linkText("Return")).click();

        log("Check comment");


        log("Closing webdriver");
       // driver.quit();
    }

    @Override
    protected void doLogging(String stringToLog) throws IOException {
        System.out.println(stringToLog);
    }
}
