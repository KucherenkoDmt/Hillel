package WebDriver;

import HomeWork.Log.AbstractLogger;
import HomeWork.Log.ConsoleLogger;
import HomeWork.Log.Logger;
import HomeWork.UrlBuilder.Url;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class WebdriverHomeWork{
        public static void main(String[] args) throws IOException {
            Logger logger = new ConsoleLogger();

            logger.log("Create url");
            Url urlOfComments = new Url.UrlBuilder("comments.azurewebsites.net").build();
            System.out.println(urlOfComments.getUrl());

            logger.log("Create webdriver instance");
            WebDriver driver = new FirefoxDriver();

            logger.log("Navigate to Url ");
            driver.get(urlOfComments.getUrl());


        }
}
