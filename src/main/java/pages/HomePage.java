package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends BaseTest {

    @Step ("Başarılı giriş yapıldığı kontrol edilir.")
    public HomePage accountControl(String value)
    {
        String text= driver.findElement(By.cssSelector("[class='title']")).getText();
        Assert.assertEquals(value,text);
        screenshot();
        return this;
    }

    @Step ("Add to cart butonuna tıklanır.")
    public HomePage addCart ()
    {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        screenshot();
        return this;
    }

    @Step ("Remove cart butonuna tıklanır.")
    public HomePage removeCart ()
    {
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        screenshot();
        return this;
    }

    @Step ("Ürünün sepete eklendiği kontrol edilir.")
    public HomePage addCartControl(String value)
    {
        String text= driver.findElement(By.cssSelector("[class='btn btn_secondary btn_small btn_inventory ']")).getText();
        Assert.assertEquals(value,text);
        screenshot();
        return this;
    }

    @Step ("Ürünün sepetten çıkarıldığı kontrol edilir.")
    public HomePage removeCartControl(String value)
    {
        String text= driver.findElement(By.cssSelector("[class='btn btn_primary btn_small btn_inventory ']")).getText();
        Assert.assertEquals(value,text);
        screenshot();
        return this;
    }

    @Step ("Checkout butonuna tıklanır.")
    public HomePage openCheckout()
    {
        driver.findElement(By.cssSelector("[class='shopping_cart_link']")).click();
        screenshot();
        return this;

    }

}
