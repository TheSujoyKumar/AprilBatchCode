package pack4_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.name("userName"));
		userName.sendKeys("mercury");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("mercury");
		
		WebElement signInBtn = driver.findElement(By.name("login"));
		signInBtn.click();
		
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.className("")).sendKeys("");
		driver.findElement(By.linkText("Create a Page")).sendKeys("");
		
		driver.findElement(By.partialLinkText("Create")).sendKeys("");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).click();
		
	}

}
