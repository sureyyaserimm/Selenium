package Odevler.CSSselector;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test2 extends BaseDriver {

    @Test
    public void Test2() {
        driver.get("https://demo.applitools.com/");

        WebElement userName = driver.findElement(By.cssSelector("[id='username']"));
        userName.sendKeys("ttechno@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("[id='password']"));
        password.sendKeys("techno123.");

        WebElement signIn = driver.findElement(By.cssSelector("[id='log-in']"));
        signIn.click();

        WebElement time=driver.findElement(By.cssSelector("[id='time']"));

        Assert.assertTrue(time.getText().equals("Your nearest branch closes in: 30m 5s"));

        BekleKapat();
    }
}
