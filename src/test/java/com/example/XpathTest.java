package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;	
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest {

    public static String baseUrl = "https://www.lipsum.com/";
    public static WebDriver driver;

    public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver","D:\\CloudEQ\\Selenium\\test1\\demo\\resources\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get(baseUrl);


        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,800)");


//TEXT PATH
        String Textpath =  driver.findElement(By.xpath("//h1[text()='Lorem Ipsum']")).getText();

        System.out.println("Textpath----------------------------------------------");
        System.out.println(Textpath);
        System.out.println("----------------------------------------------");


//BAsicxpath
        String BasicXPath =  driver.findElement(By.xpath("//a[@class='lnk']")).getText();

        System.out.println("BasicXPath----------------------------------------------");
        System.out.println(BasicXPath);
        System.out.println("----------------------------------------------");


//Contains Xpath
        String containsXpath =  driver.findElement(By.xpath("//*[contains(text(),'Donate Bitcoin')]")).getText();

        System.out.println("containsXpath----------------------------------------------");
        System.out.println(containsXpath);
        System.out.println("----------------------------------------------");


//startsWithXpath
        String startsWithXpath =  driver.findElement(By.xpath("//a[starts-with(@class,'lnk')]")).getText();
        System.out.println("startsWithXpath----------------------------------------------");
        System.out.println(startsWithXpath);
        System.out.println("----------------------------------------------");



//Or,and Xpath
        String orXpath =  driver.findElement(By.xpath("//*[@href='/banners' or @class='lnk']")).getText();
        String andXpath =  driver.findElement(By.xpath("//*[@href='/banners' and @class='lnk']")).getText();

        System.out.println("orXpath----------------------------------------------");
        System.out.println(orXpath);
        System.out.println(andXpath);
        System.out.println("----------------------------------------------");
    }
}

