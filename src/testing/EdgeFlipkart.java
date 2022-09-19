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

public class EdgeFlipkart 
{
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver shubham = new EdgeDriver();
		
		shubham.get("https://www.flipkart.com/");
		
	//	shubham.manage().window().maximize();
		
		WebElement create = shubham.findElement(By.xpath("//a[@href='/account/login?signup=true']"));
		create.click();
		Thread.sleep(2000);
		
		WebElement mobile = shubham.findElement(By.xpath("//input[@maxlength='10']"));
		mobile.sendKeys("93673697361");
		Thread.sleep(2000);
		WebElement submit = shubham.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		submit.click();
		Thread.sleep(9000);
		WebElement signup = shubham.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		signup.click();
		
		
		Date d=new Date();
		String store = d.toString().replace(":", "-");
		
		File source= ((TakesScreenshot)shubham).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\aksha\\Desktop\\Screenshot Selenium\\"+store+".jpeg");
		FileHandler.copy(source, dest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
