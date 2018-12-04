package webbasic.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EngSearchBar {

	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"ember558\"]")
	WebElement searchInputField;

	@FindBy(xpath = "//*[@id=\"ember549\"]/a/span")
	WebElement searchButton;

	@FindBy(xpath = "//*[@id=\"ember996\"]")
	WebElement objectButton;

	@FindBy(xpath = "//*[@id=\"mCSB_4\"]/div[1]/div[2]/div[4]/button[2]")
	WebElement claimButton;

	@FindBy(xpath = "//*[@id=\"claim-place\"]/div[1]/input")
	WebElement claimNameField;

	@FindBy(xpath = "//*[@id=\"claim-place\"]/div[2]/input")
	WebElement claimEmailfield;

	@FindBy(xpath = "//*[@id=\"claim-place\"]/div[3]/input")
	WebElement claimPhoneField;

	@FindBy(xpath = "//*[@id=\"claim-place\"]/div[4]/div/input[1]")
	WebElement claimSendbutton;

	@FindBy(xpath = "//*[@id=\"header_container\"]/ul[2]/li[1]/a")
	WebElement engButton;

	public EngSearchBar(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clikOnSearchBar() {
		searchInputField.click();
	}

	public void setNameofObject(String name) {
		searchInputField.sendKeys(name);
	}

	public void clickOnButtonSearch() {
		searchButton.click();
	}

	public void clickOnObjectButton() {
		objectButton.click();
	}

	public void clickOnClaimButton() {
		claimButton.click();
	}

	public void setCLaimName(String name) {
		claimNameField.sendKeys(name);
	}

	public void setClaimEmail(String email) {
		claimEmailfield.sendKeys(email);
	}

	public void setPhoneField(String phone) {

		claimPhoneField.sendKeys(phone);
	}

	public void clickOnSendButton() {
		claimSendbutton.click();
	}

	public void clickOnEngButton() {
		engButton.click();
	}

}