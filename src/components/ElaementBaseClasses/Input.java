package components.ElaementBaseClasses;

import components.ElaementBaseClasses.ElementBase;
import org.openqa.selenium.WebElement;

public class Input extends ElementBase implements components.InterfasesForElementBase.Input {
    public Input(WebElement element) {
        super(element);
    }

    @Override
    public void typeText(String text) {
       // clean();
        getWebElement().sendKeys(text);
    }

    @Override
    public void addText(String text) {
        getWebElement().sendKeys(text);
    }

    @Override
    public void clean() {
        getWebElement().clear();
    }

    @Override
    public void submitText(String text) {
    }
}
