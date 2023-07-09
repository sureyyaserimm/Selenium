package Proje2;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo3 extends BaseDriver {
    @Test
    public void Test3() {
        driver.get("http://demowebshop.tricentis.com/");

        WebElement login = driver.findElement(By.cssSelector("a[href='/login']"));
        login.click();

        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("como45@gmail.com");

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("abc123456");

        WebElement loginBtn= driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        loginBtn.click();

        WebElement logout = driver.findElement(By.cssSelector("a[href='/logout']"));

        Assert.assertTrue(logout.getText().equals("Log out"));

        BekleKapat();


    }
}
