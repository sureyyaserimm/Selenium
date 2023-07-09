package Proje2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Senaryo5 extends BaseDriver {
    @Test
    public void Test5() {
        driver.get("http://demowebshop.tricentis.com/");

        Actions actions = new Actions(driver);

        WebElement login = driver.findElement(By.cssSelector("a[href='/login']"));
        login.click();

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("como45@gmail.com");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("abc123456");

        WebElement loginBtn = driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        loginBtn.click();

        WebElement computer = driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[2]/a"));
        actions.moveToElement(computer).build().perform();

        MyFunc.Bekle(1);
        WebElement notebook = driver.findElement(By.cssSelector("ul[class='sublist firstLevel active']>li>a[href='/notebooks']"));
        notebook.click();

        WebElement laptop = driver.findElement(By.cssSelector("h2[class='product-title']>a"));
        laptop.click();

        WebElement addToCart = driver.findElement(By.cssSelector("input[id='add-to-cart-button-31']"));
        addToCart.click();

        MyFunc.Bekle(2);
        WebElement message=driver.findElement(By.cssSelector("[class='content']"));
        Assert.assertTrue(message.getText().contains("The product has been added to your"));

        WebElement shoppingCart = driver.findElement(By.cssSelector("li[id='topcartlink']>a"));
        shoppingCart.click();

        WebElement check = driver.findElement(By.cssSelector("[class='product']>a"));
        Assert.assertTrue(check.getText().equals("14.1-inch Laptop"));

        WebElement agree = driver.findElement(By.cssSelector("[name='termsofservice']"));
        agree.click();

        WebElement checkOut = driver.findElement(By.cssSelector("#checkout"));
        actions.moveToElement(checkOut).click().build().perform();

//        WebElement country=driver.findElement(By.id("BillingNewAddress_CountryId"));
//        Select select=new Select(country);
//        select.selectByValue("2");
//
//        WebElement state=driver.findElement(By.cssSelector("#BillingNewAddress_StateProvinceId"));
//        Select select1=new Select(state);
//        select1.selectByVisibleText("California");
//
//        WebElement city=driver.findElement(By.cssSelector("#BillingNewAddress_City"));
//        city.sendKeys("San Francisco");
//
//        WebElement address=driver.findElement(By.cssSelector("#BillingNewAddress_Address1"));
//        address.sendKeys("60 West Portal Ave");
//
//        WebElement zipCode=driver.findElement(By.cssSelector("#BillingNewAddress_ZipPostalCode"));
//        zipCode.sendKeys("94132");

//        WebElement phone=driver.findElement(By.cssSelector("#BillingNewAddress_PhoneNumber"));
//        phone.sendKeys("+1 555 444 66 33");

        WebElement continue1 = driver.findElement(By.cssSelector("input[onclick='Billing.save()']"));
        actions.moveToElement(continue1).click().build().perform();

        WebElement pickUp = driver.findElement(By.cssSelector("#PickUpInStore"));
        pickUp.click();

        WebElement continue2 = driver.findElement(By.cssSelector("input[onclick='Shipping.save()']"));
        actions.moveToElement(continue2).click().build().perform();

        WebElement paymentMethod = driver.findElement(By.cssSelector("#paymentmethod_2"));
        paymentMethod.click();

        WebElement continue3 = driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()']"));
        actions.moveToElement(continue3).click().build().perform();

        WebElement cardHolderName=driver.findElement(By.cssSelector("#CardholderName"));
        cardHolderName.sendKeys("Talha Balaban");

        WebElement cardNumber=driver.findElement(By.cssSelector("#CardNumber"));
        cardNumber.sendKeys("1111 2222 3333 4444");

        WebElement cardCode=driver.findElement(By.cssSelector("#CardCode"));
        cardCode.sendKeys("123");

        WebElement continue4 = driver.findElement(By.cssSelector("input[onclick='PaymentInfo.save()']"));
        actions.moveToElement(continue4).click().build().perform();

        WebElement confirm = driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
        actions.moveToElement(confirm).click().build().perform();

        WebElement message1=driver.findElement(By.cssSelector("[class='title']>strong"));
        Assert.assertTrue(message1.getText().equals("Your order has been successfully processed!"));


        BekleKapat();

    }
}
