package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.RemoveOneListItemPage;
import util.BrowserFactory;

public class RemoveOneListItemTest {
	WebDriver driver;

	@Test
	public void RemoveOneListItemButton() {

		driver = BrowserFactory.init();

		RemoveOneListItemPage removeOneListItemPage = PageFactory.initElements(driver, RemoveOneListItemPage.class);
		removeOneListItemPage.remove_single_list();
		removeOneListItemPage.remove_button_function();
		removeOneListItemPage.validateSingleItemCanBeRemoved();
	}
}
