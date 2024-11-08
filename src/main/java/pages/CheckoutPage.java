package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CheckoutPage extends BaseTest {

    @Step ("Checkout butonuna tıklanır.")
    public CheckoutPage clickCheckout()
    {
        driver.findElement(By.name("checkout")).click();
        screenshot();
        return this;
    }

    @Step ("First Name alanı doldurulur.")
    public CheckoutPage fillFirstName(String text)
    {
        driver.findElement(By.id("first-name")).sendKeys(text);
        screenshot();
        return this;
    }

    @Step ("Last Name alanı doldurulur.")
    public CheckoutPage fillLastName(String text)
    {
        driver.findElement(By.id("last-name")).sendKeys(text);
        screenshot();
        return this;
    }

    @Step ("Postal Code alanı doldurulur.")
    public CheckoutPage fillPostalCode(String text)
    {
        driver.findElement(By.id("postal-code")).sendKeys(text);
        screenshot();
        return this;
    }

    @Step ("Continue butonua tıklanır.")
    public CheckoutPage clickContinue()
    {
        driver.findElement(By.name("continue")).click();
        screenshot();
        return this;
    }

    @Step ("Finish butonuna tıklanır.")
    public CheckoutPage clickFinish()
    {
        driver.findElement(By.name("finish")).click();
        screenshot();
        return this;
    }

    @Step ("Sipariş Kontrolü")
    public CheckoutPage checkoutControl(String value)
    {
        String text= driver.findElement(By.cssSelector("[class='complete-header']")).getText();
        Assert.assertEquals(value,text);
        screenshot();
        return this;
    }

}
