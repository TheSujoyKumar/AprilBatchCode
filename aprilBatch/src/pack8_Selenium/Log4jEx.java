package pack8_Selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jEx {
	public static Logger log = null;

	public static void main(String[] args) throws InterruptedException {
		String log4jConfigFile = "D:\\Workspace\\aprilBatch\\aprilBatch\\src\\pack8_Selenium\\log4j.properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		
		log = Logger.getLogger("rootLogger");
		log.info("UserName entered");
		log.error("This is an error msg");
		
		
		
	}

}
