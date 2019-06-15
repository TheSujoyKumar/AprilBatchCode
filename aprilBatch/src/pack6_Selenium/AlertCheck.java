package pack6_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		boolean alertFlag=true;
		try {
		Alert alert  = wait.until(ExpectedConditions.alertIsPresent());
		}
		catch(Exception e) {
			alertFlag=false;
		}
		if(alertFlag) {
			System.out.println("Alert is Present");
			
		}
		else {
			System.out.println("Alert is not Present");
		}
	}

}
