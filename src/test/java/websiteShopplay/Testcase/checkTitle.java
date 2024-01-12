package websiteShopplay.Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkTitle {
    @Test
    public void validateChangeTitleThanhtoanHoantien(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://shopplay.vn/auth/login");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"default\"]/footer/div/div[3]/div[2]/ul/li[1]/div/a"));
        String linkText = element.getText();
        System.out.println(linkText);
        Assert.assertEquals(linkText, "Thanh toán & hoàn tiền");

    }
}
