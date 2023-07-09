package Proje3;

import Utility.BaseDriver;
import org.junit.Test;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Test Case:5
//        ➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
//        ➢ ContactUs butonuna tıklattınız
//        ➢ Name, Email, Subject ve mesaj kısımlarını doldurun
//        ➢ Send butonuna tıklatın
//        ➢ Alert in görüldüğünü doğrulayın ve alert I kapatın

public class Test5 extends BaseDriver {
    @Test
    public void Test4() {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement contactUs= driver.findElement(By.xpath("//a[@class='contact']"));
        contactUs.click();

        WebElement name= driver.findElement(By.cssSelector("[id='sender_name']"));
        name.sendKeys("Grup4");

        WebElement mail= driver.findElement(By.cssSelector("[id='sender_email']"));
        mail.sendKeys("Grup4@gmail.com");

        WebElement subject= driver.findElement(By.cssSelector("[id='sender_subject']"));
        subject.sendKeys("Grup4 proje 3 çalışması");

        WebElement message= driver.findElement(By.cssSelector("[id='sender_message']"));
        message.sendKeys("Proje 3 çalışması 5.sorunun çözümü için çabalıyoruz. Mehmet alim bey uyudu ama :)");

        WebElement sendBtn= driver.findElement(By.cssSelector("[id='send_message_button']"));
        sendBtn.click();

        MyFunc.Bekle(2);

        String uyari = driver.switchTo().alert().getText();
        Assert.assertEquals(uyari,"Recaptcha didn't match");

        driver.switchTo().alert().accept();

       BekleKapat();


    }
}
