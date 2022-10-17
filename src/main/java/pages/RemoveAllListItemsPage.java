package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//create constructor from the class
//define webElements
//methods to interact with webelements
//

public class RemoveAllListItemsPage {
	WebDriver driver;

	public RemoveAllListItemsPage(WebDriver driver) { // constructor
		this.driver = driver;
	}

	// @Test
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]")
	WebElement toggle_all_checkbox;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]")
	WebElement REMOVE_CHECKBOX;

	public void toggle_All_Checkbox() {
		toggle_all_checkbox.click();
	}

	public void remove_button_function() {
		REMOVE_CHECKBOX.click();
	}

	public void validateUserShouldBeAbleToRemoveAllButtons() {
		boolean status = toggle_all_checkbox.isEnabled();
		// confirming what is there in status for learning purpose otherwise no need
		System.out.println("Checking boolean status:" + status);

		// checking condition is true or not.
		if (status) {
			System.out.println("ALL LIST ITEMS HAS BEEN REMOVED");
		}

		else {
			System.out.println("ALL LIST ITEMS CAN NOT BE REMOVED");
		}

	}
}
