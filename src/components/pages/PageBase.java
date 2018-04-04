package components.pages;

import components.InterfasesForElementBase.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageBase implements Getter {
    private WebDriver driver;

    private String url = "comments.azurewebsites.net";
    private String title = "Index";

    public PageBase(WebDriver driver){
        this.driver=driver;
    }

    public String getExpectedUrl() {
        return url;
    }
    public String getExpectedTitle() {
        return title;
    }

    @Override
    public List<WebElement> getElements(String xpath) {
        return driver.findElements(By.xpath(xpath));
    }

    @Override
    public WebElement getElement(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }
    public boolean checkPageIsOpened(){
        return driver.getCurrentUrl().contains(getExpectedUrl()) && driver.getTitle().contains(getExpectedTitle());
    }
}
