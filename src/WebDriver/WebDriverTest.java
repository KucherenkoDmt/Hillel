package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class WebDriverTest {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.partialLinkText("New...")).click();

    }
}
