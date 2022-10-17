package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.RemoveAllListItemsPage;
import util.BrowserFactory;

public class RemoveAllListItemsTest {
	WebDriver driver; 
	
	@Test
	public void userShouldBeAbleToRemoveAllListItems() { 
		driver = BrowserFactory.init(); 
		RemoveAllListItemsPage removeAllListItems = PageFactory.initElements(driver, RemoveAllListItemsPage.class);
		removeAllListItems.toggle_All_Checkbox();
		removeAllListItems.remove_button_function();
		removeAllListItems.validateUserShouldBeAbleToRemoveAllButtons();
	}
}
