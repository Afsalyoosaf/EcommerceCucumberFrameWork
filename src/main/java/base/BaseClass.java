package base;

import java.time.Duration;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void initliazeDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
	}
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}
}
