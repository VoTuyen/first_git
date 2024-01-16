package websiteShopplay.Testcase;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class CodMethod {

    static WebDriver driver;
    @BeforeClass
    void setUp() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://shopplay.vn/");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/div[1]/div[1]/div[1]/input")).sendKeys("0903253722");
        driver.findElement(By.cssSelector("[type=password]")).sendKeys("Test@123");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@aria-label='Toggle cart sidebar']")).click();
        Thread.sleep(1000);
        WebElement checkbox = driver.findElement(By.xpath("//div[@id='cart-checkout']/div/div/div[2]/div/div/div[5]/div[2]/div/div/div/input"));
        if(!checkbox.isSelected()){
            checkbox.click();
        }
        driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[2]/div/button")).click();
        Thread.sleep(1000);

    }

    @Test
    void validateCODMethod() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[1]/div/div[2]/div[2]/div[2]/div[2]/label/label"));
        String COD_tile = element.getText();
        System.out.println(COD_tile);
        Assert.assertEquals(COD_tile,"Thanh toán khi nhận hàng");
    }

    @Test
    void validateTextConfirmSuccessOrder() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[2]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[1]/div/div[2]/div[2]/div[1]/div[1]/section/div[2]/div[2]/form/div[1]/div[1]/input")).sendKeys("Tuyền test");
        driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[1]/div/div[2]/div[2]/div[1]/div[1]/section/div[2]/div[2]/form/div[1]/div[2]/input")).sendKeys("0984777777");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

        WebElement dropdown1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart-checkout\"]/div[1]/div/div[2]/div[2]/div[1]/div[1]/section/div[2]/div[2]/form/div[2]/div[1]/select")));
        Select province_city = new Select(dropdown1);
        province_city.selectByValue("54");


        WebElement dropdown2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart-checkout\"]/div[1]/div/div[2]/div[2]/div[1]/div[1]/section/div[2]/div[2]/form/div[2]/div[2]/select")));
        Select district = new Select(dropdown2);
        district.selectByValue("504");

//
//        Thread.sleep(5000);
//        Select ward = new Select(driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[1]/div/div[2]/div[2]/div[1]/div[1]/section/div[2]/div[2]/form/div[3]/div[1]/select")));
//        ward.selectByIndex(0);
//        driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[1]/div/div[2]/div[2]/div[1]/div[1]/section/div[2]/div[2]/form/div[3]/div[2]/input")).sendKeys("tesstttttt");
//        driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[1]/div/div[2]/div[2]/div[1]/div[1]/section/div[2]/div[2]/div[3]/button[1]")).click();
//        Thread.sleep(1000);
//
//
//        driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[2]/div/button")).click();
//        Thread.sleep(1000);
//        WebElement element = driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/div[7]"));
//        String TextConfirm = element.getText();
//        Assert.assertEquals(TextConfirm, "Đơn hàng sẽ được xác nhận trong vòng 24 tiếng kể từ khi khách hàng đặt hàng");
    }


    @AfterClass
    void tearDown(){
        //driver.quit();
    }
}
