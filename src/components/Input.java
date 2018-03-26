package components;

import org.openqa.selenium.WebElement;

public class Input extends ElementBase implements components.InterfasesForElementBase.Input {
    public Input(WebElement element) {
        super(element);
    }

    @Override
    public void typeText(String text) {
        getWebElement().sendKeys(text);
    }

    @Override
    public void addText(String text) {
    }

    @Override
    public void clean() {
    }

    @Override
    public void submitText(String text) {
    }
}
