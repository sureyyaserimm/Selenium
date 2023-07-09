package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BaseDriver {
    // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    // 2- Business i çekleyin.
    // 3- discover XYZ ye tıklatın ve online Advertising i seçin
    // 4- Every day i seçin
    // 5- Good u seçin
    // 6- using XYZ yi tıklatın ve 3.seçeneği seçin
    // css selector


    @Test
    public void Test1() {

        driver.get("https://formsmarts.com/form/yu?mode=h5");
        MyFunc.Bekle(2);

        WebElement business = driver.findElement(By.cssSelector("[for='u_IxB_4586_0'] > span"));
        business.click();
        MyFunc.Bekle(2);

        WebElement discover = driver.findElement(By.cssSelector("[for='u_IxB_4588'] + select"));
        discover.click();
        MyFunc.Bekle(2);

        WebElement online = driver.findElement(By.cssSelector("[for='u_IxB_4588'] + select >:nth-child(4)"));
        online.click();
        MyFunc.Bekle(2);

        WebElement everyday = driver.findElement(By.cssSelector("[id='u_IxB_89585_0']+span"));
        everyday.click();
        MyFunc.Bekle(2);

        WebElement good = driver.findElement(By.cssSelector("[id='u_IxB_4589_0']+span"));
        good.click();
        MyFunc.Bekle(2);

        WebElement howLong = driver.findElement(By.cssSelector("[id='u_IxB_4597']"));
        howLong.click();
        MyFunc.Bekle(2);

        WebElement month = driver.findElement(By.cssSelector("[id='u_IxB_4597']>:nth-child(4)"));
        month.click();
        howLong.click();

        BekleKapat();

    }


}
