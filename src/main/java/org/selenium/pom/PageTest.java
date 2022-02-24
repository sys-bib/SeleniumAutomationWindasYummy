package org.selenium.pom;

import org.openqa.selenium.By;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.objects.Order;
import org.selenium.pom.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTest extends BaseTest {
    @Test
    public void Page() throws InterruptedException {
        Order orderForm = new Order("Habiburrahman Ahmadi","085887862735");
        CategoryPage categoryPage = new HomePage(driver).load().clickCategoryMenuLink().orderAsianTofu("Extra Sauce").orderAsianChicken().clickViewCart();
        Assert.assertEquals(categoryPage.getProductTofu(), "Asian Tofu Lasgna");
        Assert.assertEquals(categoryPage.getProductChicken(), "Asian Chicken Blackpepper Bento");
        categoryPage.clickRemoveMenu().completeOrder(orderForm);
        CheckoutPage checkoutPage = categoryPage.clickCheckoutLink();
        Assert.assertEquals(checkoutPage.getProductOrder(),"Asian Tofu Lasgna"); //Cek apakah sudah sesuai orderan atau belum
        checkoutPage.enterAddEmail("habibhack@gmail.com");
        PaymentPage paymentPage = checkoutPage.clickNextLink();
        paymentPage.clickOvoPayment();
        OrderSummaryPage orderSummaryPage = paymentPage.clickChooseMethodLink();
        orderSummaryPage.enterAddOvoNumber("085887862735");
    }
}
