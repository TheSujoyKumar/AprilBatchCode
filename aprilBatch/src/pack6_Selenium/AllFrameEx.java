package pack6_Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllFrameEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		for(int i=0;i<frames.size();i++) {
			driver.switchTo().frame(frames.get(i));
			try {
			WebElement okBtn = driver.findElement(By.id("OkBtn"));
			
			okBtn.click();
			break;
			}
			catch(Exception e) {
				
			}
			
		}
		
		
		driver.close();
	}

}
