package test.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import model.SuggestChanges;

public class FillFieldsSuggestChanges {
	private WebDriver driver;
	private SuggestChanges suggestChanges;
	private String baseURL = "http://www.navigator.ba";

	@BeforeTest
	public void setupEnviromnent() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nejla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		suggestChanges = new SuggestChanges(driver);

	}

	@Test
	public void testFillFields() throws InterruptedException {
		driver.get(baseURL);
		suggestChanges.clickOnSuggestChangeslink();
		suggestChanges.setName("Nejla");
		suggestChanges.setEmail("apple5545@4com");

		suggestChanges.setComment("Very good");
		suggestChanges.clickonSubmitbutton();

		Thread.sleep(1000);

		WebElement alertmessage = driver.findElement(By.xpath("//*[@id=\"mCSB_2\"]/div[1]/div/div/div"));
		String message = alertmessage.getAttribute("class");
		Assert.assertEquals(message, "alert alert-success");

	}
}