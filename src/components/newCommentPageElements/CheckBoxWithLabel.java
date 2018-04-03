package components.newCommentPageElements;


import components.ElaementBaseClasses.CheckBox;
import components.ElaementBaseClasses.ElementBase;
import components.InterfasesForElementBase.Checkbox;
import org.openqa.selenium.WebElement;

public class CheckBoxWithLabel extends ElementBase {
    public CheckBoxWithLabel(WebElement element) {
        super(element);
    }

    public Checkbox checkBox(){
        return new CheckBox(getElement("//input[@type='checkbox']"));
    }
    public ElementBase label(){
        return new ElementBase(getElement("//span"));
    }
}
