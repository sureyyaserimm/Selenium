package Gun11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */

public class _03_FillingFormTask extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name= driver.findElement(By.xpath("//input[@class='form-control']"));
        name.sendKeys("Sureya");

        WebElement comment= driver.findElement(By.xpath("//textarea[@class='form-control']"));
        comment.sendKeys("I am learning testing with Selenium");

        WebElement submit= driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        submit.click();

        // imlicitlyWait elemanın locator bulması süresiyle ilgili buradaki zaten elemanlar hemen bulunuyor
        // burada kriter bulunan elemanın görünen yazısının oluşma süresi
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // findElement

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.xpath("//div[@id='submit-control']"),"Form submited Successfully!"));

        WebElement text= driver.findElement(By.xpath("//div[@id='submit-control']"));
        Assert.assertEquals("Form submited Successfully!",text.getText());

        BekleKapat();




    }
}
