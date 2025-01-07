package exceloperation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataByColumnNumber {

	public static void main(String[] args) throws Exception 
	{
		File f= new File("C:\\Users\\barig\\OneDrive\\Desktop\\testdata.xlsx"); 
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row =  sheet.getRow(1);
		XSSFCell cell = row.getCell(1);
		String value = cell.getStringCellValue();
		System.out.println(value);
		wb.close();
		fis.close();
	}

}
