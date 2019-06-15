package pack4_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://newtours.demoaut.com/");

	}

}
