package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
  @DataProvider
  public void dataProvider() throws IOException {
	  File f=new File(System.getProperties()+"/DataFolder/userdetails.xlsx");
	  FileInputStream fi=new FileInputStream(f);
	  XSSFWorkbook wb=new XSSFWorkbook(fi);
	  int raws=wb.getSheetAt(0).getPhysicalNumberOfRows();
	  int cells=wb.getSheetAt(0).getRow(2).getPhysicalNumberOfCells();
	 Object [][]data=new Object[raws-1][cells];
	 for(int i=1;i<raws;i++)
	 {for(int j=0;j<cells;j++)
	 {
		 data[i-1][j]=wb.getSheetAt(0).getRow(i).getCell(j).getStringCellValue();
	 }
		 
	 }
	  
	  
	
	  
  }
}
