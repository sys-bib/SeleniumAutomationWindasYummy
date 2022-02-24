package org.selenium.pom.pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.Order;

public class CategoryPage extends BasePage {
    private final By menuAsianTofu = By.xpath("//*[@id=\"__next\"]/section/main/div[2]/div/div/div/div/div[4]");
    private final By noteOrder = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div[2]/div/textarea");
    private final By addToCartBtnTofu = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/button");
    private final By menuAsianChicken = By.xpath("//*[@id=\"__next\"]/section/main/div[2]/div/div/div/div/div[5]");
    private final By addToCartBtnChicken = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/button");
    private final By viewCart = By.xpath("//*[@id=\"__next\"]/div[2]");
    private final By titleTofu = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[1]/div/div[1]/div[1]/div[1]/div/div[2]");
    private final By titleChicken = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[1]/div/div[2]/div[1]/div[1]/div/div[2]");
    private final By removeMenu = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[1]/div/div[2]/div[3]/div[2]/div/div[1]");
    private final By addName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[4]/div/div/div[1]/input");
    private final By addPhoneNumber = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[6]/div/div/div[1]/input");
    private final By checkoutLink = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[2]/div/div/button");

    public CategoryPage(WebDriver driver){
        super(driver);
    }

    //Order Tofu
    private CategoryPage clickMenuAsiaTofu() throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(menuAsianTofu)).click();
        //driver.findElement(menuAsianTofu).click();
        return this;
    }
    private CategoryPage enterNoteOrder(String txt){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(noteOrder));
        e.sendKeys(txt);
        //driver.findElement(noteOrder).sendKeys(txt);
        return this;
    }
    private CategoryPage clickAddToCartBtnTofu(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtnTofu)).click();
        //driver.findElement(addToCartBtnTofu).click();
        return this;
    }

    public CategoryPage orderAsianTofu(String txt) throws InterruptedException {
        return clickMenuAsiaTofu().enterNoteOrder(txt).clickAddToCartBtnTofu();
    }
    //--

    //Order Chicken
    private CategoryPage clickMenuAsianChicken(){
        wait.until(ExpectedConditions.elementToBeClickable(menuAsianChicken)).click();
        //driver.findElement(menuAsianChicken).click();
        return this;
    }
    private CategoryPage clickAddToCartBtnChicken(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtnChicken)).click();
        //driver.findElement(addToCartBtnChicken).click();
        return this;
    }

    public CategoryPage orderAsianChicken(){
        return clickMenuAsianChicken().clickAddToCartBtnChicken();
    }
    //--

    public CategoryPage clickViewCart(){
        wait.until(ExpectedConditions.elementToBeClickable(viewCart)).click();
        //driver.findElement(viewCart).click();
        return this;
    }
    public String getProductTofu(){
        return wait.until(ExpectedConditions.elementToBeClickable(titleTofu)).getText();
    }
    public String getProductChicken(){
        return wait.until(ExpectedConditions.elementToBeClickable(titleChicken)).getText();
    }
    public CategoryPage clickRemoveMenu(){
        wait.until(ExpectedConditions.elementToBeClickable(removeMenu)).click();
        //driver.findElement(removeMenu).click();
        return this;
    }

    //Melengkapi Order
    private CategoryPage enterAddName(String txt){
        WebElement n = wait.until(ExpectedConditions.visibilityOfElementLocated(addName));
        n.sendKeys(txt);
        //driver.findElement(addName).sendKeys(txt);
        return this;
    }
    private CategoryPage enterAddPhoneNumber(String txt){
        WebElement p = wait.until(ExpectedConditions.visibilityOfElementLocated(addPhoneNumber));
        p.sendKeys(txt);
        //driver.findElement(addPhoneNumber).sendKeys(txt);
        return this;
    }

    public CategoryPage completeOrder(Order orderForm){
       return enterAddName(orderForm.getName()).
        enterAddPhoneNumber(orderForm.getNumber());
    }
    //--

    public CheckoutPage clickCheckoutLink(){
        wait.until(ExpectedConditions.elementToBeClickable(checkoutLink)).click();
        //driver.findElement(checkoutLink).click();
        return new CheckoutPage(driver);
    }


}
