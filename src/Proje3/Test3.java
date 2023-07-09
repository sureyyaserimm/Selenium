package Proje3;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Test Case:3
//        ➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
//        ➢ E-book add to cart butonuna tıklatınız.
//        ➢ Pay using debit card a tıklatınız.
//        ➢ Card numarasına “1111 1111 1111 1111” giriniz
//        ➢ “Your card number is invalid” mesajının görüldüğünü doğrulayınız.

public class Test3 extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement eBook = driver.findElement(By.cssSelector("div[class='column all_tag'] :nth-child(2)"));
        eBook.click();

        WebElement addToCart = driver.findElement(By.xpath("//button[@class='view_product']"));
        addToCart.click();
        MyFunc.Bekle(2);

        driver.switchTo().frame(5);
        WebElement debitCard = driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        debitCard.click();

        MyFunc.Bekle(2);
        WebElement iFrame=driver.findElement(By.xpath("//div[@class='__PrivateStripeElement']//iframe"));
        MyFunc.Bekle(2);

        driver.switchTo().frame(iFrame);
        WebElement cardNumber= driver.findElement(By.xpath("//input[@name='cardnumber']"));
        cardNumber.sendKeys("1111 1111 1111 1111");

        MyFunc.Bekle(2);

        driver.switchTo().parentFrame();
        WebElement uyari = driver.findElement(By.cssSelector("div[id='SnackBar']>span"));
        Assert.assertEquals(uyari.getText(), "Kart numaranız geçersiz.");

        BekleKapat();
    }
}
