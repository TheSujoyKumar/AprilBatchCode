package pack6_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept(); //OK
		alert.dismiss();// Cancel
		alert.sendKeys("Sujoy"); // Enter text in alert
		alert.accept(); // OK

	}

}
