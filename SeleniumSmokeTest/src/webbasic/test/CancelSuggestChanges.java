package webbasic.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import webbasic.model.SuggestChanges;

public class CancelSuggestChanges {
	private WebDriver driver;
	private SuggestChanges suggestChanges;
	
	@BeforeTest
	public void setupEnviromnent() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nejla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		suggestChanges = new SuggestChanges(driver);

}	@Test
	public void testCancelButton() throws InterruptedException {
		driver.get("http://www.navigator.ba");
		suggestChanges.clickOnSuggestChangeslink();
		suggestChanges.setName("Nejla");
		suggestChanges.setComment("Very good");
		suggestChanges.clickOnCancelbutton();
		

		WebElement closesuggestchange = driver.findElement(By.xpath("//*[@id=\"ember564\"]"));
		String frontpage = closesuggestchange.getAttribute("id");
		Assert.assertEquals(frontpage, "ember564");
		
		
		
		
		
		
	}
}
