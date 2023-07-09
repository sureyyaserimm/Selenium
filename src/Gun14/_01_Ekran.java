package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _01_Ekran extends BaseDriver {
    @Test
    public void Test1() throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("Sureya");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("12345");

        WebElement submit=driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        // hata varsa çıkan element
        List<WebElement> hataMesaji=driver.findElements(By.cssSelector("div[role='alert']"));

        if (hataMesaji.size()>0){ //hata varsa
            //ekran kaydet
            System.out.println("Hata oluştu.");

            TakesScreenshot ts=(TakesScreenshot) driver; // 1.aşamada ekran görüntüsü alma değişkenini tanımladım.
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE); // 2.aşamada ekran görünüsü alındı, hafizada
            //hafızadaki bu bilgiyi dosya olarak kaydet
            FileUtils.copyFile(hafizadakiHali, new File("ScreenShot\\screenshot.png"));

        }
        //TODO:burada her hatada aynı dosyayı yeniliyor ve üzerine yazıyor.
        // biz istiyoruz ki her dosya ayrı olsun yani her kayır ayrı olsun
        //        bunu nasıl yaparsınız
        //        LocalDateTime alıcaksın bilgileri
        //        YılAyGunSaatDakikaSan -> 2022_10_07_1319_20.png

        MyFunc.Bekle(2);
        BekleKapat();




    }
}
