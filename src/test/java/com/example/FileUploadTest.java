package com.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUploadTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\CloudEQ\\Selenium\\test1\\demo\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();					
    
        String baseUrl = "http://demo.guru99.com/test/upload/";

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\Acer\\OneDrive\\Desktop\\Docs\\nrql.txt");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        driver.close();
        
        }
}