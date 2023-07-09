package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import com.beust.ah.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SenaryoCozum extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.saucedemo.com/");

        WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
        MyFunc.Bekle(1);

        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(1);

        WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
        MyFunc.Bekle(1);

        WebElement sauceLabs=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        sauceLabs.click();
        MyFunc.Bekle(1);

        WebElement addSauceLabs=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addSauceLabs.click();
        MyFunc.Bekle(1);

        WebElement backToProducts=driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backToProducts.click();
        MyFunc.Bekle(1);

        WebElement SauceLabsTshirt=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        SauceLabsTshirt.click();
        MyFunc.Bekle(1);

        WebElement addSauceLabsTshirt=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addSauceLabsTshirt.click();
        MyFunc.Bekle(1);

        WebElement shoppingCart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        shoppingCart.click();
        MyFunc.Bekle(1);

        WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();
        MyFunc.Bekle(1);

        WebElement firstName=driver.findElement(By.xpath("//input[@id='first-name']"));
        firstName.sendKeys("Süreya");
        MyFunc.Bekle(1);

        WebElement lastName=driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("Serim");
        MyFunc.Bekle(1);

        WebElement zipCode=driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipCode.sendKeys("94132");
        MyFunc.Bekle(1);

        WebElement continue1=driver.findElement(By.xpath("//input[@id='continue']"));
        continue1.click();
        MyFunc.Bekle(1);

        List <WebElement> Prices=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double toplam=0;
        for(WebElement w:Prices){
            System.out.println(w.getText()); //$29.99 -> w.getText().substring(1) ->29.99 olur.
            //replaceAll ile [^0-9.,]

            toplam=toplam+Double.parseDouble(w.getText().substring(1)); //1. indexten itibaren sonuna kadar al
        }
        System.out.println("toplam = " + toplam);

        WebElement itemTotal=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        System.out.println("itemTotal = " + itemTotal.getText());
        System.out.println(itemTotal.getText().replaceAll("[^0-9,.]",""));

        Double total=Double.parseDouble(itemTotal.getText().replaceAll("[^0-9,.]",""));

        Assert.assertTrue("Değerler eşit değil", (toplam==total));

        WebElement finish=driver.findElement(By.xpath("//button[@id='finish']"));
        finish.click();
        MyFunc.Bekle(1);

        BekleKapat();

    }
}
