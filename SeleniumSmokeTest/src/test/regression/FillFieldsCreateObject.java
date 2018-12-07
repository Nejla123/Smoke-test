package test.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import model.CreateObject;

public class FillFieldsCreateObject {
	private WebDriver driver;
	private CreateObject createObject;
	private String baseURL = "http://www.navigator.ba";

	@BeforeTest
	public void setupEnviromnent() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nejla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		createObject = new CreateObject(driver);
	}

	@Test
	public void testFillAllFields() throws InterruptedException {
		driver.get(baseURL);
		createObject.clickOnCreateObjectLink();
		createObject.setName("Milky");
		createObject.setAndSelectCity("Sarajevo");
		createObject.setAndSelectPlace("Omera Kovača");
		createObject.setHouseNumber("4");

		createObject.moveMarkerLeft("-400px");
		createObject.clickOnChooseCategory();
		createObject.selectFirstCategory();
		createObject.selectSecondCategory();

		createObject.selectThirdCategory();
		createObject.setTagsField("#kafa");

		createObject.scrollDownBy(-400);

		createObject.clickOnSaturday();
		createObject.clickOnTuesday();
		createObject.setFrom("10");
		createObject.setTo("22");

		createObject.setHomePhoneNumber("033205587");
		createObject.setMobilePhoneNumber("061475222");
		createObject.setFaxNumber("033978636");

		createObject.scrollDownBy(-300);

		createObject.setWebLink("http://www.navigator.ba/#/create-place");
		createObject.setFacebookLink("https://en-gb.facebook.com/login/");
		createObject.setInstagramLink("https://www.instagram.com/accounts/login/");
		createObject.setWikipediaLink("https://hr.wikipedia.org/wiki/Glavna_stranica");
		createObject.setYoutubeLink("https://www.youtube.com/playlist?list=PLD9935EF71A60728A");

		createObject.setEmailAddress("milky22@gmail.com");
		createObject.setTwitterLink("https://twitter.com/login");
		createObject.setFoursquareLink("https://foursquare.com/");
		createObject.setTripAdvisiorLink("https://www.tripadvisor.com/");
		createObject.setInstagramHashTagLink("#good");

		createObject.scrollDownBy(-300);
		createObject.clickOnWifiCheckBox();
		createObject.setWifiPassword("apple");
		createObject.setWifiName("Public");

		createObject.clickOnObjectCheckBox();
		createObject.clickOnVisaCheckBox();
		createObject.setOther("Payment on delivery");

		createObject.scrollDownBy(-300);

		// createObject.clickOnChooseFile();

		createObject.uploadImg("C:\\Users\\Nejla\\Desktop\\QA KURS\\20180506_125713.jpg");

		createObject.setComment("This is fantastic!");
		createObject.clickOnCreateButton();

		WebElement createdObject = driver.findElement(By.className("name"));
		System.out.println("title attribute" + createdObject.getAttribute("title"));
		Assert.assertEquals(createdObject.getAttribute("title"), "Milky");
		Thread.sleep(1000);
	}
}