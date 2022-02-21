package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageTest {
    @Test
    public void Page() {
        String dir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shop-sit.yummykitchen.com/windas");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div[1]/div[1]/div[2]/div/div/div[3]")).click();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div[2]/div/div/div/div/div[4]")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div[2]/div/textarea")).sendKeys("Extra Sauce");

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/button")).click();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/section/main/div[2]/div/div/div/div/div[5]")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[4]/button")).click();

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[1]/div/div[2]/div[3]/div[2]/div/div[1]")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[4]/div/div/div[1]/input")).sendKeys("Habiburrahman Ahmadi");

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div[6]/div/div/div[1]/input")).sendKeys("085887862735");

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/div[2]/div/div/button")).click();
    }
}
