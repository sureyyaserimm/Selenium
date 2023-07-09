package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*
     Selenium Bekletme Komutları

      pageLoadTimeout :
      driver.manage().timeouts().pageLoadTimeout(dr);
      30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.

     ImplicitlyWait:
     Tüm sayfadaki elemanlar için, elemanın locatorı sayfa içinde bulanabilir hale getirene kadar verilen bekleme süresi.
     Bütün elemanlar için geçerli ve eleman bulunduğunda kalan süreyi beklemez.NoSuchElement hatasını için verilen süre
     kadar beler.

        Duration muhlet=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(muhlet);

     Explicit  Wait  : Tek bir eleman özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur
 */

public class _01_WaitGiris extends BaseDriver {
    @Test
    public void Wait1() {

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement button=driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        button.click();

        Duration duration=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(duration);

        //MyFunc.Bekle(2); // bu programı durduryor. sayfayla bir ilgisi olmadığı için sonuna kadar bekler.
        // interviewlerde bekletme olarak kesinlikle söylenmiyor.

        WebElement message= driver.findElement(By.xpath("//p[text()='WebDriver']"));

    }
}
