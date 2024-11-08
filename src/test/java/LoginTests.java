import base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();



    @Test (description = "Başarılı Giriş Kontrolü")
    public void LoginSuccesfull () {

        loginPage.fillUsername(username)
                 .fillPassword(password)
                 .clickLogin();

        homePage.accountControl("Products");

    }

    @Test (description = "Başarısız Giriş Kontrolü")
    public void LoginUnsuccesfull () {

        loginPage.fillUsername("aaaa")
                 .fillPassword(password)
                 .clickLogin();

        loginPage.loginControl("Epic sadface: Username and password do not match any user in this service");

    }

    @Test (description = "Kullanıcı Adı Gerekli Kontrolü")
    public void LoginUsernameRequired () {

        loginPage.fillUsername("")
                 .fillPassword(password)
                 .clickLogin();

        loginPage.loginControl("Epic sadface: Username is required");

    }

    @Test (description = "Şifre Gerekli Kontrolü")
    public void LoginPasswordRequired () {

        loginPage.fillUsername(username)
                 .fillPassword("")
                 .clickLogin();

        loginPage.loginControl("Epic sadface: Password is required");

    }
}
