package Proje1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Case2 extends BaseDriver2{

    @Test
    public void Test2() {
        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement login = driver.findElement(By.xpath("//*[text()='Login']"));
        login.click();

        WebElement userName = driver.findElement(By.cssSelector("[id='Username']"));
        userName.sendKeys("sureyaserim");

        WebElement password = driver.findElement(By.cssSelector("[id='Password']"));
        password.sendKeys("123456");

        WebElement loginBtn = driver.findElement(By.cssSelector("[name='login']"));
        loginBtn.click();

        WebElement register=driver.findElement(By.cssSelector("div>h3"));

        Assert.assertTrue(register.getText().contains("Welcome"));

        WaitClose();
    }
}
