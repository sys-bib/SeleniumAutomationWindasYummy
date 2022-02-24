package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class CheckoutPage extends BasePage {
    private final By addEmail = By.xpath("//*[@id=\"__next\"]/section/main/div/div[3]/div/form/div/div[1]/div[7]/div/div/div[1]/input");
    private final By titleOrder = By.xpath("//*[@id=\"__next\"]/section/main/div/div[3]/div/form/div/div[2]/div/div/div[2]/div/div/div/div[1]/div[3]");
    private final By nextLink = By.xpath("//*[@id=\"__next\"]/section/main/div/div[3]/div/form/div/div[1]/div[8]/div/button");

    public CheckoutPage(WebDriver driver){
        super(driver);
    }

    public String getProductOrder(){
        return wait.until(ExpectedConditions.elementToBeClickable(titleOrder)).getText();
    }

    public CheckoutPage enterAddEmail(String txt){
        WebElement n = wait.until(ExpectedConditions.visibilityOfElementLocated(addEmail));
        n.sendKeys(txt);
        //driver.findElement(addEmail).sendKeys(txt);
        return this;
    }

    public PaymentPage clickNextLink(){
        wait.until(ExpectedConditions.elementToBeClickable(nextLink)).click();
        //driver.findElement(nextLink).click();
        return new PaymentPage(driver);
    }

}
