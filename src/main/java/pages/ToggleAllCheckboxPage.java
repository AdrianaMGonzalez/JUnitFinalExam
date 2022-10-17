package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAllCheckboxPage {
	WebDriver driver;

	public ToggleAllCheckboxPage(WebDriver driver) { // same name as the class name
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]")
	WebElement TOGGLE_ALL_CHECKBOX;

	public void validateToggleAll() {
		TOGGLE_ALL_CHECKBOX.click();
	}

	public void validate_toggle_checkBox() {
		boolean status = TOGGLE_ALL_CHECKBOX.isSelected();

		System.out.println("Checking boolean status:" + status);

		// checking condition is true or not.
		if (status) {
			System.out.println("allToggleCheckBox is selected sucessfully.");

		}

		else {
			System.out.println("allToggleCheckBox is not clicked suecessfully.");
		}
	}
}
