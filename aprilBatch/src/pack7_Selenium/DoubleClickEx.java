package pack7_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sujoy/Desktop/asd.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Double-click me')]"));
		Actions act = new Actions(driver);
		act.doubleClick(element).build().perform();
	}

}
