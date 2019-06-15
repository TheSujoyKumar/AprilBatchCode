package pack7_Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement tBody = driver.findElement(By.xpath("//table[@id='table1']/tbody"));
		List<WebElement> rows = tBody.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++) {
			
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			 for(int j=0;j<cols.size();j++) {
				 System.out.print("--"+cols.get(j).getText()+"--");
			 }
			 System.out.println("");
		}
		
		driver.close();
		
	}

}
