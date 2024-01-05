package websiteShopplay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.BeforeClass;

public class openPolicyFilesAfterLogin {

    static WebDriver driver;

    @BeforeClass
    void setUp(){
        driver = new ChromeDriver();
        driver.get("https://staging.shopplay.vn/auth/login");
    }
}

