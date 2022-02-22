package org.selenium.pom;

import org.openqa.selenium.By;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.pages.CategoryPage;
import org.selenium.pom.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTest extends BaseTest {
    @Test
    public void Page() throws InterruptedException {
        driver.get("https://shop-sit.yummykitchen.com/windas");
        HomePage homePage = new HomePage(driver);
        CategoryPage categoryPage = homePage.clickCategoryMenuLink();
        categoryPage.orderAsianTofu("Extra Sauce");
        categoryPage.orderAsianChicken();
        categoryPage.clickViewCart();
        Assert.assertEquals(categoryPage.getTittle(), "Asian Tofu Lasgna");
        categoryPage.completeOrder("Habiburrahman Ahmadi","085887862735");

        //hard code
        driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div[1]/div[1]/div[2]/div/div/div[3]")).click();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div[2]/div/div/div/div/div[4]")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div[2]/div/textarea")).sendKeys("Extra Sauce");

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/button")).click();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div[2]/div/div/div/div/div[5]")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/button")).click();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]")).click();

        Assert.assertEquals(
                driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[1]/div/div/div[1]/div[1]/div/div[2]")).
                                   getText(),"Asian Tofu Lasgna");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[1]/div/div[2]/div[3]/div[2]/div/div[1]")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[4]/div/div/div[1]/input")).sendKeys("Habiburrahman Ahmadi");

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[6]/div/div/div[1]/input")).sendKeys("085887862735");

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[2]/div/div/button")).click();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div/div[3]/div/form/div/div[1]/div[7]/div/div/div[1]/input")).sendKeys("habibhack@gmail.com");

        driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div/div[3]/div/form/div/div[1]/div[8]/div/button")).click();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div/div[3]/div/div[5]/div/div[3]/div/div/div[1]/div/div/div[1]/div")).click();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div/div[3]/div/div[6]/div[2]/button")).click();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div/div[2]/div/div/div[1]/div[4]/div[2]/input")).sendKeys("085887862735");
    }
}
