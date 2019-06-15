package pack8_Selenium;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteDropdownOptions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\browserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		List<WebElement> countries = driver.findElements(By.xpath("//select[@name='country']/option"));

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("CountryNames");

		for (int i = 0; i < countries.size(); i++) {
			String countryName = countries.get(i).getText();
			System.out.println(countryName);
			sheet.createRow(i).createCell(0).setCellValue(countryName);
		}

		FileOutputStream fos = new FileOutputStream("D:\\MercuryCountry.xlsx");
		wb.write(fos);
		fos.flush();
		wb.close();
		fos.close();
		driver.close();
	}

}
