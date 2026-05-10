package testStore;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver = new ChromeDriver();
	Random rand = new Random();
	String websiteUrl = "https://www.automationteststore.com/";
	String LoginPage= ("https://automationteststore.com/index.php?rt=account/login");
	String [] usernames = {"Ibrahim","Osama","Ahmad"};
	int randomUsername= rand.nextInt(usernames.length);
	int MyNumberForTheEmail=rand.nextInt(126578);
	String emailAddress=(usernames[randomUsername]+MyNumberForTheEmail+"@gmail.com");
	String PublicEmail;
	String Password="Test12333";
	String firstName=usernames[randomUsername];
	String lastName="Nahya";
	int randomLoginNumber=rand.nextInt(23451);
	int randomLoginNumber2= rand.nextInt(65321);
	String randomLoginNumber3=Integer.toString(randomLoginNumber*randomLoginNumber2);
	String loginName=firstName+lastName+randomLoginNumber3;
	
	
	
	
	public void TheSetup() {
		
		driver.get(websiteUrl);	
		
	    driver.manage().window().maximize();
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			
		driver.navigate().to(LoginPage);
		
		driver.findElement(By.cssSelector("button[title='Continue']")).click();
			
		
		
	}
	public void ScrollAndScreenshot(int TheValueWhereToStop,String screenshotorder) throws InterruptedException, IOException {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,arguments[0])", TheValueWhereToStop);
		Thread.sleep(1000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File MyTestScreenFile= ts.getScreenshotAs(OutputType.FILE);
		String timeSramp=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
		String filename=timeSramp+"_"+screenshotorder;
		FileUtils.copyFile(MyTestScreenFile, new File("src/screeshot"+filename+".jpg"));
		
	
		}
	public void TakeScreenshot(String screenshotorder) throws InterruptedException, IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File MyTestScreenFile= ts.getScreenshotAs(OutputType.FILE);
		String timeSramp=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
		String filename=timeSramp+"_"+screenshotorder;
		FileUtils.copyFile(MyTestScreenFile, new File("src/screeshot"+filename+".jpg"));
		
	
		}
	}
	
