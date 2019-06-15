package pack5_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//WebDriverWait=====================================
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement userName =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//userName")));
		//FluentWait=========================================
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS)
				.ignoring(StaleElementReferenceException.class);
		
		fwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//userName")));
		
		
		driver.findElement(By.xpath("//passow"));
	}

}
