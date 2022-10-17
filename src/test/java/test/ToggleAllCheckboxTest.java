package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.ToggleAllCheckboxPage;
import util.BrowserFactory;

public class ToggleAllCheckboxTest {
	WebDriver driver; 
	
	@Test
	public void ToggleAllCheckboxFunctionalityTest() { 
		
		driver = BrowserFactory.init(); 
		
		ToggleAllCheckboxPage toggleAllCheckboxPage = PageFactory.initElements(driver, ToggleAllCheckboxPage.class);
		toggleAllCheckboxPage.validateToggleAll(); 
		toggleAllCheckboxPage.validate_toggle_checkBox();
	}
}
