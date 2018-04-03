package components.newCommentPageElements.HeadersOfNewCommentPage;

import components.ElaementBaseClasses.ElementBase;
import org.openqa.selenium.WebElement;

public class HeaderButtonsOfNewCommentPage extends ElementBase {

    public HeaderButtonsOfNewCommentPage(WebElement element) {
        super(element);
    }

    public ElementBase refreshButton() {
        return new ElementBase(getElement("//a[contains(@href,'Refresh')]"));
    }
    public ElementBase saveButton() {
        return new ElementBase(getElement("//input[@value='Save']"));
    }
    public ElementBase saveAndReturnButton() {
        return new ElementBase(getElement("//input[@value='Save & Return']"));
    }
    public ElementBase returnButton() {
        return new ElementBase(getElement("//div[@id='logindisplay']/a"));
    }

}
