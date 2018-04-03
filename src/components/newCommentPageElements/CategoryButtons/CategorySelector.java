package components.newCommentPageElements.CategoryButtons;

import components.ElaementBaseClasses.ElementBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CategorySelector extends ElementBase {
    public CategorySelector(WebElement element) {
        super(element);
    }

    public CategoryBlocks availableCats(){
        List<WebElement> blocks = getElements("//div[@class='categories']");
        WebElement availableCatsWebEl =
         blocks.stream().filter(i -> i.findElement(By.xpath("//*[@class='category-list-title']")).
                 getText().contains("Available")).findAny().get();
        return new CategoryBlocks(availableCatsWebEl);
    }

    public CategoryButtons selectedButtons(){
        WebElement element = getElement("//div[@class='selectbuttons']");
        return new CategoryButtons(element);
    }

    public CategoryBlocks selectCat(){
        List<WebElement> blocks = getElements("//div[@class='categories']");
        WebElement availableCatsWebEl =
                blocks.stream().filter(i -> i.findElement(By.xpath("//[@class='category-list-title']")).
                        getText().contains("Selected")).findAny().get();
        return new CategoryBlocks(availableCatsWebEl);
    }
}
