package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeZomato 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"navigation_cl6sw8kxa00002wnu93x42bgh\"]/li[4]"));
		signup.click();
		
		Thread.sleep(3000);
		WebElement name =driver.findElement(By.xpath("//*[@id=\"id-66\"]/section[2]/section/button"));
		
		name.sendKeys("123456789");
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
	}

}
