package Odevler.Actions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

import java.util.List;

public class Odev2 extends BaseDriver {

    @Test
    public void Test2() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        Actions actions = new Actions(driver);

        List<WebElement> boxes=driver.findElements(By.cssSelector("[id='dhtmlgoodies_mainContainer']>div"));
        List<WebElement> students=driver.findElements(By.cssSelector("[id='allItems']>li"));

        for (WebElement b : boxes) {
            String strHeight = b.getCssValue("height");
            int height = Integer.parseInt(strHeight.replaceAll("[^0-9]", ""));

            while (height >= 29 && students.size() > 0) {
                actions.clickAndHold(students.get(0)).perform();
                MyFunc.Bekle(1);
                actions.moveToElement(b).release().perform();
                students.remove(students.get(0));
                height = height - 29;
            }
        }
        BekleKapat();







    }
}
