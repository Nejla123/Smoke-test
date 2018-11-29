package webbasic.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import webbasic.model.CreateObject;

public class ExcludeMandatoryFieldCreatObject {
	private WebDriver driver;
	private CreateObject createObject;

	@BeforeTest
	public void setupEnviromnent() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nejla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		createObject = new CreateObject(driver);

	}

	@Test
	public void testExcludeMandatoryField() throws InterruptedException {
		driver.get("http://www.navigator.ba");
		createObject.clickOnCreateObjectLink();
		createObject.setName("Milky");
		createObject.setAndSelectCity("Sarajevo");
		createObject.setAndSelectPlace("Omera Kovača");
		createObject.setHouseNumber("4");
		
		createObject.moveMarkerLeft("-400px");
		
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
		
		
		WebElement alertifymessage = driver.findElement(By.xpath("//*[@id=\"ember942\"]/div[1]"));
		String message = alertifymessage.getAttribute("class");
		Assert.assertEquals(message,"categories-error-msg");
		


}
}
