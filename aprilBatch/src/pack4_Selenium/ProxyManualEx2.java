package pack4_Selenium;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ProxyManualEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\browserDrivers\\geckodriver.exe");
		
		String manualProxy = "dummyproxy:9090";
		Proxy prox = new Proxy();
		//prox.setProxyType(ProxyType.MANUAL);
		prox.setHttpProxy(manualProxy);
		prox.setSslProxy(manualProxy);
		prox.setFtpProxy(manualProxy);
		prox.setSocksProxy(manualProxy);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, prox);
		FirefoxDriver driver = new FirefoxDriver(cap);
		driver.get("http://newtours.demoaut.com/");
	}

}
