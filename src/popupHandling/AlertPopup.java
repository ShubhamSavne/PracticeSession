package popupHandling;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class AlertPopup 
{
	public static WebDriver driver;
	
	public static void screenshot() throws IOException
	{
		
	Date d= new Date();
	String store = d.toString().replace(":", "-");
	//Take a screenshot
	File sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File ("C:\\Users\\aksha\\Desktop\\Screenshot Selenium\\"+store+".jpeg");
	FileHandler.copy(sourse, dest);
	
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		 driver = new EdgeDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(2000);
		screenshot();
		WebElement submit= driver.findElement(By.xpath("//*[@name='submit']"));
		submit.click();
	
	
		
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		String text=alt.getText();
		System.out.println(text);
		

		
		alt.accept();
//		alt.dismiss();
//		alt.sendKeys(" ");
//		alt.getText();
		Thread.sleep(2000);
		String text2=alt.getText();
		System.out.println(text2);
		Thread.sleep(5000);
		screenshot();
		
		
		alt.accept();
//		Thread.sleep(2000);
//		Alert alt2 = driver.switchTo().alert();
//		String text2 = alt2.getText();
//		System.out.println(text2);
//		alt2.accept();
//		
		
		
		
		
	}

}
