package components.implementations.CategoryButtons;

import components.ElementBase;
import components.implementations.CheckBoxWithLabel;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CategoryBlocks extends ElementBase {
    public CategoryBlocks(WebElement element) {
        super(element);
    }

    public ElementBase headerLabel(){
        return new ElementBase(getElement("//div[@class='category-list-title']"));
    }
    public List<CheckBoxWithLabel> categories(){
        List<WebElement> webElements = getElements("//div");
        List<CheckBoxWithLabel> toReturn = new ArrayList<>();
        for(WebElement webElement : webElements){
            toReturn.add(new CheckBoxWithLabel(webElement));
        }
        return toReturn;
    }
}
