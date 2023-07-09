package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

public class _04_WaitSoru extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.demoblaze.com/index.html");

        Duration duration=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(duration);

        //WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(30));
        //wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Samsung galaxy s6")));
        WebElement samsung = driver.findElement(By.linkText("Samsung galaxy s6"));
        samsung.click();

        //WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(30));
        //wait2.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add to cart")));
        WebElement addToCart = driver.findElement(By.linkText("Add to cart"));
        addToCart.click();

        WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait3.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement productStore = driver.findElement(By.xpath("//a[@class='navbar-brand']"));
        productStore.click();

        BekleKapat();
    }
}

//        public static boolean isAlertPresent(){
//            try{
//                driver.switchTo().alert();
//                return true;
//            }catch(NoAlertPresentException ex){
//                return false;
//            }
//        }
