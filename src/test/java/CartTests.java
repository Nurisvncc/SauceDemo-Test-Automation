import base.LoginTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;

public class CartTests extends LoginTest {

    HomePage homePage = new HomePage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test (description = "Sepete Ürün Ekleme")
    public void AddToCartSuccessful () {
        homePage.addCart()
                .addCartControl("Remove");
    }

    @Test (description = "Sepetten Ürün Çıkarma")
    public void RemoveToCartSuccessful () {
        homePage.addCart()
                .removeCart()
                .removeCartControl("Add to cart");
    }

    @Test (description = "Sipariş Oluşturma")
    public void CheckoutSuccessful () {
        homePage.addCart()
                .openCheckout();
        checkoutPage.clickCheckout().
                fillFirstName("Mehmet")
                .fillLastName("Nuri")
                .fillPostalCode("9999")
                .clickContinue()
                .clickFinish()
                .checkoutControl("Thank you for your order!");
    }



}
