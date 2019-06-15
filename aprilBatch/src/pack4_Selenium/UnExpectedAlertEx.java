package pack4_Selenium;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class UnExpectedAlertEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\browserDrivers\\geckodriver.exe");
		FirefoxOptions option = new FirefoxOptions();
		option.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		FirefoxDriver driver = new FirefoxDriver(option);
		driver.get("http://newtours.demoaut.com/");
	}

}
