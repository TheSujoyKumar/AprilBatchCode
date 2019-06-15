package pack6_Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//a[contains(.,'Office Online')]")).click();Thread.sleep(3000);
		System.out.println(driver.getWindowHandles());
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> itr = ids.iterator();
		itr.next();
		driver.switchTo().window(itr.next());
		driver.findElement(By.xpath("//a[contains(.,'My account')]")).click();
	}

}
