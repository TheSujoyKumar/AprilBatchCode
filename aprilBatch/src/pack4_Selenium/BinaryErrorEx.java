package pack4_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BinaryErrorEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://newtours.demoaut.com/");

	}

}
