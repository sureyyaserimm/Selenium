package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

/*Senaryo:
        https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
        Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
        Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
        */

public class _05_WindowSoru extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/");

        String anasayfaWindowID = driver.getWindowHandle();
        System.out.println("anasayfaWindowID = " + anasayfaWindowID);

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : links) {
            if (!link.getAttribute("href").contains("mail"))
                link.click();
        }

        //şu aşamada bütün sayfalar açıldı
        Set<String> windowIDs = driver.getWindowHandles();
        for (String id : windowIDs)
        {
            MyFunc.Bekle(2);
            driver.switchTo().window(id);  //sıradaki tab'daki window'a geçme işlemi
            System.out.println("Title = " + driver.getTitle() + " , URL=" + driver.getCurrentUrl());
        }

        //anasayfa harici kapama işlemi
        for (String id : windowIDs) {
            if (id.equals(anasayfaWindowID))
                continue;
            driver.switchTo().window(id); //sıradaki tab'a geçmiş oldum
            driver.close();
        }


    }
}
