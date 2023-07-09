package Proje1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Case3 extends BaseDriver2 {

    @Test
    public void Test3() {
        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement login = driver.findElement(By.xpath("//*[text()='Login']"));
        login.click();

        WebElement userName = driver.findElement(By.cssSelector("[id='Username']"));
        userName.sendKeys("sureyaserim");

        WebElement password = driver.findElement(By.cssSelector("[id='Password']"));
        password.sendKeys("123456");

        WebElement loginBtn = driver.findElement(By.cssSelector("[name='login']"));
        loginBtn.click();

        WebElement createNew = driver.findElement(By.xpath("//*[text()='Create New']"));
        createNew.click();

        WebElement name = driver.findElement(By.cssSelector("[id='Name']"));
        name.sendKeys("Talha Balaban");

        WebElement company = driver.findElement(By.cssSelector("[id='Company']"));
        company.sendKeys("SuTa Software Develeopment Engineer A.Ş.");

        WebElement address = driver.findElement(By.cssSelector("[id='Address']"));
        address.sendKeys("Kemalpaşa Mahallesi");

        WebElement city = driver.findElement(By.cssSelector("[id='City']"));
        city.sendKeys("BURSA, maalesef");

        WebElement phone = driver.findElement(By.cssSelector("[id='Phone']"));
        phone.sendKeys("+905553339988");

        WebElement email = driver.findElement(By.cssSelector("[id='Email']"));
        email.sendKeys("talhabalaban3@gmail.com");

        WebElement create = driver.findElement(By.cssSelector("[value='Create']"));
        create.click();

        WaitClose();

    }
}
