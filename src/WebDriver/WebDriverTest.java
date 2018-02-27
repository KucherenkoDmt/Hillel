package WebDriver;

import HomeWork.Log.ConsoleLogger;
import HomeWork.Log.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.log.Log;

import java.io.IOException;

import static com.sun.webkit.perf.WCFontPerfLogger.log;

public class WebDriverTest {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.partialLinkText("New...")).click();

    }
}
