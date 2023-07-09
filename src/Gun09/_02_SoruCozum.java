package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SoruCozum extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("https://www.facebook.com/");

        MyFunc.Bekle(1);
        WebElement createAcoount= driver.findElement(By.linkText("Yeni hesap oluştur"));
        createAcoount.click();
        MyFunc.Bekle(1);

        WebElement name=driver.findElement(By.name("firstname"));
        name.sendKeys("Süreya");
        MyFunc.Bekle(1);

        WebElement surname=driver.findElement(By.name("lastname"));
        surname.sendKeys("Serim");
        MyFunc.Bekle(1);

        WebElement reEmail=driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(reEmail.isDisplayed()); //beklenen görülmemesi false olmalı
        System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());

        MyFunc.Bekle(1);
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("sureyyaserimm@gmail.com");
        MyFunc.Bekle(1);

        Assert.assertTrue(reEmail.isDisplayed());  //beklenen görünmesi true olmalı
        System.out.println("reEmail = " + reEmail.isDisplayed());
        reEmail.sendKeys("sureyyaserimm@gmail.com");
        MyFunc.Bekle(1);

        WebElement password=driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("sureyyaserim");

        WebElement webDay=driver.findElement(By.id("day"));
        Select day=new Select(webDay);
        day.selectByVisibleText("21");

        WebElement webMonth=driver.findElement(By.id("month"));
        Select month=new Select(webMonth);
//        month.selectByVisibleText("Şub");
        month.selectByValue("2");  //hem görünen haliyle hem de indexle seçilebilir.

        WebElement webYear=driver.findElement(By.id("year"));
        Select year=new Select(webYear);
        year.selectByVisibleText("1997");

        BekleKapat();

    }
}
