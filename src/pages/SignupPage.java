package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends BasePage {

	WebDriver driver;

	
	By firstname= By.id("AccountFrm_firstname");
	By lastname= By.id("AccountFrm_lastname");
	By email= By.id("AccountFrm_email");
    By address1=By.id("AccountFrm_address_1");
    By city=By.id("AccountFrm_city");
    By countryDropdown=By.id("AccountFrm_country_id");
    By regionDropdown=By.id("AccountFrm_zone_id");
    By postcode=By.id("AccountFrm_postcode");
    By LoginName=By.id("AccountFrm_loginname");
    By password=By.id("AccountFrm_password");
    By confirmPassword=By.id("AccountFrm_confirm");
    By agreeCheckbox = By.id("AccountFrm_agree");
    By continueButton = By.xpath("//button[@title='Continue']");
    
		public SignupPage(WebDriver driver) { 
		         super(driver);	
	}
	
		public void enterFirstName(String fname) {
			
			//driver.findElement(firstname).sendKeys(fname);
			type(firstname, fname);
		}
	
		public void enterLastName(String lname) {

			type(lastname, lname);

		}

		public void enterEmail(String emailAddress) {

			type(email, emailAddress);
		}
		public void enterAddress1(String address) {
			type(address1, address);
		}

		public void enterCity(String cityName) {
			type(city,cityName);
		}

		public void selectCountry(String countryName) {
		  selectByText(countryDropdown,countryName);
		}

		public void selectRegion(String regionName) {
		    selectByText(regionDropdown,regionName);
		}

		public void enterPostcode(String postalCode) {
		   type(postcode,postalCode);
		}

		public void enterLoginName(String loginName) {
		    type(LoginName,loginName);
		}

		public void enterPassword(String pass) {
		    type(password,pass);
		}

		public void enterConfirmPassword(String confirmPass) {
		    type(confirmPassword,confirmPass);
		}	
		public void clickAgreeCheckbox() {
		    click(agreeCheckbox);
		}

		public void clickContinue() {
		    click(continueButton);
		}
}
