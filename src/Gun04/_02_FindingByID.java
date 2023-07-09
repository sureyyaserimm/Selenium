package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByID {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); //sayfaya gittim

        WebElement name = driver.findElement(By.id("first_8")); //elemanı ID ile bul
        name.sendKeys("Süreya"); //kutucuklara yazı gönderme

        WebElement surname = driver.findElement(By.id("last_8")); //elemanı ID ile bul
        surname.sendKeys("Serim"); //kutucuklara yazı gönderme

//       MyFunc.Bekle(2);
//        name.clear();
//        surname.clear();

        //Chrome ctrl+f ile inspect bölümünde arama kkutusu açar.
        //first_name yazarsak bütün kelimelerde arar
        //#first_name yazasak sadece id'lerde arama yapar.

        WebElement labelFirstName = driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName.getText() = " + labelFirstName.getText());

        WebElement labelLastName = driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName.getText() = " + labelLastName.getText());

        WebElement submitButton = driver.findElement(By.id("input_2"));
        submitButton.click();

        MyFunc.Bekle(5);
        driver.quit();


    }
}
