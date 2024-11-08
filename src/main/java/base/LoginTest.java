package base;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void loginBrowser(){

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("login-button")).click();
    }
}