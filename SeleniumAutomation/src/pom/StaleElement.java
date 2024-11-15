package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaleElement {
	// Declaration
	@FindBy(id = "navbar-search-input")
	private WebElement searchTextField;

	// initialization
	public StaleElement(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the searchTextField
	 */
	public WebElement getSearchTextField() {   
		return searchTextField;
	}
}

