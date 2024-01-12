package websiteShopplay.Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectMethod {
    WebDriver driver = new ChromeDriver();

    @Test
    void test(){
        driver.get("https://thanh-tuyen.netlify.app/");
        Select select1 = new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]")));
        System.out.println(select1);
        select1.selectByIndex(1);

        String text2 = select1.getFirstSelectedOption().getText();
        System.out.println(text2);

    }

}
