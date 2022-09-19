package testing;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;


public class DriverPractice1
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

	
	public static void main (String[] args) throws InterruptedException, IOException 
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		 driver = new EdgeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		
		Thread.sleep(2000);
		 
		WebElement mobile = driver.findElement(By.name("emailOrPhone"));
		mobile.sendKeys("9673697361");
		
		Thread.sleep(2000);
		
//		WebElement name = driver.findElement(By.xpath("//input[@name='fullName']"));
//		name.sendKeys("Shubham");
//		
//		Thread.sleep(2000);
//		
//		//WebElement username = driver.findElement(By.xpath(null));
//		
	
		
//		Date d= new Date();
//		String store = d.toString().replace(":", "-");
//		//Take a screenshot
//		File sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest = new File ("C:\\Users\\aksha\\Desktop\\Screenshot Selenium\\"+store+".jpeg");
//		FileHandler.copy(sourse, dest);
//		
		
		screenshot();
		
		
	}

}
