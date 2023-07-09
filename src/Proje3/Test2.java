package Proje3;

//Test Case:2
//        ➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
//        ➢ E-book add to cart butonuna tıklatınız.
//        ➢ Pay using debit card a tıklatınız.
//        ➢ Pay butonuna tıklatınız.
//        ➢ Invalid Email, Invalid Email, invalid billing name mesajlarının görüldüğünü doğrulayınız.
//

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test2 extends BaseDriver {

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

        WebElement payButton=driver.findElement(By.xpath("//button[@class='Pay-Button']"));
        payButton.click();
        MyFunc.Bekle(2);

        WebElement uyari = driver.findElement(By.cssSelector("div[id='SnackBar']>span"));

        Assert.assertEquals(uyari.getText(), "Invalid Email\nInvalid Email\nInvalid Billing Name");

        BekleKapat();

    }
}
