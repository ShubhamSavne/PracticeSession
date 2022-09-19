package testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class EdgeSwiggy 
{
public static void main(String[] args) throws InterruptedException, IOException 
{
		
	System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\Downloads\\edgedriver_win64\\msedgedriver.exe");	
		
		WebDriver driver= new EdgeDriver();
		
		driver.navigate().to("https://partner.swiggy.com/login");
		//Thread.sleep(2000);
	/*	driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
	*/	Thread.sleep(2000);	
		
//		WebElement RegisterHere = driver.findElement(By.xpath("//a[@href='/register']"));
//		RegisterHere.click();
//		Thread.sleep(2000);
//		
//		WebElement mobile = driver.findElement(By.xpath("//input[@name='mobile']"));
//		mobile.sendKeys("987654321");
//		Thread.sleep(2000);
//		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
//		name.sendKeys("Shubham");
//		Thread.sleep(2000);
//		WebElement email =driver.findElement(By.xpath("//input[@autocomplete='email']"));
//		email.sendKeys("shubhamsavane@gmail.com");
//		Thread.sleep(2000);
//		WebElement passward =driver.findElement(By.xpath("//input[@name='password']"));
//		passward.sendKeys("Shubham@999");
//		Thread.sleep(2000);
//		WebElement confirm =driver.findElement(By.xpath("//input[@aria-label='Confirm Password']"));
//		confirm.sendKeys("Shubham@999");
//		Thread.sleep(2000);
//		WebElement checkbox = driver.findElement(By.xpath("//div[@class='css-175oi2r r-1loqt21 r-1otgn73 r-azxzu3 r-1nemu1e r-1jkafct r-rs99b7 r-1tl9yi8 r-1udh08x r-ig0lrl']"));
//		checkbox.click();
//		Thread.sleep(2000);
//		
		
	
		
		
		
		
		
		
		
		
}
	

}
