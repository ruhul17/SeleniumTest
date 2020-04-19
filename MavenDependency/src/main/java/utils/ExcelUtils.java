package utils;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static void main(String[] args) throws IOException
	{
		getRowCount();
	}
	
	public static void getRowCount() throws IOException
	{
	
	
	//String projectpath = System.getProperty("user.dir");
	HSSFWorkbook workbook = new HSSFWorkbook();
	HSSFSheet sheet = workbook.getSheet("Sheet");
	int rowcount= sheet.getPhysicalNumberOfRows();
	
	System.out.println("Number of rows: "+rowcount);
	
	

}
}
