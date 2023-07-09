package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {
    public static void main(String[] args) {
        //DriverBaslat(); bu fonksiyonu publi static void değil de sadece static olarak yazdığımız zaman burada çağırmamıza gerek kalmadı.
        //biz her seferinde sadece BaseDriver'ı extend ederek bu kodları kullanabileceğiz.

        driver.get("https://www.hepsiburada.com/");
        List<WebElement> linkler = driver.findElements(By.tagName("a")); //verilen taglerdeki tüm elemanları aldık.
        for (WebElement e : linkler) {
            if (e.getText().isEmpty()) {
                System.out.println("(href) = " + e.getAttribute("href"));
                System.out.println("(title) = " + e.getAttribute("title"));
                System.out.println("(rel) = " + e.getAttribute("rel"));
            }
        }


        BekleKapat();


    }
}
