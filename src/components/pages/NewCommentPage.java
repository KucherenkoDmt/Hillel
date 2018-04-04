package components.pages;

import components.newCommentPageElements.CommentFields.CommentFields;
import components.newCommentPageElements.CategoryButtons.CategorySelector;
import components.newCommentPageElements.HeadersOfNewCommentPage.HeaderButtonsOfNewCommentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCommentPage extends PageBase{
    public NewCommentPage(WebDriver driver) {
        super(driver);
    }

    private String relativePath = "/Editor";

    public CategorySelector selector(){
        WebElement selectorWebElement = getElement("//div[@id='categoryselector']");
        return new CategorySelector(selectorWebElement);
    }

    public CommentFields form(){
        return new CommentFields(getElement("//div[@id='commentfields']"));
    }

    public HeaderButtonsOfNewCommentPage headerButtons(){
        return new HeaderButtonsOfNewCommentPage(getElement("//div[@id='editor-navigation']"));
    }


    @Override
    public String getExpectedUrl() {
        return super.getExpectedUrl() + this.relativePath;
    }
    /*public boolean checkPageIsOpened(){
        return super.driver.getCurrentUrl().contains(getExpectedUrl());
    }*/
}
