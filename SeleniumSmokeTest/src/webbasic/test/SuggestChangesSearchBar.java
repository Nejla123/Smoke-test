package webbasic.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import webbasic.model.SearchBar;

public class SuggestChangesSearchBar {
	private WebDriver driver;
	private SearchBar searchBar;
	
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
		
		driver.get("http://www.navigator.ba");
		searchBar.clikOnSearchBar();
		searchBar.setNameofObject("Pekara Dukat");
		Thread.sleep(1000);

		searchBar.clickOnButtonSearch();
		Thread.sleep(1000);

		searchBar.clickOnObjectButton();
		Thread.sleep(1000);
		searchBar.clickSuggestChangesonObject();

		searchBar.setDescription("Very good place");
		searchBar.scrollDown("-1088px");
		searchBar.clickOnSuggestChangesButton();
		Thread.sleep(1000);

	
		WebElement alertifymessage = driver.findElement(By.xpath("//*[@id=\"alertify\"]/div/article/p"));
		String message = alertifymessage.getAttribute("class");
		Assert.assertEquals(message,"alertify-message");
		
		
		

		
		
}
}