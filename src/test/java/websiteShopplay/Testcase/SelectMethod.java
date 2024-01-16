package websiteShopplay.Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectMethod {
    WebDriver driver = new ChromeDriver();

    @Test
    void test() throws InterruptedException {
        driver.get("https://thanh-tuyen.netlify.app/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement dropdown1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"posts\"]")));
        Select select1 = new Select(dropdown1);
        select1.selectByValue("1");

        WebElement dropdown2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"albumns\"]")));
        Select select2 = new Select(dropdown2);
        select2.selectByIndex(1);

        driver.quit();

    }

}
