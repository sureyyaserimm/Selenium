package Odevler.CSSselector;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test1 extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("http://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.cssSelector("[id='userName']"));
        fullName.sendKeys("Automation");

        WebElement mail = driver.findElement(By.cssSelector("[id='userEmail']"));
        mail.sendKeys("Testing@gmail.com");

        WebElement currentAddress = driver.findElement(By.cssSelector("[id='currentAddress']"));
        currentAddress.sendKeys("Testing Current Address");

        WebElement permanentAddress = driver.findElement(By.cssSelector("[id='permanentAddress']"));
        permanentAddress.sendKeys("Testing Permanent Address");

        WebElement submit = driver.findElement(By.cssSelector("[id='submit']"));
        submit.click();

        WebElement fullName2 = driver.findElement(By.cssSelector("[id='name']"));

        WebElement email2 = driver.findElement(By.cssSelector("[id='email']"));

        Assert.assertTrue(fullName2.getText().contains("Automation"));

        Assert.assertTrue(email2.getText().contains("Testing"));

        BekleKapat();
    }
}
