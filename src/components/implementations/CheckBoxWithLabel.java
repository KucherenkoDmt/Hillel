package components.implementations;


import components.CheckBox;
import components.ElementBase;
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
