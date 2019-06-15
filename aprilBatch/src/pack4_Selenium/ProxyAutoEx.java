package pack4_Selenium;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ProxyAutoEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\browserDrivers\\geckodriver.exe");
		
		
		
		Proxy prox = new Proxy();
		
		prox.setProxyAutoconfigUrl("http://free-prox445665yserver.com/");
		
		FirefoxOptions option = new FirefoxOptions();
		option.setProxy(prox);
		
		FirefoxDriver driver = new FirefoxDriver(option);
		driver.get("http://newtours.demoaut.com/");
	}

}
