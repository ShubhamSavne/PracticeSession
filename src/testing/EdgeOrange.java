package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EdgeOrange 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 WebDriver pratik = new EdgeDriver();
		 
		pratik.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		
		WebElement username = pratik.findElement(By.name("username"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement Pass = pratik.findElement(By.xpath("//input[@name='password']"));
		Pass.sendKeys("admin123");
		Thread.sleep(2000);
		
		WebElement login = pratik.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(2000);
		
		
		WebElement employename = pratik.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		employename.sendKeys("shubham");
		Thread.sleep(2000);
		
		WebElement Id = pratik.findElement(By.xpath(null));
		Id.sendKeys("");
		Thread.sleep(2000);
		
		WebElement supervisior = pratik.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		supervisior.sendKeys("pratik");
		Thread.sleep(2000);
		
		WebElement status = pratik.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		Select a = new Select(status);
		a.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement include = pratik.findElement(By.xpath("//div[text()='Current Employees Only']"));
		Select b = new Select(include);
		b.selectByIndex(1);
		Thread.sleep(2000);
		
		WebElement job = pratik.findElement(By.xpath("(//div[text()='-- Select --'])[2]"));
		Select c = new Select(job);
		c.selectByIndex(1);
		Thread.sleep(2000);
		
		WebElement subunit = pratik.findElement(By.xpath("(//div[text()='-- Select --'])[3]"));
		Select d = new Select(subunit);
		d.selectByIndex(0);
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
