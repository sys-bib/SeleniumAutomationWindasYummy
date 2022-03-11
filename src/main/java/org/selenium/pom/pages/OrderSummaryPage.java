package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class OrderSummaryPage extends BasePage {
    private final By continueToPayBtn = By.xpath("//*[@id=\"__next\"]/section/main/div/div[2]/div/div/div[3]/div[2]/button");
    private final By changePaymentMethod = By.xpath("//*[@id=\"__next\"]/section/main/div/div[2]/div/div/div[2]/div/div");
    private final By ovoNumberForm = By.xpath("//*[@id=\"__next\"]/section/main/div/div[2]/div/div/div[1]/div[4]/div[2]/input");
    private final By continuePayOvoBtn = By.xpath("//*[@id=\"__next\"]/section/main/div/div[2]/div/div/div[3]/div[2]/button");

    public OrderSummaryPage(WebDriver driver){
        super(driver);
    }

    public OrderSummaryPage clickContinueToPayLink(){
        wait.until(ExpectedConditions.elementToBeClickable(continueToPayBtn)).click();
        return this;
    }

    public OrderSummaryPage clickChangePaymentMethod() throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(changePaymentMethod)).click();
        return this;
    }

    public OrderSummaryPage getOvoNumberForm(String txt){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(ovoNumberForm));
        e.sendKeys(txt);
        return this;
    }

    public OrderSummaryPage clickcontinuePayOvoLink(){
        wait.until(ExpectedConditions.elementToBeClickable(continuePayOvoBtn)).click();
        return this;
    }

}
