package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");


        WebElement ad=driver.findElement(By.name("q8_name[first]"));
        ad.sendKeys("Süreya");

        WebElement soyad=driver.findElement(By.name("q8_name[last]"));
        soyad.sendKeys("Serim");

        MyFunc.Bekle(5);
        driver.quit();



    }
}
