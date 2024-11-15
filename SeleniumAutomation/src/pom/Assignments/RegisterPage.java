package pom.Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;

	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;

	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;

	@FindBy(id = "LastName")
	private WebElement lastNameTextField;

	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(name = "Password")
	private WebElement passwordTextField;

	@FindBy(name = "ConfirmPassword")
	private WebElement confirmPasswordTextField;

	@FindBy(name = "register-button")
	private WebElement registerButton;

	@FindBy(xpath  = "//div[@class='result']")
	private WebElement successMsg;

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the maleRadioButton
	 */
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	/**
	 * @return the femaleRadioButton
	 */
	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	/**
	 * @return the firstNameTextField
	 */
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	/**
	 * @return the lastNameTextField
	 */
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	/**
	 * @return the registerButton
	 */
	public WebElement getRegisterButton() {
		return registerButton;
	}

	/**
	 * @param registerButton the registerButton to set
	 */
	public void setRegisterButton(WebElement registerButton) {
		this.registerButton = registerButton;
	}

	/**
	 * @return the emailTextField
	 */
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	/**
	 * @return the passwordTextField
	 */
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	/**
	 * @return the confirmPasswordTextField
	 */
	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	/**
	 * @return the successMsg
	 */
	public WebElement getSuccessMsg() {
		return successMsg;
	}

}
