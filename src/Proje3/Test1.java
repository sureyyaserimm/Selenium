package Proje3;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

//Test Case 1:
//        ➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
//        ➢ E-book add to cart butonuna tıklatınız.
//        ➢ Add promo code butonuna tıklatıp veri giriniz.
//        ➢ Apply butonuna tıklayınız.
//        ➢ Invalid promo code yazısının görüldüğünü doğrulayınız

public class Test1 extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement eBook = driver.findElement(By.cssSelector("div[class='column all_tag'] :nth-child(2)"));
        eBook.click();

        WebElement addToCart = driver.findElement(By.xpath("//button[@class='view_product']"));
        addToCart.click();
        MyFunc.Bekle(2);

        driver.switchTo().frame(5);
        WebElement addProm = driver.findElement(By.cssSelector("div[class='Actions']>:nth-child(2)"));
        addProm.click();

        WebElement sendPromo = driver.findElement(By.xpath("//input[@class='Promo-Code-Value']"));
        sendPromo.sendKeys("12345");

        WebElement apply = driver.findElement(By.xpath("//button[@class='Promo-Apply']"));
        apply.click();

        MyFunc.Bekle(2);

        WebElement uyari = driver.findElement(By.cssSelector("div[id='SnackBar']>span"));

        Assert.assertEquals(uyari.getText(), "Invalid promo code");

        BekleKapat();

    }
}
