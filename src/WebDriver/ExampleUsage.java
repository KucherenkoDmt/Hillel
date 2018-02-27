package WebDriver;

import HomeWork.Log.ConsoleLogger;
import HomeWork.Log.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;

public class ExampleUsage {
    public static void main(String[] args) throws IOException {
        Logger logger = new ConsoleLogger();

        logger.log("Create webdriver instance");
        WebDriver driver = new ChromeDriver();

        logger.log("Navigate to Url - Google");
        driver.get("http://google.com");

        logger.log("Wait for title to be Google");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs("Google"));

        logger.log("Fill text to search input and submit");
        WebElement element = By.id("lst-ib").findElement(driver);
        element.sendKeys("Hillel");
        element.submit();

        logger.log("Wait for title to contain\"Hillel\"");
        wait.until(ExpectedConditions.titleContains("Hillel"));

        logger.log("get all result item");
        List<WebElement> list = driver.findElements(By.className("g"));


        logger.log("get first result item");
        WebElement firstResult = list.get(0);

        logger.log("get url element result item");
        WebElement secondResult = firstResult.findElement(By.className("_Rm"));

        logger.log("Check url element link is hillel link");
        wait.until(ExpectedConditions.textToBePresentInElement(secondResult, "https://ithillel.ua"));


        logger.log("Closing webdriver");
        driver.quit();

    }
}
