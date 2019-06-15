package pack6_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.xpath("//body[@id='tinymce']")).click();
		driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("India");
	}

}
