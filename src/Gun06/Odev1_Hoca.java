package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1_Hoca extends BaseDriver {
    // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    // 2- Business i çekleyin.
    // 3- discover XYZ ye tıklatın ve online Advertising i seçin
    // 4- Every day i seçin
    // 5- Good u seçin
    // 6- using XYZ yi tıklatın ve 3.seçeneği seçin
    // css selector


    @Test
    public void Test1() {

        driver.get("https://formsmarts.com/form/yu?mode=h5");
        MyFunc.Bekle(1);

        WebElement business = driver.findElement(By.cssSelector("input[type='radio'][value='Business']"));
        business.click();
        MyFunc.Bekle(1);

        WebElement discover = driver.findElement(By.cssSelector("select[id$='_4588']"));
        discover.click();
        MyFunc.Bekle(1);

        WebElement online = driver.findElement(By.cssSelector("[value='Online Advertising']"));
        online.click();
        MyFunc.Bekle(1);

        WebElement everyday = driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        everyday.click();
        MyFunc.Bekle(1);

        WebElement good = driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        good.click();
        MyFunc.Bekle(1);

        WebElement howLong = driver.findElement(By.cssSelector("select[id$='_4597']"));
        howLong.click();
        MyFunc.Bekle(1);

        WebElement month = driver.findElement(By.cssSelector("select[id$='_4597']>:nth-child(4)"));
        month.click();
        howLong.click();

        BekleKapat();

    }

}
