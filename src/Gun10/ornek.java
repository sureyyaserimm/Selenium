package Gun10;


import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ornek extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://demoqa.com/auto-complete");

        WebElement element=driver.findElement(By.id("autoCompleteSingleInput"));
        //element.sendKeys("Ahmet");

        //shift+a büyük A ->Ahmet
        Actions actions=new Actions(driver);

        Action action=actions
                .moveToElement(element)
                .click()
                .keyDown(Keys.SHIFT)    //shift etkinleştirildi
                .sendKeys("a")          //shift+a=A
                .keyUp(Keys.SHIFT)      //shift etkisizleştirildi
                .sendKeys("hmet")       //hmet gönderilir.
                .build();

        MyFunc.Bekle(2);

        action.perform();

        MyFunc.Bekle(2);

        BekleKapat();


    }
}
