package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionDragandDropTest extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions actions=new Actions(driver);

        MyFunc.Bekle(3);
        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norway=driver.findElement(By.id("box101"));

        //1.yöntem
        actions.dragAndDrop(oslo,norway).build().perform(); //osluyu norwaya at

        //2.yöntem
        actions.clickAndHold(oslo).build().perform();  //osloyu tıklat ve al
        actions.moveToElement(norway).release().build().perform(); //norwayin üzerine git ve bırak

        BekleKapat();

    }
}
