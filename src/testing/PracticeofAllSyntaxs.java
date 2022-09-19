package testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class PracticeofAllSyntaxs 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://twitter.com/");
		Thread.sleep(2000);
		WebElement signup = driver.findElement(By.xpath("//span[contains(text(),'Sign up with')]"));
		
		signup.click();
		Thread.sleep(2000);
		
		
		
		
		
// //All Locators
//		WebElement a =  driver.findElement(By.xpath(null));
//		xpath= //tagname[@attribute='attribute value']
//				//tagname[text()='textvalue']
//				/html/class/class/class/..,,,/last valueatrribute
//				//parent tagname//attribute
//				and or not keyword
//				//class[@attribute='attribute value' and/or/not @attribute='attribute value']
//		
//			parent keyword	[regular x path]/parent::tagname(immidiate parent)
//			following sibling 
//			varcha [xpath]/ following-sibling::tagname (jo locate karaycha ahe to khalcha element)
//			preceding sibling
//			khalacha [xpath]/preceding-sibling::tagname(jo locate karaychay to varcha element)
//			
//	//handle the dropdown
//			WebElement listbox = driver.findElement(By.xpath(null));
//			Select a= new Select (listbox);
//			a.selectByIndex(0);
//			
//	//take the screenshot
//			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			File dest = new File("path where stores ss");
//			FileHandler.copy(source, dest);
//			
//	//mouse actions
//			Actions mouse = new Action(driver);
//			mouse.click();
//			mouse.doubleClick();
//			mouse.moveToElement(element);
//			mouse.contextClick();
//			mouse.build();	//required to join 2or more methods of mouse action are to be performed
//			mouse.perform(); // it is required to perform every action except click()
//
//	//Scrolling actions
//			JavascriptExecutor a= (JavascriptExecutor)driver;
//			a.executeScript("window.scrillBy(0,500)");
//			a.executeScript("arguments[0].scrillIntoView(true)", element);
//			
//			
//	//popup handling
//			Alert alt = driver.switchTo().alert();
//			alt.accept();
//			alt.dismiss();
//			alt.sendKeys("");
//			alt.getText();
//			
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
	}
	
	
	

}
