package Proje2;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo4 extends BaseDriver {
    @Test
    public void Test4() {
        driver.get("http://demowebshop.tricentis.com/");

        WebElement login = driver.findElement(By.cssSelector("a[href='/login']"));
        login.click();

        WebElement email= driver.findElement(By.id("Email"));
        email.sendKeys("como4567@gmail.com");

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("abc123456");

        WebElement loginBtn= driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        loginBtn.click();

        WebElement error = driver.findElement(By.cssSelector("[class='validation-summary-errors']>span"));

        Assert.assertTrue(error.getText().contains("Login was unsuccessful. Please correct the errors and try again."));

        BekleKapat();

    }
}
