package Gun10;


import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

    public class _03_YonTuslariSecim extends BaseDriver {

        @Test
        public void Test1(){

            driver.get("https://demoqa.com/auto-complete");

            WebElement element= driver.findElement(By.id("autoCompleteSingleInput"));

            Actions actions=new Actions(driver);

            Action action=actions.moveToElement(element).click().sendKeys("b").build();
            action.perform();
            MyFunc.Bekle(2);

            Action action1=actions.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
            action1.perform();

            MyFunc.Bekle(2);

            BekleKapat();


    }


}
