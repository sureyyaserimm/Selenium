
package Odevler.CSSselector;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test6 extends BaseDriver {
    @Test
    public void Test6() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlertTest = driver.findElement(By.cssSelector("[id='fakealerttest']"));
        fakeAlertTest.click();

        WebElement showModalDialog = driver.findElement(By.cssSelector("[id='modaldialog']"));
        showModalDialog.click();

        MyFunc.Bekle(2);
        WebElement btnOk= driver.findElement(By.cssSelector("[id='dialog-ok']"));
        btnOk.click();

        BekleKapat();


    }
}
