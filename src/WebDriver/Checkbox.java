package WebDriver;

import org.openqa.selenium.WebElement;

public class Checkbox extends Element implements Interfases.Checkbox{

    public Checkbox(WebElement element) {
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
