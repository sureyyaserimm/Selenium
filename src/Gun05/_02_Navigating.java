package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html"); //driver.get yerine kullanılır.

        WebElement element=driver.findElement(By.id("alerttest"));
        // WebElement element2=driver.findElement(By.linkText("Alerts (JavaScript)"));  //ya da bu yolla bulunur.
        element.click();
        MyFunc.Bekle(2);

        System.out.println(driver.getCurrentUrl()); //o anda bulunduğum urly'i söyler.

        driver.navigate().back(); //tarayıcı history'sinden geri geldim
        MyFunc.Bekle(2);

        System.out.println(driver.getCurrentUrl()); //o anda bulunduğum urly'i söyler.

        driver.navigate().forward();
        MyFunc.Bekle(2);

        System.out.println(driver.getCurrentUrl()); //o anda bulunduğum urly'i söyler.

        BekleKapat();
    }
}
