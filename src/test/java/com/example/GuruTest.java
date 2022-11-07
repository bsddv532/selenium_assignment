package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruTest {
    public static String baseUrl = "http://demo.guru99.com/test/newtours/";
    public static String expectedTitle = "Welcome: Mercury Tours";
    public static String actualTitle = "";
    public static WebDriver driver;

    public static void main(String [] args) {

        System.setProperty("webdriver.chrome.driver","D:\\CloudEQ\\Selenium\\test1\\demo\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("----------------------------------------------");
            System.out.println("Test Passed!");
            System.out.println("----------------------------------------------");

        } else {
            System.out.println("Test Failed");
        }


        driver.findElement(By.name("userName")).click();
        driver.findElement(By.name("userName")).sendKeys("username");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();
        
        driver.close();
    }

}