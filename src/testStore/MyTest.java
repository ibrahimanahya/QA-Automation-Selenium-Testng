package testStore;

import java.io.IOException;
import java.time.Duration;
import pages.SignupPage;
import pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
	
	@BeforeTest
	public void BeforeMyTest() {
		TheSetup();
	}
	
	@Test (priority = 1)
    public void SignUp() throws InterruptedException, IOException {
		
		SignupPage signupPage = new SignupPage(driver);
	  //Your Personal Details\\
		signupPage.enterFirstName(firstName);
		signupPage.enterLastName(lastName);
		signupPage.enterEmail(emailAddress);
		ScrollAndScreenshot(100,"1");
	  //Your Address\\
		signupPage.enterAddress1("123 King Abdullah Street");
		signupPage.selectCountry("Jordan");
		signupPage.selectRegion("Amman");
		signupPage.enterCity("Amman");
		signupPage.enterPostcode("11118");

		ScrollAndScreenshot(600, "2");

	   //Login Details\\

        signupPage.enterLoginName(loginName);
        signupPage.enterPassword(Password);
        signupPage.enterConfirmPassword(Password);

        ScrollAndScreenshot(1000, "3");

	   //Agreement & Continue\\
        signupPage.clickAgreeCheckbox();
        signupPage.clickContinue();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        boolean SignupResult = wait.until(
            ExpectedConditions.textToBePresentInElementLocated(
                By.tagName("body"),
                "Welcome back"
            )
        );
		Assert.assertEquals(SignupResult, true);
		
		driver.navigate().to("https://automationteststore.com/index.php?rt=account/account");
		//Logout\\
		driver.navigate().to("https://automationteststore.com/index.php?rt=account/logout");
		TakeScreenshot("LogoutPage");
	}
	
	@Test(priority = 2)
	public void Login() throws InterruptedException, IOException {
		LoginPage loginPage = new LoginPage(driver);

		driver.navigate().to(LoginPage);	
		loginPage.enterLoginName(loginName);
		loginPage.enterPassword(Password);
		loginPage.clickLoginButton();
	  TakeScreenshot("LoginPage");
		
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	  boolean loginResult = wait.until(
	      ExpectedConditions.textToBePresentInElementLocated(
	          By.tagName("body"),
	          "Welcome back"
	      )
	  );

	  Assert.assertEquals(loginResult, true);
	  
	    //Logout\\
	    driver.navigate().to("https://automationteststore.com/index.php?rt=account/logout");
	}
	
	@AfterTest
    public void AfterMyTest() {
			driver.close();
	}
}
