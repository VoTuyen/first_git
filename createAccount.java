package websiteShopplay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class createAccount {

    WebDriver driver;
    @Test
    public void createNewAccountSucess() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://staging.shopplay.vn/auth/login");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/div[2]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/div[2]/span/div[1]/input")).sendKeys("0984987654");

        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/div[2]/span/div[2]/div[1]/div/input")).sendKeys("Test@123");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/div[2]/span/div[3]/div[1]/div/input")).sendKeys("Test@123");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/button")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://staging.shopplay.vn/auth/login");
    }
    @Test
    public void loginSucessWithNewAccount() throws InterruptedException{
        driver.get("https://staging.shopplay.vn/auth/login");
        //driver.findElement(By.cssSelector("[type=text]")).sendKeys("0326277728");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/div[1]/div[1]/div[1]/input")).sendKeys("0326277728");
        driver.findElement(By.cssSelector("[type=password]")).sendKeys("123456a@A");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/button")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://staging.shopplay.vn/");
        System.out.print(driver.getCurrentUrl());

    }


}
