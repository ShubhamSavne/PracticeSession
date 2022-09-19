package popupHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class IFrameHandling 
{
	
	public static WebDriver driver;
	public static void screenshot() throws IOException
	{
		Date d= new Date();
		String store = d.toString().replace(":", "/");
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest =  new File ("C:\\Users\\aksha\\Desktop\\Screenshot Selenium\\"+store+".jpeg");
		FileHandler.copy(source, dest);
	}
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver= new EdgeDriver();
		
		
		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement button = driver.findElement(By.xpath("//a[text()='Try it Yourself »']"));
		button.click();
		Thread.sleep(2000);
		
		ArrayList<String> window =new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(window.get(1));
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		
		

		driver.switchTo().frame(iframe);
	
		//driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		WebElement trybutton = driver.findElement(By.xpath("//button[text()='Try it']"));
		
		trybutton.click();
		
		Alert alt = driver.switchTo().alert();
	//	screenshot();
		Thread.sleep(3000);
		alt.accept();
		Thread.sleep(2000);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().parentFrame();
		WebElement button2 = driver.findElement(By.id("getwebsitebtn"));
		button2.click();
		
		Select a= new Select (trybutton);
		

		
		
	}

}
