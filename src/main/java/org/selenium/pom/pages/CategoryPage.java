package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;

public class CategoryPage extends BasePage {
    private final By menuAsianTofu = By.xpath("//*[@id=\"__next\"]/section/main/div[2]/div/div/div/div/div[4]");
    private final By noteOrder = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div[2]/div/textarea");
    private final By addToCartBtnTofu = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/button");
    private final By menuAsianChicken = By.xpath("//*[@id=\"__next\"]/section/main/div[2]/div/div/div/div/div[5]");
    private final By addToCartBtnChicken = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/button");
    private final By viewCart = By.xpath("//*[@id=\"__next\"]/div[2]");
    private final By title = By.xpath("//*[@id=\"__next\"]/div[2]");
    private final By removeMenu = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[1]/div/div[2]/div[3]/div[2]/div/div[1]");
    private final By addName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[4]/div/div/div[1]/input");
    private final By addPhoneNumber = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[6]/div/div/div[1]/input");
    private final By prosesCheckout = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[2]/div/div/button");

    public CategoryPage(WebDriver driver){
        super(driver);
    }

    //Order Tofu
    private CategoryPage clickMenuAsiaTofu(){
        driver.findElement(menuAsianTofu).click();
        return this;
    }
    private CategoryPage enterNoteOrder(String txt){
        driver.findElement(noteOrder).sendKeys(txt);
        return this;
    }
    private CategoryPage clickAddToCartBtnTofu(){
        driver.findElement(addToCartBtnTofu).click();
        return this;
    }

    public CategoryPage orderAsianTofu(String txt){
        clickMenuAsiaTofu().enterNoteOrder(txt).clickAddToCartBtnTofu();
        return this;
    }
    //--

    //Order Chicken
    private CategoryPage clickMenuAsianChicken(){
        driver.findElement(menuAsianChicken).click();
        return this;
    }
    private CategoryPage clickAddToCartBtnChicken(){
        driver.findElement(addToCartBtnChicken).click();
        return this;
    }

    public CategoryPage orderAsianChicken(){
        clickMenuAsianChicken().clickAddToCartBtnChicken();
        return this;
    }
    //--

    public void clickViewCart(){
        driver.findElement(viewCart).click();
    }
    public String getTittle(){
        return driver.findElement(title).getText();
    }

    //Melengkapi Order
    private CategoryPage clickRemoveMenu(){
        driver.findElement(removeMenu).click();
        return this;
    }
    private CategoryPage enterAddName(String txt){
        driver.findElement(addName).sendKeys(txt);
        return this;
    }
    private CategoryPage enterAddPhoneNumber(String txt){
        driver.findElement(addPhoneNumber).sendKeys(txt);
        return this;
    }
    private CategoryPage clickProsesCheckout(){
        driver.findElement(prosesCheckout).click();
        return this;
    }

    public CategoryPage completeOrder(String txt, String s){
        clickRemoveMenu().enterAddName(txt).enterAddPhoneNumber(s).clickProsesCheckout();
        return this;
    }
    //--


}
