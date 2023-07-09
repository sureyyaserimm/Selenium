package Gun08;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClassGiris extends BaseDriver {
    @Test
    public void Test1() {

        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.com.tr/");
        driver.manage().deleteAllCookies();

        WebElement webMenu1 = driver.findElement(By.id("searchDropdownBox"));

        //bu element select tagi ile başlıyorsa, sen bunu SELECTe cast yap ve öyle kullan

        Select ddMenu1 = new Select(webMenu1); //elementi daha rahat kullanaılabilir SELECT nesnesi haline getirdi.
        ddMenu1.selectByIndex(4); //indexle seçme
        ddMenu1.selectByValue("select-alias=electronics"); //value ile seçme
        ddMenu1.selectByVisibleText("Elektronik"); //görünen textiyle seçme

        System.out.println("ddMenu1.getOptions().size() = " + ddMenu1.getOptions().size());

        BekleKapat();


    }
}
