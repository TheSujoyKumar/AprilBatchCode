package pack5_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureHeaderLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		WebElement header = driver.findElement(By.id("sc_hdu"));
		header.findElements(By.tagName("a"));
	}

}
