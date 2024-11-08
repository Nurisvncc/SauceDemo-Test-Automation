package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    @Step ("Username alanı doldurulur.")
    public LoginPage fillUsername(String text)
    {
        driver.findElement(By.name("user-name")).sendKeys(text);
        screenshot();
        return this;
    }

    @Step ("Password alanı doldurulur.")
    public LoginPage fillPassword(String text)
    {
        driver.findElement(By.name("password")).sendKeys(text);
        screenshot();
        return this;
    }

    @Step ("Login butonuna tıklanır.")
    public LoginPage clickLogin()
    {
        driver.findElement(By.name("login-button")).click();
        screenshot();
        return this;
    }

    @Step ("Hata mesajı kontrol edilir.")
    public LoginPage loginControl(String value)
    {
        String text= driver.findElement(By.cssSelector("[class='error-message-container error']")).getText();
        Assert.assertEquals(value,text);
        screenshot();
        return this;
    }



}
