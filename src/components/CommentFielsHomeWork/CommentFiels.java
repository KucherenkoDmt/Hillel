package components.CommentFielsHomeWork;

import components.CheckBox;
import components.ElementBase;
import components.Input;
import org.openqa.selenium.WebElement;

public class CommentFiels extends ElementBase {
    public CommentFiels(WebElement element) {
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
