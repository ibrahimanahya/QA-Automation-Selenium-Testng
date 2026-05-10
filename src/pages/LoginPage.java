package pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class LoginPage {

	    WebDriver driver;

	    By loginName = By.id("loginFrm_loginname");
	    By password = By.id("loginFrm_password");
	    By loginButton = By.xpath("//button[@title='Login']");

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void enterLoginName(String username) {
	        driver.findElement(loginName).sendKeys(username);
	    }

	    public void enterPassword(String pass) {
	        driver.findElement(password).sendKeys(pass);
	    }

	    public void clickLoginButton() {
	        driver.findElement(loginButton).click();
	    }
	}

