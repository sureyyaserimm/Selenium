package Proje1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Case1 extends BaseDriver2 {

    @Test
    public void Test1() {
        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement signUp = driver.findElement(By.xpath("//*[text()='Sign Up']"));
        signUp.click();

        WebElement firstName = driver.findElement(By.cssSelector("[id='FirstName']"));
        firstName.sendKeys("Sureya");

        WebElement surname = driver.findElement(By.cssSelector("[id='Surname']"));
        surname.sendKeys("Serim");

        WebElement email = driver.findElement(By.cssSelector("[id='E_post']"));
        email.sendKeys("sureyyaserimm@gmail.com");

        WebElement mobile = driver.findElement(By.cssSelector("[id='Mobile']"));
        mobile.sendKeys("+15554443321");

        WebElement userName = driver.findElement(By.cssSelector("[id='Username']"));
        userName.sendKeys("sureyaserim");

        WebElement password = driver.findElement(By.cssSelector("[id='Password']"));
        password.sendKeys("123456");

        WebElement confirmPassword = driver.findElement(By.cssSelector("[id='ConfirmPassword']"));
        confirmPassword.sendKeys("123456");

        WebElement submit = driver.findElement(By.cssSelector("[id='submit']"));
        submit.click();

        WebElement register=driver.findElement(By.xpath("//*[text()='Registration Successful']"));

        Assert.assertTrue(register.getText().equals("Registration Successful"));

        WaitClose();

    }
}
