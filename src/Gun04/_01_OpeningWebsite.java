package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {
        //1-Hepsiburada.com sayfasına git
        //2-arama kutusuna usb yaz
        //3-ara butonuna bas
        //4-çıkan ürünlerin açıklamasında USB kelimesini kontrol et.

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com"); //sayfaya gittim

        //aşağıdaki kodları driverdan isteyeceğiz

        //eleman arama kutusu= arama kutusunu bul;
        //arama kutusu.yazigonder("usb");
        //elemanlar = urunListesiniAl;
        //for dongusu ile kontrol et


        MyFunc.Bekle(5); //sayfayı 5 sn açık beklet

        driver.quit(); //sayfayı kapat. (Açık bütün tarayıcıları kapatır.)
        // driver.close(); mevcuttaki sayfayı kapatır.
    }
}
