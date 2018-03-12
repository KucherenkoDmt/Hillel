package WebDriver;


import HomeWork.Log.ConsoleLogger;
import HomeWork.Log.Logger;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;

public class TastJunit {
    Logger logger = new ConsoleLogger();
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);



    @Before
    public void setUp() throws IOException {
        log("before part start");
        log("Navigate to Url - Google");
        driver.get("http://google.com");

        log("Wait for title to be Google");
        wait.until(ExpectedConditions.titleIs("Google"));
    }

    @Test
    public void testExample() {
        Assert.assertEquals("check that itegers are same", 6, 3 + 3);
    }

 /*   @Test(timeout = 60000)
    public void testExample1() {
        Assert.assertEquals("ssd", "sdad");
        Assert.fail();
    }

*/
    @Test
    public void testForGoogle() throws IOException {

        log("Fill text to search input and submit");
        WebElement element = By.id("lst-ib").findElement(driver);
        element.sendKeys("Hillel");
        element.submit();

        log("Wait for title to contain\"Hillel\"");
        wait.until(ExpectedConditions.titleContains("Hillel"));

        log("get all result item");
        List<WebElement> list = driver.findElements(By.className("g"));

        log("get first result item");
        WebElement firstResult = list.get(0);

      //  logger.log("get url element result item");
     //   WebElement secondResult = firstResult.findElement(By.tagName("site"));

        log("Check url element link is hillel link");
        Assert.assertEquals("some message", firstResult, "https://ithillel.ua");
        // wait.until(ExpectedConditions.textToBePresentInElement(secondResult, "https://ithillel.ua"));


        log("Closing webdriver");
        driver.quit();
    }

    @After
    public void tearDown() throws IOException {
       log("after");
        log("close webdriver");
driver.quit();
    }

    private void log(String  text) throws IOException {
        logger.log(text);
    }
    @AfterClass
    protected void setUp1(){

    }
}
