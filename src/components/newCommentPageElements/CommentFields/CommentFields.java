package components.newCommentPageElements.CommentFields;

import components.ElaementBaseClasses.CheckBox;
import components.ElaementBaseClasses.ElementBase;
import components.ElaementBaseClasses.Input;
import org.openqa.selenium.WebElement;

public class CommentFields extends ElementBase {
    public CommentFields(WebElement element) {
        super(element);
    }
    public Input commentText(){
        return new Input(getElement("//*[@id='Text']"));
    }
    public Input commentNumber(){
        return new Input(getElement("//*[@id='Number']"));
    }
    public CheckBox commentActive(){
        return new CheckBox(getElement("//input[@id='Active']"));
    }
}
