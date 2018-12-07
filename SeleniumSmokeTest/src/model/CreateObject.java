package model;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateObject {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"ember572\"]/span[2]")
	WebElement createObjectLink;

	@FindBy(xpath = "//*[@id=\"poi_name\"]")
	WebElement nameField;

	@FindBy(xpath = "//*[@id=\"poi_city_name\"]")
	WebElement cityField;

	@FindBy(xpath = "//*[@id=\"poi_place_id\"]")
	WebElement placeField;

	@FindBy(xpath = "//*[@id=\"poi_house_number\"]")
	WebElement houseNumberField;

	@FindBy(xpath = "//*[@id=\"poi_street_name_alt\"]")
	WebElement alternativeAddress;

	@FindBy(xpath = "//*[@id=\"poi_description\"]")
	WebElement description;

	@FindBy(xpath = "//*[@id=\"ember937\"]")
	WebElement chooseCategoryButton;

	@FindBy(xpath = "//*[@id=\"ember988\"]/div/div[2]/select")
	WebElement firstCategorySelect;

	@FindBy(xpath = "//*[@id=\"ember988\"]/div/div[3]/select")
	WebElement secondCategorySelect;

	@FindBy(xpath = "//*[@id=\"ember988\"]/div/div[4]/select")
	WebElement thirdCategorySelect;

	@FindBy(xpath = "//*[@id=\"place-form\"]/div[2]/div[2]/div[3]/div[2]/ul/li/input")
	WebElement tagsField;

	@FindBy(xpath = "//*[@id=\"btn_day_sat\"]/span[1]")
	WebElement saturdayButton;

	@FindBy(xpath = "//*[@id=\"btn_day_tue\"]/span[1]")
	WebElement tuesdayButton;

	@FindBy(xpath = "//*[@id=\"working_hours_0_0\"]")
	WebElement from;

	@FindBy(xpath = "//*[@id=\"working_hours_0_1\"]")
	WebElement to;

	@FindBy(xpath = "//*[@id=\"poi_phone\"]")
	WebElement homePhone;

	@FindBy(xpath = "//*[@id=\"poi_mobile_phone\"]")
	WebElement mobilePhone;

	@FindBy(xpath = "//*[@id=\"poi_fax\"]")
	WebElement fax;

	@FindBy(xpath = "//*[@id=\"poi_web\"]")
	WebElement webField;

	@FindBy(xpath = "//*[@id=\"poi_facebook_url\"]")
	WebElement facebookField;

	@FindBy(xpath = "//*[@id=\"poi_instagram_url\"]")
	WebElement instagramField;

	@FindBy(xpath = "//*[@id=\"poi_wikipedia_url\"]")
	WebElement wikipediaField;

	@FindBy(xpath = "//*[@id=\"poi_youtube_url\"]")
	WebElement youtubeField;

	@FindBy(xpath = "//*[@id=\"poi_email\"]")
	WebElement emailField;

	@FindBy(xpath = "//*[@id=\"poi_twitter_url\"]")
	WebElement twitterField;

	@FindBy(xpath = "//*[@id=\"poi_foursqare_url\"]")
	WebElement foursquareField;

	@FindBy(xpath = "//*[@id=\"poi_tripadvisor_url\"]")
	WebElement tripadvisorField;

	@FindBy(xpath = "//*[@id=\"poi_instagram_hashtag\"]")
	WebElement instagramHashTagField;

	@FindBy(xpath = "//*[@id=\"poi_has_wifi\"]")
	WebElement wifiCheckBox;

	@FindBy(xpath = "//*[@id=\"poi_wifi_pass\"]")
	WebElement wifiPasswordField;

	@FindBy(xpath = "//*[@id=\"poi_wifi_ssid\"]")
	WebElement wifiNameField;

	@FindBy(xpath = "//*[@id=\"poi_accepts_credit_cards\"]")
	WebElement objectCheckBox;

	@FindBy(xpath = "//*[@id=\"chk_credit_card_1\"]")
	WebElement visaCheckBox;

	@FindBy(xpath = "//*[@id=\"cc_other\"]")
	WebElement otherField;

	@FindBy(id = "fileToUpload")
	WebElement uploadElement;

	@FindBy(xpath = "//*[@id=\"poi_comment\"]")
	WebElement commentField;

	@FindBy(xpath = "//*[@id=\"place-form\"]/div[10]/div/button[1]")
	WebElement createButton;

	@FindBy(xpath = "//*[@id=\"ember564\"]")
	WebElement searchInputField;

	@FindBy(xpath = "//*[@id=\"ember1036\"]/div")
	WebElement objectField;

	@FindBy(xpath = "//*[@id=\"ember551\"]/img")
	WebElement homeImg;

	@FindBy(id = "fileToUpload")
	WebElement uploadImg;

	public CreateObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnCreateObjectLink() {
		createObjectLink.click();
	}

	public void setName(String name) {
		nameField.sendKeys(name);
	}

	public void setAndSelectCity(String city) throws InterruptedException {
		cityField.sendKeys(city);
//		Thread.sleep(1000);
		cityField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	//
	//

	public void setAndSelectPlace(String place) throws InterruptedException {
		placeField.sendKeys(place);
//		Thread.sleep(1000);
		placeField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
//		Thread.sleep(1000);
	}

	public void setHouseNumber(String houseNumber) throws InterruptedException {
		houseNumberField.sendKeys(houseNumber);
//		Thread.sleep(1000);
	}

	public void moveMarkerLeft(String pixels) {
		((JavascriptExecutor) driver).executeScript(""
				+ "var x = document.getElementsByClassName(\"leaflet-marker-icon place-form-marker-icon leaflet-zoom-animated leaflet-clickable leaflet-marker-draggable\");"
				+ "x[0].style.marginLeft=\"" + pixels + "\"");

	}

	public void clickOnChooseCategory() throws InterruptedException {
		chooseCategoryButton.click();
//		Thread.sleep(1000);

	}

	public void selectFirstCategory() throws InterruptedException {
		firstCategorySelect.click();
//		Thread.sleep(500);
		firstCategorySelect.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
//		Thread.sleep(1000);
	}

	public void selectSecondCategory() throws InterruptedException {

		secondCategorySelect.click();
//		Thread.sleep(500);
		secondCategorySelect.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
//		Thread.sleep(1000);

	}

	public void selectThirdCategory() throws InterruptedException {

		thirdCategorySelect.click();
//		Thread.sleep(500);
		thirdCategorySelect.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
//		Thread.sleep(1000);

	}

	public void scrollToTop() throws InterruptedException {
		//
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var divForScrolling =  document.getElementsByClassName(\"mCSB_container\");"
				+ "divForScrolling[0].style.top=\"0px\"; ");

//		Thread.sleep(2000);
	}

	public void scrollToBottom() throws InterruptedException {
//	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var divForScrolling =  document.getElementsByClassName(\"mCSB_container\");"
				+ "divForScrolling[0].style.top=\"-1100px\"; ");

//		Thread.sleep(2000);
	}

	public void scrollDownBy(Integer pixels) throws InterruptedException {
		//

		String javaScriptCode = "var divForScrolling =  document.getElementsByClassName(\"mCSB_container\");"
				+ "var currentTopPixels = divForScrolling[0].style.top;"
				+ "currentTopPixels = currentTopPixels.replace(\"px\",\"\"); " + "currentTopPixels +=" + pixels + ";"
				+ "currentTopPixels = eval(currentTopPixels);"
				+ "divForScrolling[0].style.top= currentTopPixels + \"px\";";
		System.out.println(javaScriptCode);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(javaScriptCode);

//		Thread.sleep(2000);

	}

	public void setTagsField(String tag) {
		tagsField.sendKeys(tag);
		tagsField.sendKeys(Keys.ENTER);

	}

	public void clickOnSaturday() {
		saturdayButton.click();

	}

	public void clickOnCreateButton() throws InterruptedException {

//		createButton = driver.findElement(By.xpath("//*[@id=\"place-form\"]/div[10]/div/button[1]"));
		createButton.click();
//		Thread.sleep(2500);
	}

	public void clickOnTuesday() {
		tuesdayButton.click();

	}

	public void setFrom(String from) {
		this.from.sendKeys(from);

	}

	public void setTo(String to) {
		this.to.sendKeys(to);

	}

	public void setHomePhoneNumber(String phoneNumber) {
		homePhone.sendKeys(phoneNumber);

	}

	public void setMobilePhoneNumber(String string) {
		mobilePhone.sendKeys(string);

	}

	public void setFaxNumber(String fax) {
		this.fax.sendKeys(fax);

	}

	public void setWebLink(String string) {
		webField.sendKeys(string);

	}

	public void setFacebookLink(String string) {
		facebookField.sendKeys(string);

	}

	public void setInstagramLink(String string) {
		instagramField.sendKeys(string);

	}

	public void setWikipediaLink(String string) {
		wikipediaField.sendKeys(string);

	}

	public void setYoutubeLink(String string) {
		youtubeField.sendKeys(string);

	}

	public void setEmailAddress(String string) {
		emailField.sendKeys(string);

	}

	public void setTwitterLink(String string) {
		twitterField.sendKeys(string);

	}

	public void setFoursquareLink(String string) {
		foursquareField.sendKeys(string);

	}

	public void setTripAdvisiorLink(String string) {
		tripadvisorField.sendKeys(string);

	}

	public void setInstagramHashTagLink(String string) {
		instagramHashTagField.sendKeys(string);

	}

	public void clickOnWifiCheckBox() {
		wifiCheckBox.click();

	}

	public void setWifiPassword(String string) {
		wifiPasswordField.sendKeys(string);

	}

	public void setWifiName(String string) {
		wifiNameField.sendKeys(string);

	}

	public void clickOnObjectCheckBox() {
		objectCheckBox.click();

	}

	public void clickOnVisaCheckBox() {
		visaCheckBox.click();

	}

	public void setOther(String string) {

		otherField.sendKeys(string);

	}

	public void uploadImg(String string) throws InterruptedException {
		uploadImg.sendKeys(string);
		// uploadImg.sendKeys( Keys.ENTER);
//		Thread.sleep(1000);

	}

	public void setComment(String string) {

		commentField.click();
		commentField.sendKeys(string);

	}

	public void setSearchInputField(String string) throws InterruptedException {
		searchInputField.sendKeys(string);
//		Thread.sleep(1000);
		searchInputField.sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
	}

	public void clickOnObjectField() throws InterruptedException {
		objectField.click();
//		Thread.sleep(1000);

	}

	public void clickOnHomeImg() {
		homeImg.click();
	}

	public void clickOnChooseFile() {
		uploadImg.click();

	}

}
