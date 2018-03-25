package components.implementations.CategoryButtons;

import components.implementations.ElementBase;
import org.openqa.selenium.WebElement;

public class CategoryButtons extends ElementBase {
    public CategoryButtons(WebElement element) {
        super(element);
    }

    public ElementBase add() {
        return new ElementBase(getElement("//input[@name='CurSelect']"));
    }

    public ElementBase remove() {
        return new ElementBase(getElement("//input[@name='CurUnSelectBtn']"));
    }

    public ElementBase addAll() {
        return new ElementBase(getElement("//input[@name='AllSelect']"));
    }

    public ElementBase removeAll() {
        return new ElementBase(getElement("//input[@name='AllUnSelectBtn']"));
    }
}
