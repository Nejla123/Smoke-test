package model;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBar {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"ember564\"]")
	WebElement searchInputField;

	@FindBy(xpath = "//*[@id=\"ember555\"]/a")
	WebElement searchButton;

	@FindBy(xpath = "//*[@id=\"ember1002\"]")
	WebElement objectButton;

	@FindBy(xpath = "//*[@id=\"mCSB_4\"]/div[1]/div[2]/div[4]/button[1]")
	WebElement suggestChangesonObject;

	@FindBy(xpath = "//*[@id=\"poi_description\"]")
	WebElement descriptionField;

	@FindBy(xpath = "//*[@id=\"place-form\"]/div[10]/div/button[1]")
	WebElement suggestChangesButton;

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

	public SearchBar(WebDriver driver) {
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

	public void clickSuggestChangesonObject() {
		suggestChangesonObject.click();
	}

	public void setDescription(String description) {
		descriptionField.sendKeys(description);
	}

	public void scrollDown(String pixels) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("var divForScrolling =  document.getElementsByClassName(\"mCSB_container\");"
				+ "divForScrolling[0].style.top=\"" + pixels + "\"; ");

		Thread.sleep(2000);
	}

	public void clickOnSuggestChangesButton() {
		suggestChangesButton.click();
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