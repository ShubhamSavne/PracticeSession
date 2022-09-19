package popupHandling;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ChildBrowserPopup 
{
	
	public static WebDriver driver;
	
	public static void screenshot() throws IOException
	{
		Date d = new Date();
		String store =d.toString().replace(":", "-");
		
		File sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\aksha\\Desktop\\Screenshot Selenium\\"+store+".jpeg");
		FileHandler.copy(sourse, dest);
	}
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		
		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(3000);
		
		
		WebElement alert = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself ')])[1]"));
		alert.click();
		Thread.sleep(2000);
		
		WebElement confirm = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself ')])[2]"));
		confirm.click();
		Thread.sleep(2000);
		
		WebElement prompt = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself ')])[3]"));
		prompt.click();
		Thread.sleep(2000);
		
		WebElement linebreaks = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself ')])[4]"));
		linebreaks.click();
		Thread.sleep(2000);
		
		
		System.out.println("main page info");
		String main= driver.getWindowHandle();
		System.out.println("main:"+main);
		System.out.println(driver.getCurrentUrl());
//		screenshot();
		System.out.println("*********************************************");
		Thread.sleep(2000);

		ArrayList<String> address=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println("info of last switch page i.e.last in first out concept");
		driver.switchTo().window(address.get(1));
		System.out.println(address.get(1));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
//		WebElement button = driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
//	button.click();
//		screenshot();
		System.out.println("*********************************************");
		Thread.sleep(2000);
		
		
	
		
		
	
		
		
		System.out.println("info of 2nd index from top");
		driver.switchTo().window(address.get(2));
		System.out.println(address.get(2));
		System.out.println(driver.getCurrentUrl());
//		screenshot();
		System.out.println("*********************************************");
		Thread.sleep(2000);
		
		System.out.println("info of 3nrd index from top");
		driver.switchTo().window(address.get(3));
		System.out.println(address.get(3));
		System.out.println(driver.getCurrentUrl());
//		screenshot();
		System.out.println("*********************************************");
		Thread.sleep(2000);
		
		System.out.println("info of 4th index from top");
		driver.switchTo().window(address.get(4));
		System.out.println(address.get(4));
		System.out.println(driver.getCurrentUrl());
//		screenshot();
		System.out.println("*********************************************");
		Thread.sleep(2000);
		
		System.out.println("*'getWindowHandle'* this method does not direct to main webpage but it still navigate same page that he is on last time i.e. 4th index");
		String main2= driver.getWindowHandle();
		System.out.println("main:"+main2);
		System.out.println(driver.getCurrentUrl());
	screenshot();
		System.out.println("*********************************************");
		Thread.sleep(2000);
		
		System.out.println("0th index is for main web page which is opened for first time by selenium");
		driver.switchTo().window(address.get(0));
		System.out.println(address.get(0));
		System.out.println(driver.getCurrentUrl());
//		screenshot();
		System.out.println("*********************************************");
		Thread.sleep(2000);
	
	
	
	
	
	
	}
	
	
	
	

}
