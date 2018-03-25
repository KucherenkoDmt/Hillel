package WebDriver;

import org.openqa.selenium.WebElement;

public class Checkbox2 extends Element implements Interfases.Checkbox{

    public Checkbox2(WebElement element) {
        super(element);
    }

    @Override
    public void check() {
        if(!isChecked()){
            click();
        }
    }

    @Override
    public void unCheck() {
        if(isChecked()){
            click();
        }
    }

    @Override
    public boolean isChecked() {
        return getElement().isSelected();
    }
}
