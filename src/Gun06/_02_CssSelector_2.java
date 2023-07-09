package Gun06;

import Utility.BaseDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_CssSelector_2 extends BaseDriver {

    // 1-Açılan sayfadaki kutucuğa mesajınızı yazını.
    // 2-Butona tıklatınız
    // 3-Butona basıldığında mesajınızın sayfada göründüğünü test ediniz.

    @Test
    public void Test1() {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String message = "Süreya Serim";
        WebElement txtBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys(message);

        WebElement clickBox = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        clickBox.click();

        WebElement result = driver.findElement(By.cssSelector("[id='display']"));

//        if(result.getText().equals("Süreya Serim"))
//            System.out.println("Test passed!!,");
//        else
//            System.out.println("Test failed!!");

        Assert.assertTrue("aranılan mesaj bulunamadı",result.getText().equals(message)); //Verilen değer ture mu?
        //Hata yoksa içindeki değer true ise bilgi vermez.

        BekleKapat();


    }

}

