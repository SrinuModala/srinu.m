package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readdataExcelsheet {
	public static void main(String[] args) throws Exception {
		
	

	FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\SRINU\\src\\main\\resources\\Book2.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	String data=sh.getRow(0).getCell(1).getStringCellValue();
	System.out.println(data);

	}

}
