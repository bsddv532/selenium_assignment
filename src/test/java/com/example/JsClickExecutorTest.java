package com.example;
import org.openqa.selenium.By;      
import org.openqa.selenium.JavascriptExecutor;      
import org.openqa.selenium.WebDriver;      
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;    

public class JsClickExecutorTest {              
    @Test      
    public static void main(String[] args) throws InterruptedException                  

    {      
        System.setProperty("webdriver.chrome.driver","D:\\CloudEQ\\Selenium\\test1\\demo\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();                
        JavascriptExecutor js = (JavascriptExecutor)driver;                

        //Launching the Site.      
        driver.get("https://www.lipsum.com/"); 

        js.executeScript("window.scrollBy(0,800)");

        WebElement button =driver.findElement(By.xpath("//input[@id='generate']"));  
        js.executeScript("arguments[0].click();", button);

    }      

}
//input[@id='generate']