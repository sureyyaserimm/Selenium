package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionRightClickTest extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://demoqa.com/buttons");

        WebElement element=driver.findElement(By.id("rightClickBtn"));
        MyFunc.Bekle(2);

        Actions actions=new Actions(driver);
        Action action=actions.moveToElement(element).contextClick().build();
        action.perform();

        //yukarıdaki işlemin daha uzun hali
        //actions.moveToElement(element).contextClick().build().perform();
        //new Actions(driver).contextClick(element).build().perform();

        BekleKapat();
    }
}
