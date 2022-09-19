package testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.io.FileHandler;


public class ExcelsheetFetch 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		
		String path = "C:\\Users\\aksha\\Desktop\\test case for amazon cart.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		
		for (int a=11; a<sheet.getLastRowNum(); a++)
		{
			for (int b=1; b<=1; b++)
			{
				String value = sheet.getRow(a).getCell(b).getStringCellValue();
				
				System.out.println(value); 
				
			}
		}
		
		
		
		
//		String path = "C:\\Users\\aksha\\Desktop\\Test case.xlsx";
//		
//		FileInputStream file = new FileInputStream(path);
//		
//		String value = WorkbookFactory.create(file).getSheet("Test case").getRow(20).getCell(1).getStringCellValue();
//			
		
//		Handle dropdown
//		WebElement dropdown = prarik.findelement(By.xpath(path));
//		Select a = new Select(dropdown);
//		s.selectByValue();
//		
//		Takescreenshot
//		File source = ((TakesScreenshot)pratik).getScreenshotAs(Output.FILE);
//		File dest =new File("path");
//		FileHandler.copy("source", "dest");
//		
//		excelSheet
//		String path=" path of ss";
//		FileInputStream file = new FileInputStream(path);
//		String value = WorkbookFactory.create(file).getSheet("sheet number").getRow(0).getStringCellValue();
//		
//		
		
		
		
	}

}
