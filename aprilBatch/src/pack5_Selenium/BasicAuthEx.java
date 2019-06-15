package pack5_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
