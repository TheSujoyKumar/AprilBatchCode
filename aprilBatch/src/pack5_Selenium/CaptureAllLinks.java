package pack5_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links="+links.size());
		
		for(WebElement temp:links) {
			if(!temp.getText().isEmpty()) {
				System.out.println(temp.getText());
			}
			
		}
		
		driver.close();
	}

}
