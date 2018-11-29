package webbasic.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuggestChanges {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"ember587\"]")
	WebElement suggestChanges;
	
	
	@FindBy(xpath="//*[@id=\"feedback\"]/div[1]/input")
	WebElement nameField;
	
	
	@FindBy(xpath = "//*[@id=\"feedback\"]/div[2]/input")
	WebElement emailField;
	
	
	
	@FindBy(xpath = "//*[@id=\"feedback\"]/div[3]/textarea")
	WebElement commentField;
	
	
	
	@FindBy(xpath = "//*[@id=\"feedback\"]/div[5]/div/input[1]")
	WebElement submitButton;
	
	@FindBy(xpath = "//*[@id=\"feedback\"]/div[5]/div/input[2]")	
	WebElement cancelButton;
	
	public SuggestChanges(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void clickOnSuggestChangeslink() {
		suggestChanges.click();
	}

	
	
	public void setName(String name) {
		nameField.sendKeys(name);
	}
	
	
	public void setEmail(String email) {
		emailField.sendKeys(email);
	}


	public void setComment(String comment) {
		commentField.sendKeys(comment);
	}


	public void clickonSubmitbutton() throws InterruptedException {
		submitButton.click();
		Thread.sleep(1000);

	}


	public void clickOnCancelbutton() throws InterruptedException {
		cancelButton.click();
		Thread.sleep(1000);

	}






}
