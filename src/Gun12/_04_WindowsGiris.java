package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowsGiris extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.selenium.dev/");

        //şu aşamada ana sayfadayım
        // bulunulan windowID'yi almak için
        String anasayfaWindowID= driver.getWindowHandle();
        System.out.println("anasayfaWindowID = " + anasayfaWindowID);


        List<WebElement> links=driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link: links){
            if (!link.getAttribute("href").contains("mail"))
                link.click();
        }

        //şu aşamada bütün sayfalar açıldı
        Set<String> windowIDs=driver.getWindowHandles();
        for (String id: windowIDs)
            System.out.println("id = " + id);

        MyFunc.Bekle(5);
        BekleKapat();
    }
}
