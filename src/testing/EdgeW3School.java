package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeW3School 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.w3schools.com/");
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[@class=\"w3-bar-item w3-btn w3-right\"]"));
		login.click();
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
				email.sendKeys("shubhamsavane@gmail.com");
				Thread.sleep(2000);
				
				WebElement passward = driver.findElement(By.xpath("//input[@name='current-password']"));
				passward.sendKeys("Raj@123");
		
				
				
	}

}
