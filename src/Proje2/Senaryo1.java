package Proje2;

//Senaryo 1: Kayıt oluşturma Testi
//        ➢ Siteye gidin
//        ➢ Register butonuna tıklayın
//        ➢ Kişisel bilgileri doldurun ve register butonuna tıklayın
//        ➢ Başarılı bir şekilde kaydolduğunuzu doğrulayınız

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo1 extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("http://demowebshop.tricentis.com/");

        WebElement register= driver.findElement(By.cssSelector("a[href='/register']"));
        register.click();

        WebElement gender= driver.findElement(By.id("gender-female"));
        gender.click();

        WebElement firstName= driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Sureya");

        WebElement lastName= driver.findElement(By.id("LastName"));
        lastName.sendKeys("Serim");

        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("como456@gmail.com");

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("abc123456");

        WebElement ConfirmPassword= driver.findElement(By.id("ConfirmPassword"));
        ConfirmPassword.sendKeys("abc123456");

        WebElement registerBtn= driver.findElement(By.id("register-button"));
        registerBtn.click();

        WebElement message=driver.findElement(By.cssSelector("[class='result']"));

        Assert.assertTrue(message.getText().equals("Your registration completed"));

       BekleKapat();
    }
}
