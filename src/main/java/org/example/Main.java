package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;

import static java.sql.DriverManager.println;

public class Main {
    public static void main(String[] args) {

//        println("Alo");

//        WebDriver driver = new ChromeDriver();// open browser
//        driver.get("https://staging.shopplay.vn/auth/login");
//        driver.quit();

//        String driverPath = "C:/Users/JohnCena/Downloads/chromedriver_win32"; // Replace with the actual path
//        System.setProperty("webdriver.chrome.driver", driverPath);
//        Properties pro();
////        println(props.toString());ps = System.getProperties

        WebDriver driver = new FirefoxDriver();
        String url = "https://staging.shopplay.vn/auth/login"; // Replace with the desired URL
        driver.get(url);

        // Optional: Maximize the window
        driver.manage().window().maximize();
    }
}