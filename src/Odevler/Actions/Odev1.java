package Odevler.Actions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Odev1 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        Actions actions = new Actions(driver);

        List<WebElement> countries = driver.findElements(By.xpath("//*[@id='questionDiv']/div[@class='dragDropSmallBox']"));
        List<WebElement> cities = driver.findElements(By.xpath("//*[@id='answerDiv']/div[@class='dragDropSmallBox']"));


        MyFunc.Bekle(3);
        for (WebElement e : countries) {
            for (WebElement f : cities) {
                if (e.getAttribute("id").substring(1).equals(f.getAttribute("id").substring(1))) {
                    actions.clickAndHold(f).build().perform();
                    MyFunc.Bekle(1);
                    actions.moveToElement(e).release().build().perform();
                }

            }

        }

        BekleKapat();
    }
}
