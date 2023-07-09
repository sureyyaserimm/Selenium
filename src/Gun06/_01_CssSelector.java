package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class _01_CssSelector extends BaseDriver {
    public static void main(String[] args) {
        // 1-Açılan sayfadaki kutucuğa mesajınızı yazını.
        // 2-Butona tıklatınız
        // 3-Butona basıldığında mesajınızın sayfada göründüğünü test ediniz.

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement txtBox=driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys("Süreya Serim");

        WebElement clickBox=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        clickBox.click();

        WebElement result=driver.findElement(By.cssSelector("[id='display']"));

        if(result.getText().equals("Süreya Serim"))
            System.out.println("Test passed!!,");
        else
            System.out.println("Test failed!!");

        BekleKapat();
    }
}
