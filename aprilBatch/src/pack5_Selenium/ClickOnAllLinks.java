package pack5_Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAllLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++) {
			
			if(!links.get(i).getText().isEmpty()) {
				links.get(i).click();
				driver.navigate().back();
				links = driver.findElements(By.tagName("a"));
			}
		}
		/*
		 * for(WebElement temp:links) { if(!temp.getText().isEmpty()) { temp.click();
		 * Thread.sleep(3000); driver.navigate().back(); Thread.sleep(3000); links =
		 * driver.findElements(By.tagName("a")); } }
		 */
	}

}
