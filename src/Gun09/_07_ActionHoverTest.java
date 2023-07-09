package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionHoverTest extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.hepsiburada.com/");

        WebElement element=driver.findElement(By.xpath("//span[text()='Moda']"));
        MyFunc.Bekle(2);

        Actions actions=new Actions(driver);
        Action action=actions.moveToElement(element).build();
        action.perform();

        BekleKapat();

    }
}
