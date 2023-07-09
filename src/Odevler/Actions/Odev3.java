package Odevler.Actions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Odev3 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        Actions actions = new Actions(driver);

        List<WebElement> leftBoxes = driver.findElements(By.cssSelector("[id='dhtmlgoodies_listOfItems']>div>ul>li"));
        List<WebElement> countries = driver.findElements(By.cssSelector("[id='dhtmlgoodies_mainContainer']>div>ul"));

        MyFunc.Bekle(2);
        for (WebElement e : leftBoxes) {
            for (WebElement f : countries) {
//                System.out.println("ee"+e.getAttribute("groupid"));
//                System.out.println("ff"+f.getAttribute("id"));
                if (e.getAttribute("groupid").equals(f.getAttribute("id"))) {
                    actions.clickAndHold(e).build().perform();
                    MyFunc.Bekle(1);
                    actions.moveToElement(f).release().build().perform();
                }

            }

        }

        Duration duration=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(duration);
        driver.switchTo().alert().accept();
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.alertIsPresent());
//        driver.switchTo().alert().accept();

        BekleKapat();
    }
}


