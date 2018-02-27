package WebDriver;

import HomeWork.Log.AbstractLogger;
import HomeWork.Log.ConsoleLogger;
import HomeWork.Log.Logger;
import HomeWork.UrlBuilder.Url;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class WebdriverHomeWork extends AbstractLogger {
    public static void main(String[] args) throws IOException {
       WebdriverHomeWork webdriverHomeWork = new WebdriverHomeWork();
       webdriverHomeWork.homeWork();
    }

    public void homeWork() throws IOException {
        log("Create url");
        Url urlOfComments = new Url.UrlBuilder("comments.azurewebsites.net").build();
        System.out.println(urlOfComments.getUrl());

        log("Create webdriver instance");
        WebDriver driver = new ChromeDriver();

        log("Navigate to Url ");
        driver.get(urlOfComments.getUrl());
    }

    @Override
    protected void doLogging(String stringToLog) throws IOException {
        System.out.println(stringToLog);
    }
}
