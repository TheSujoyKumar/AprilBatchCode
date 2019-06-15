package pack7_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/worldclock/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div[@class='arrow']")).click();
		//Thread.sleep(10000);
		
		
		WebElement aboutYss = driver.findElement(By.xpath("(//a[contains(text(),'Home')])[1]"));
		WebElement emailUs = driver.findElement(By.xpath("(//a[contains(text(),'About Us')])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(aboutYss).moveToElement(emailUs).click().build().perform();
		
	}

}
