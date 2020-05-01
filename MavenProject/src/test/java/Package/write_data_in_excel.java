package Package;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.testng.annotations.Test;
import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class write_data_in_excel 
{
  @Test
  public void f() 
  {
	 // File file = new File("G:\\Selenium softwares\\Write data in Excel.xlsx");
	 //FileOutputStream file = new FileOutputStream("G:\\Selenium softwares\\Write data in Excel.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook();	  
	  //XSSFWorkbookFactory workbook = new XSSFWorkbookFactory();
	  //XSSFSheet sheet= workbook.Create
	  XSSFSheet sh = wb.createSheet();
	 // XSSFSheet sh = wb.createSheet("First Sheet");
	  
	  
			  
}}
