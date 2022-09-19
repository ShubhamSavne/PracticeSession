package testing;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActions 
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
		
//		Actions mouse = new Actions(pratik); 	//Action class constructor from selenium
//		mouse.click();				//left click
//		mouse.contextClick();		//right click
//		mouse.doubleClick();		//double click
//		mouse.moveToElement(username);//move to courser to element of webpage
//		mouse.build();	//it is mandetory to perform the action using 2 or more methods of mouse at a one time
//		
//			//mouse.moveToElement(username).click().build().perform();
//		
//		mouse.perform();				//it is also mandetory to perform every action except click method
//				//mouse.contextClick().perform();
//		
		
		
	//	Thread.sleep(10000);	//static
//	
////implicit wait //time				//dynamic
//		pratik.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	//dynamic
//		//exception= no such element
//				
//		
//		WebElement Pass = pratik.findElement(By.xpath("//input[@name='password']"));
//		Pass.sendKeys("admin123");
//		
//		
//		
//		
//		pratik.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		WebElement username = pratik.findElement(By.name("username"));
//		username.sendKeys("Admin");
//		Thread.sleep(2000);
//		
//		// exception= no such element
//		
//		
//	//	Explicit Wait //time+conditiom		//dynamic sleep
//		
//	 	WebDriverWait wait = new WebDriverWait(pratik, Duration.ofSeconds(10)); //0.5sec ,0.5,0.5,0.5
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
//										
//		//no such element exception
//		
//		 WebElement Pass = pratik.findElement(By.xpath("//input[@name='password']"));
//		Pass.sendKeys("admin123");
//														
//		
//		
//	//fluent wait //time+condition+polling frequency
//		
//		Wait <WebDriver> fluentwait= new FluentWait<WebDriver>(pratik)		//upcasting wait is supermost interface fluent is subclass and implementation class
//									.withTimeout(Duration.ofSeconds(20))	//thread sleep of 20 sec
//									.pollingEvery(Duration.ofSeconds(2))	//rotation of checking every 2 sec
//									.ignoring(NoSuchElementException.class);//execute ehen exception is found which is given in condition
//		
	}
	

}
