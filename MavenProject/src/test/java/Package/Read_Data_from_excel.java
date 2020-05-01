package Package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read_Data_from_excel {
  @Test
public void f() throws IOException   
  {
	
	


	  
	  FileInputStream file= new FileInputStream("G:/Selenium softwares/Sample.xlsx");
	  XSSFWorkbook wb= new XSSFWorkbook(file);
	  XSSFSheet sheet=wb.getSheet("Sheet1");
	  int rowcount =sheet.getLastRowNum();
	  int colcount=sheet.getRow(0).getLastCellNum();
	  System.out.println("rcount:" +rowcount);
	  System.out.println("ccount:" +colcount);
	  
	  
	  for(int i=0;i<=rowcount;i++)
	  {
		  XSSFRow currentrow=sheet.getRow(i);
		   for(int j=0;j<colcount;j++)
		   {
			   String value=currentrow.getCell(j).toString();
			   System.out.print(" " +value);
		   }
	  	  
	 System.out.println();
	  }
  }
}
