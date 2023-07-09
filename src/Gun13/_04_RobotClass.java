package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;


public class _04_RobotClass extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);

//        driver.switchTo().frame(8);
//        List<WebElement> acceptAll=driver.findElements(By.xpath("//span[strong='Save and Exit']"));
//        if (acceptAll.size()>0)
//            acceptAll.get(0).click();

        driver.switchTo().frame(9);
        WebElement save = driver.findElement(By.xpath("//span[strong='Save and Exit']"));
        save.click();

        Robot robot = new Robot();

        for (int i = 0; i < 21; i++) {

            //MyFunc.Bekle(1);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        StringSelection dosyaYolu = new StringSelection("C:\\Users\\surey\\OneDrive\\Masaüstü\\TECHNOSTUDY\\message.txt"); //bir dosyanın bu şekilde yluyla birlikte kopyalamak
        // için shift+sağ click yapılır. Burada tek \ var fakat intellijin bunu algılaması için çift \\ koymamız lazım.
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        MyFunc.Bekle(1);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        MyFunc.Bekle(1);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Bekle(1);
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        MyFunc.Bekle(1);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);

        MyFunc.Bekle(1);
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        MyFunc.Bekle(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement message=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='has been successfully uploaded.']")));

        Assert.assertTrue(message.isDisplayed());
        BekleKapat();
    }
}
