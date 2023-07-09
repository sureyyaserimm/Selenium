package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionClickTest extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("https://demoqa.com/buttons");
        WebElement element=driver.findElement(By.xpath("//button[text()='Click Me']"));
        //element.click;

        Actions actions=new Actions(driver); //web sayfası aksiyonlara açıldı.
        //actions.moveToElement(element).click().build().perform();

        Action action=actions.moveToElement(element).click().build();
        System.out.println("Action has been done.");

        MyFunc.Bekle(4);
        action.perform(); //aksiyonu gerçekleştir, işleme al, uygula, icra et
        System.out.println("Make an action");

        BekleKapat();


    }
}
