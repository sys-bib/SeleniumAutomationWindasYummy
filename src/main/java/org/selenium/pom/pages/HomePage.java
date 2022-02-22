package org.selenium.pom.pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;

public class HomePage extends BasePage {
    private final By categoryMenuLink = By.xpath("//*[@id=\"__next\"]/section/main/div[1]/div[1]/div[2]/div/div/div[3]");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public CategoryPage clickCategoryMenuLink(){
        driver.findElement(categoryMenuLink).click();
        return new CategoryPage(driver);
    }

}
