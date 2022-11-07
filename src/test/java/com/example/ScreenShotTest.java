package com.example;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShotTest {

public static void main(String[] args) throws IOException {
	
System.setProperty("webdriver.chrome.driver", "D:\\CloudEQ\\Selenium\\test1\\demo\\resources\\drivers\\chromedriver.exe");
WebDriver driver  = new ChromeDriver();	

driver.get("http://demo.guru99.com/test/guru99home/");
driver.manage().window().maximize();
		
Screenshot ScreenShotTest = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

ImageIO.write(ScreenShotTest.getImage(), "jpg", new File("D:\\CloudEQ\\Selenium\\test1\\demo\\ElementScreenshot.jpg"));

	}

}



// <!-- https://mvnrepository.com/artifact/ru.yandex.qatools.ashot/ashot -->
// <dependency>
//     <groupId>ru.yandex.qatools.ashot</groupId>
//     <artifactId>ashot</artifactId>
//     <version>1.5.4</version>
// </dependency>