package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PolicyBazar 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		driver.navigate().to("https://investmentlife.policybazaar.com/trad-prequote");
		Thread.sleep(1500);
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='View plans']")));
//		
		WebElement name = driver.findElement(By.id("txtCustomerName"));
		name.sendKeys("shubham");
		
//		WebElement drop =driver.findElement(By.xpath("//label[text()='India']"));
//		Select a= new Select(drop);
//		a.selectByVisibleText("India");
		
		WebElement mobile = driver.findElement(By.id("txtMobileNo"));
	
		mobile.sendKeys("9123456789");
		
		WebElement email= driver.findElement(By.id("txtEmail"));
		email.sendKeys("asdfg@gmail.com");
		
		Thread.sleep(2000);
		WebElement view= driver.findElement(By.xpath("//button[text()='View Plans']"));
				view.click();
		
		
	}

}
