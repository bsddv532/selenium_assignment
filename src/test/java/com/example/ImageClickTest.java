package com.example;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class ImageClickTest {				
    		
    public static void main(String[] args) {									
        String baseUrl = "https://demo.guru99.com/test/newtours/";	
        System.setProperty("webdriver.chrome.driver","D:\\CloudEQ\\Selenium\\test1\\demo\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);					
        driver.findElement(By.cssSelector("a[title=\"Home\"]")).click();					
		driver.close();		
    }		
}