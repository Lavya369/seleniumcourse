package exceloperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataByColumnNumber {

	public static void main(String[] args) throws Exception 
	{
		File f= new File("C:\\Users\\barig\\OneDrive\\Desktop\\testdata.xlsx"); 
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		 XSSFRow row = sheet.getRow(1);          //which  row u want write
		XSSFCell cell = row.getCell(4);				// which cell u want write
		cell.setCellValue("Failed");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		fos.close();
		 String value =cell.getStringCellValue();
		 System.out.println(value);

		//wb.write(fos);
		//wb.close();
		//fos.close();
		
		
	}

}
