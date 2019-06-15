package pack8_Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();
		int totalCols = sheet.getRow(0).getLastCellNum();
		System.out.println(totalRows);
		System.out.println(totalCols);
		for(int r=0;r<=totalRows;r++) {
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<totalCols;c++) {
				if(row.getCell(c).getCellType()==CellType.STRING) {
					String strValue = row.getCell(c).getStringCellValue();
					System.out.print(" "+strValue+" ");
				}
				if(row.getCell(c).getCellType()==CellType.NUMERIC) {
					double numValue = row.getCell(c).getNumericCellValue();
					System.out.print(" "+numValue+" ");
				}
			}//end of inner for loop
			System.out.println("");
		}//End of Outer for loop

		wb.close();
		fis.close();
	}

}
