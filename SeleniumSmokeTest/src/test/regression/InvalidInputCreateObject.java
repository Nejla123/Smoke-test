package test.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import model.CreateObject;

public class InvalidInputCreateObject {
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
	public void testInvalidInput() throws InterruptedException {
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

		createObject.setHomePhoneNumber("03###%44\"7");

		createObject.scrollDownBy(-300);

		createObject.scrollDownBy(-300);
		createObject.clickOnWifiCheckBox();
		createObject.setWifiPassword("apple");
		createObject.setWifiName("Public");

		createObject.scrollDownBy(-300);

		createObject.setComment("This is fantastic!");

		createObject.clickOnCreateButton();

		WebElement errormessage = driver.findElement(By.xpath("//*[@id=\"place-form\"]/div[4]/div[2]"));
		String message = errormessage.getAttribute("class");
		Assert.assertEquals(message, "poi_phone-error-msg");

	}
}