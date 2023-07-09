package Proje3;

import Utility.BaseDriver;
import org.junit.Test;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*Test Case: 4
➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
➢ E-book add to cart butonuna tıklatınız.
➢ Pay using debit card a tıklatınız.
➢ Email, confirm Email, name, telefon, company, Card number(“4242 4242 4242 4242” ) giriniz, expdate, cvc kodu bilgilerini doldurunuz
➢ Pay butonuna tıklayınız
➢ “Your order is confirmed. Thank you!” mesajının görüldüğünü doğrulayınız */

public class Test4 extends BaseDriver {

    @Test
    public void Test4(){

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement eBook = driver.findElement(By.cssSelector("div[class='column all_tag'] :nth-child(2)"));
        eBook.click();

        WebElement addToCart = driver.findElement(By.xpath("//button[@class='view_product']"));
        addToCart.click();

        driver.switchTo().frame(5);
        WebElement debitCard = driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        debitCard.click();

        WebElement Email=driver.findElement(By.xpath("//p[@class='Billing-Email Inline MarginRight']//input[@autocomplete='email']"));
        Email.sendKeys("tb@gmail.com");

        WebElement confirmEmail=driver.findElement(By.xpath("//p[@class='Billing-Email-Confirm Inline']//input[@autocomplete='email']"));
        confirmEmail.sendKeys("tb@gmail.com");

        WebElement nameOnCard=driver.findElement(By.xpath("//p[@class='Billing-Name Inline MarginRight']//input[@autocomplete='name']"));
        nameOnCard.sendKeys("Talha Balaban");

        WebElement phone=driver.findElement(By.xpath("//p[@class='Billing-Phone Inline']//input[@autocomplete='phone']"));
        phone.sendKeys("05367083944");

        WebElement company=driver.findElement(By.xpath("//p[@class='Billing-Company']//input[@autocomplete='company']"));
        company.sendKeys("STS Software");

        MyFunc.Bekle(1);
        WebElement iFrame=driver.findElement(By.xpath("//div[@class='__PrivateStripeElement']//iframe"));
        MyFunc.Bekle(1);

        driver.switchTo().frame(iFrame);
        WebElement cardNumber= driver.findElement(By.xpath("//input[@name='cardnumber']"));
        cardNumber.sendKeys("4242 4242 4242 4242");

        WebElement tarih= driver.findElement(By.xpath("//input[@name='exp-date']"));
        tarih.sendKeys("1224");

        WebElement csv= driver.findElement(By.xpath("//input[@name='cvc']"));
        csv.sendKeys("777");

        driver.switchTo().parentFrame();

        WebElement ode = driver.findElement(By.cssSelector("button[class='Pay-Button']"));
        ode.click();
        MyFunc.Bekle(10);

        WebElement uyari = driver.findElement(By.cssSelector("p[class='confirme_text']>span"));
        Assert.assertEquals(uyari.getText(), "Talha, your order is confirmed. Thank you!");

        BekleKapat();


    }
}
