package com.example;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DropdownTest {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","D:\\CloudEQ\\Selenium\\test1\\demo\\resources\\drivers\\chromedriver.exe");
	    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	    WebDriver driver = new ChromeDriver();
		driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		drpCountry.selectByIndex(6);

		driver.close();
 }
}

