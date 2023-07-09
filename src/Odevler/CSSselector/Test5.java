package Odevler.CSSselector;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test5 extends BaseDriver {

    @Test
    public void Test5() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlertTest= driver.findElement(By.cssSelector("[id='fakealerttest']"));
        fakeAlertTest.click();

        WebElement fakeAlert= driver.findElement(By.cssSelector("[id='fakealert']"));
        fakeAlert.click();

        MyFunc.Bekle(2);
        WebElement btnOk= driver.findElement(By.cssSelector("[id='dialog-ok']"));
        btnOk.click();

        BekleKapat();
    }
}
