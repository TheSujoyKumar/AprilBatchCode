package pack8_Selenium;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriting {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("myData");
		XSSFRow row0 = sheet.createRow(0);
		row0.createCell(0).setCellValue("India");
		row0.createCell(1).setCellValue("England");
		XSSFRow row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("Australia");
		row1.createCell(1).setCellValue("USA");
		
		FileOutputStream fos = new FileOutputStream("D:\\MyDataFile.xlsx");
		wb.write(fos);
		fos.flush();
		wb.close();
		fos.close();
		System.out.println("Done");
	}

}
