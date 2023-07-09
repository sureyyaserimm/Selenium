package Odevler.CSSselector;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test4 extends BaseDriver {

    @Test
    public void Test4() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate= driver.findElement(By.cssSelector("[id='calculate']"));
        calculate.click();

        WebElement number1= driver.findElement(By.cssSelector("[id='number1']"));
        number1.sendKeys("5");

        WebElement number2= driver.findElement(By.cssSelector("[id='number2']"));
        number2.sendKeys("20");

        WebElement calculate1= driver.findElement(By.cssSelector("[id='calculate']"));
        calculate1.click();

        WebElement total= driver.findElement(By.cssSelector("[id='answer']"));
        System.out.println("Total = " + total.getText());

        BekleKapat();

    }
}
