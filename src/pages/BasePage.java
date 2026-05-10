package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class BasePage {
	
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	public void type(By locator,String text) {
		driver.findElement(locator).sendKeys(text);
	}
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	public void selectByText(By Locator,String text) {
		Select select = new Select(driver.findElement(Locator));
		select.selectByVisibleText(text);
	}

}
