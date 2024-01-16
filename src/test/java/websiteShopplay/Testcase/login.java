package websiteShopplay.Testcase;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SourceType;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {
//    public static void main(String[] args){
//        PropertiesFile.setPropertiesFile();
//        WebDriver driver = new ChromeDriver();
//        //driver.get("https://staging.shopplay.vn/auth/login");
//        //driver.get("https://shopplay.vn/auth/login");
//        String link = PropertiesFile.getPropValue("url");
//        driver.get(link);
//
//        driver.findElement(By.tagName("input")).sendKeys("0326277728"); // => k chạy được
//        driver.findElement(By.cssSelector("[type=text]")).sendKeys("0326277728");
//        driver.findElement(By.name("phoneNumber")).sendKeys("0326277728"); // => k chạy được
//
//        driver.findElement(By.cssSelector("[type=password]")).sendKeys("123456a@A");
//
//        driver.findElement(By.tagName("button")).click(); //=> k chạy được
//        driver.findElement(By.xpath("//button[@class='focus:outline-none text-white bg-green-700 hover:bg-green-800 focus:ring-4 focus:ring-green-300 font-medium rounded-lg text-sm px-10 py-2.5 dark:bg-green-600 dark:hover:bg-green-700 dark:focus:ring-green-800 w-full text-[20px] mb-5'")).click(); //=> k chạy được
//        driver.findElement(By.xpath("//button[@type='button']")).click(); //=> k chạy được
//        driver.findElement(By.cssSelector("button[type=button]")).click(); //=> k chạy được
//        driver.findElement(By.cssSelector("button[class=focus:outline-none text-white bg-green-700 hover:bg-green-800 focus:ring-4 focus:ring-green-300 font-medium rounded-lg text-sm px-10 py-2.5 dark:bg-green-600 dark:hover:bg-green-700 dark:focus:ring-green-800 w-full text-[20px] mb-5]")).click(); //=? k chạy được
//        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/button")).click();
//    }

  //static WebDriver driver;
//    @BeforeClass
//    void setUp(){
//        //PropertiesFile.setPropertiesFile();
//        driver = new ChromeDriver();
////        driver.get(PropertiesFile.getPropValue("url"));
////        System.out.println(PropertiesFile.getPropValue("url"));
//        driver.get("https://staging.shopplay.vn/auth/login");
//    }

    @Test
    public static void validateLoginSuccessUrl() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://shopplay.vn/auth/login");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/div[1]/div[1]/div[1]/input")).sendKeys("0903253722");
        driver.findElement(By.cssSelector("[type=password]")).sendKeys("Test@123");
        driver.findElement(By.xpath("//*[@id=\"default\"]/div[2]/div/span/button")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://shopplay.vn/");

    }

//    @AfterClass
//    void tearDown(){
//        driver.quit();
//    }
}
