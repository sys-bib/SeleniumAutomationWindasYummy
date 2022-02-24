package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class OrderSummaryPage extends BasePage {
    private final By addOvoNumber = By.xpath("//*[@id=\"__next\"]/section/main/div/div[2]/div/div/div[1]/div[4]/div[2]/input");

    public OrderSummaryPage(WebDriver driver){
        super(driver);
    }

    public OrderSummaryPage enterAddOvoNumber(String txt){
        WebElement o = wait.until(ExpectedConditions.visibilityOfElementLocated(addOvoNumber));
        o.sendKeys(txt);
        //driver.findElement(addOvoNumber).sendKeys(txt);
        return this;
    }

}
