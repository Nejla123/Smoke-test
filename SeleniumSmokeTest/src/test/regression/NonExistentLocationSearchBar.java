package test.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import model.SearchBar;

public class NonExistentLocationSearchBar {
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
	public void testNonExistentLocation() throws InterruptedException {
		driver.get(baseURL);

		searchBar.clikOnSearchBar();
		searchBar.setNameofObject("Hotel Malina");
		searchBar.clickOnButtonSearch();

		Thread.sleep(1000);

		WebElement searchedObject = driver.findElement(By.xpath("//*[@id=\"mCSB_3\"]/div[1]/div/div[1]/p[1]"));
		String classAttribute = searchedObject.getAttribute("class");
		Assert.assertEquals(classAttribute, "search-results-for");

		Thread.sleep(1000);

	}
}