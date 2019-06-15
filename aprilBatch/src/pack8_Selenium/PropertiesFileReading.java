package pack8_Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Workspace\\aprilBatch\\aprilBatch\\src\\pack8_Selenium\\env.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.get("userName"));

	}

}
