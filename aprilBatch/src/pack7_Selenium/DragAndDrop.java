package pack7_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement To = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(from).moveToElement(To).release().build().perform();
	}

}
