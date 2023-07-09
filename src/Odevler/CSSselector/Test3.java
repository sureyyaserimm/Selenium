package Odevler.CSSselector;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test3 extends BaseDriver {
    @Test
    public void Test3() {

        driver.get("https://www.snapdeal.com/");

        WebElement search= driver.findElement(By.cssSelector("[id='inputValEnter']"));
        search.sendKeys("teddy bear");

        WebElement searchBtn = driver.findElement(By.cssSelector("[class='searchTextSpan']"));
        searchBtn.click();

        WebElement alert= driver.findElement(By.cssSelector("div[id='searchMessageContainer']>div>span"));

        Assert.assertTrue(alert.getText().equals("We've got 369 results for teddy bear"));

        BekleKapat();




    }
}
