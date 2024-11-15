package pom.Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//initilization
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerLink;
	
	

	// initialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

// getters
	public WebElement getRegisterLink() {
		return registerLink;
	}

}
