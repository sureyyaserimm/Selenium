package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

public class _03_IFrameSoru extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0); //kod sırasına göre ilk (0.) frame'ye geçtim

        WebElement input= driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Türkiye");

        driver.switchTo().frame(0);
        WebElement checkBox=driver.findElement(By.id("a"));
        checkBox.click();

        // driver.switchTo().parentFrame();
        // driver.switchTo().parentFrame();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement webSelect=driver.findElement(By.id("animals"));
        Select avatarSelect=new Select(webSelect);
        avatarSelect.selectByIndex(3);

        BekleKapat();

    }
}
