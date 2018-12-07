package test.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import model.SearchBar;

public class ClaimPlaceBsSearchBar {
	private WebDriver driver;
	private SearchBar searchBar;
	private String baseURL = "http://www.navigator.ba";

	@BeforeTest
	public void setupEnviromnent() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nejla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		searchBar = new SearchBar(driver);

	}

	@Test
	public void testSuggestChanges() throws InterruptedException {

		driver.get(baseURL);
		searchBar.clikOnSearchBar();
		searchBar.setNameofObject("Pekara Dukat");
		Thread.sleep(1000);

		searchBar.clickOnButtonSearch();
		Thread.sleep(1000);

		searchBar.clickOnObjectButton();
		Thread.sleep(1000);
		searchBar.clickOnClaimButton();
		Thread.sleep(1000);

		searchBar.setCLaimName("Nejla");
		searchBar.setClaimEmail("appla33@gmail.com");
		searchBar.setPhoneField("061444444");
		searchBar.clickOnSendButton();
		Thread.sleep(1000);
		WebElement alertmessage = driver.findElement(By.xpath("//*[@id=\"mCSB_5\"]/div[1]/div/div/div"));
		String message = alertmessage.getAttribute("class");
		Assert.assertEquals(message, "alert alert-success");

	}

}
