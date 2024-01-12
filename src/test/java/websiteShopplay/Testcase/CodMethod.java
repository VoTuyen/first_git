package websiteShopplay.Testcase;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CodMethod {

    static WebDriver driver;
    @BeforeClass
    void setUp() throws InterruptedException {
        driver = new ChromeDriver();
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
        Thread.sleep(5000);

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

       // driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[1]/div/div[2]/div[2]/div[1]/div[1]/section/div[2]/div[2]/form/div[2]/div[1]/select")).click();
        Thread.sleep(2000);
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[1]/div/div[2]/div[2]/div[1]/div[1]/section/div[2]/div[2]/form/div[2]/div[1]/select/option[7]"));
//        String text1 = text.getText();
//        System.out.println(text1);
//        System.out.println(text);
//        driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[1]/div/div[2]/div[2]/div[1]/div[1]/section/div[2]/div[2]/form/div[2]/div[1]/select/option[7]")).click();

        Select province_city = new Select(driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[1]/div/div[2]/div[2]/div[1]/div[1]/section/div[2]/div[2]/form/div[2]/div[1]/select")));
        System.out.println(province_city);
        Thread.sleep(1000);
        province_city.selectByValue("54");
        driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[1]/div/div[2]/div[2]/div[1]/div[1]/section/div[2]/div[2]/form/div[2]/div[1]/label")).click();
        int number_item = province_city.getOptions().size();
        String actual_result = province_city.getFirstSelectedOption().getText();
        Assert.assertEquals("An Giang", actual_result);
        System.out.println(number_item);
        System.out.println(actual_result);

        Thread.sleep(10000);

        Select district = new Select(driver.findElement(By.xpath("//*[@id=\"cart-checkout\"]/div[1]/div/div[2]/div[2]/div[1]/div[1]/section/div[2]/div[2]/form/div[2]/div[2]/select")));
        System.out.println(district);
        int district_size = district.getOptions().size();
        System.out.println(district_size);
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
