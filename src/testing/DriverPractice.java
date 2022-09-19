package testing;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DriverPractice 
{
	
//	Handle dropdown
//	WebElement dropdown = prarik.findelement(By.xpath(path));
//	Select a = new Select(dropdown);
//	s.selectByValue();
//	
//	Takescreenshot
//	File source = ((TakesScreenshot)pratik).getScreenshotAs(Output.FILE);
//	File dest =new File("path");
//	FileHandler.copy("source", "dest");
//	
//	excelSheet
//	String path=" path of ss";
//	FileInputStream file = new FileInputStream(path);
//	String value = WorkbookFactory.create(file).getSheet("sheet number").getRow(0).getStringCellValue();
//	
//	
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\aksha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\aksha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/search?q=selenium&rlz=1C1VDKB_enIN1017&oq=&aqs=chrome.3.35i39i362l8.4859712138j0j7&sourceid=chrome&ie=UTF-8");
		WebDriver  driver = new  EdgeDriver();
		
		
		//driver.get("https://chromedriver.chromium.org");
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		
/*		Thread.sleep(3000);
		driver.get("https://www.google.com/chrome/thank-you.html?brand=VDKB&statcb=1&installdataindex=empty&defaultbrowser=0");
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.bing.com/search?q=google+chrome&cvid=e4d631c22a274d4cb85403277362b162&aqs=edge.2.46j69i57j0l4j69i60l3.5496j0j1&pglt=299&FORM=ANSPA1&PC=HCTS&ntref=1");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://chromedriver.chromium.org");
	
		

		Thread.sleep(3000);
		
		driver.navigate().back();					//navigae to backward page
		Thread.sleep(3000);
		
		driver.navigate().forward();				//navigate to forward page
		Thread.sleep(3000);
		
		String URL =driver.getCurrentUrl();			//url of website
		System.out.println(URL);
		Thread.sleep(3000);
		
		String Title= driver.getTitle();			//gettingTitle of website
		System.out.println(Title);
		Thread.sleep(3000);
		
		driver.manage().window().maximize();		//Method Chaining
		Thread.sleep(3000);							//maximize
		
		//driver.manage().window().minimize();		//minimize only after 4.0 version of selenium
		//Thread.sleep(3000);	
		
		Dimension d= new Dimension(500,800);		//size of window in x and y direction in pixel size
								//dimension method should be imported from the selenium class
		driver.manage().window().setSize(d);		//size of window as per dimension
	
		Point p= new Point(300,600);
		driver.manage().window().setPosition(p);
		
		//driver.close();	//to close the current tab which is open by selenium only not manually
		//driver.quit();	//to close whole browser
	
		// from 8/8/2022 monday onwards
		
		Thread.sleep(3000);
		WebElement username =driver.findElement(By.id("email"));
		
		username.sendKeys("shubham");
		
		Thread.sleep(3000);
		WebElement passward =driver.findElement(By.id("pass"));
		
		passward.sendKeys("Raj@999");
	
		Thread.sleep(3000);
		
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		
		username.sendKeys("Shubham");
		Thread.sleep(3000);
		
		WebElement loginbutton =driver.findElement(By.name("login"));
		
		loginbutton.click();
	*/	
		
		WebElement create = driver.findElement(By.xpath("//a[@role='button' and text()='Create New Account']"));
		create.click();
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("abcd");
		Thread.sleep(2000);
		
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("wxyz");
		Thread.sleep(2000);
		
		WebElement mobile = driver.findElement(By.xpath("//input[contains(@name,'reg_email')]"));
		mobile.sendKeys("123456789");
		Thread.sleep(2000);
		
		WebElement passward = driver.findElement(By.xpath("//input[contains(@name,'passwd')]"));
		passward.sendKeys("Pqrs@123");
		Thread.sleep(2000);
		
		WebElement day= driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByValue("9");
		Thread.sleep(2000);
		
//		WebElement month= driver.findElement(By.className("//select[@title='Month']"));
//		Select s2 = new Select(month);
//		s2.selectByValue("3");
//		Thread.sleep(2000);
//		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("1996");
		Thread.sleep(2000);
		
		WebElement gender = driver.findElement(By.xpath("//label[text()='Custom']"));
		gender.click();
		
		WebElement pronoun = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		Select s4 = new Select(pronoun);
		s3.selectByVisibleText("He: \"Wish him a happy birthday!\"");
		Thread.sleep(2000);
		
		WebElement gender2 = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		gender2.sendKeys("male");
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
//		
//		WebElement signup = driver.findElement(By.xpath(null));
//		signup.click();
//		Thread.sleep(2000);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
