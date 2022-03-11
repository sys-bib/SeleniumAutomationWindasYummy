package org.selenium.pom.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class PaymentPage extends BasePage {
    private final By gopayPayment = By.xpath("//*[@id=\"__next\"]/section/main/div/div[3]/div/div[5]/div/div[2]/div/div/div[1]/div/div/div[1]/div");
    private final By ovoPayment = By.xpath("//*[@id=\"__next\"]/section/main/div/div[3]/div/div[5]/div/div[3]/div/div/div[1]/div/div/div[1]/div");
    private final By chooseMethodLinkOvo = By.xpath("//*[@id=\"__next\"]/section/main/div/div[3]/div/div[6]/div/button");
    private final By chooseMethodLink = By.xpath("//*[@id=\"__next\"]/section/main/div/div[3]/div/div[6]/div[2]/button");


    public PaymentPage(WebDriver driver){
        super(driver);
    }

    public PaymentPage clickGopayPayment(){
        wait.until(ExpectedConditions.elementToBeClickable(gopayPayment)).click();
        //driver.findElement(ovoPayment).click();
        return this;
    }

    public OrderSummaryPage clickChooseMethodLink(){
        wait.until(ExpectedConditions.elementToBeClickable(chooseMethodLink)).click();
        //driver.findElement(chooseMethodLink).click();
        return new OrderSummaryPage(driver);
    }

    public PaymentPage clickOvoPayment(){
        wait.until(ExpectedConditions.elementToBeClickable(ovoPayment)).click();
        return this;
    }

    public PaymentPage clickChooseMethodLinkOvo(){
        wait.until(ExpectedConditions.elementToBeClickable(chooseMethodLinkOvo)).click();
        return this;
    }
}
