package pack4_Selenium;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ProxyManualEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\browserDrivers\\geckodriver.exe");
		
		String manualProxy = "dummyproxy:9090";
		Proxy prox = new Proxy();
		//prox.setProxyType(ProxyType.MANUAL);
		prox.setHttpProxy(manualProxy);
		prox.setSslProxy(manualProxy);
		prox.setFtpProxy(manualProxy);
		prox.setSocksProxy(manualProxy);
		//prox.setSocksVersion(4);
		FirefoxOptions option = new FirefoxOptions();
		option.setProxy(prox);
		
		FirefoxDriver driver = new FirefoxDriver(option);
		driver.get("http://newtours.demoaut.com/");
	}

}
