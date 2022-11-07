package com.example;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class TableTest {
    public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/test/accessing-nested-table.html";
        System.setProperty("webdriver.chrome.driver","D:\\CloudEQ\\Selenium\\test1\\demo\\resources\\drivers\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        String innerText = driver.findElement(
            By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText(); 		
            System.out.println(innerText); 
        driver.quit();
    }
}
