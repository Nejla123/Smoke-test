package webbasic.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import webbasic.model.EngSearchBar;

public class ClaimPlaceEngSearchBar {

	private WebDriver driver;
	private EngSearchBar engSearchBar;
	
	@BeforeTest
	public void setupEnviromnent() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nejla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		engSearchBar = new EngSearchBar(driver);

}
	@Test
	public void testClaimOnEng() throws InterruptedException {
		
		driver.get("http://www.navigator.ba");
		engSearchBar.clickOnEngButton();
		engSearchBar.clikOnSearchBar();
		engSearchBar.setNameofObject("Pekara Dukat");
		Thread.sleep(1000);

		engSearchBar.clickOnButtonSearch();
		Thread.sleep(1000);

		engSearchBar.clickOnObjectButton();
		Thread.sleep(1000);
		engSearchBar.clickOnClaimButton();
		Thread.sleep(1000);

		engSearchBar.setCLaimName("Nejla");
		engSearchBar.setClaimEmail("appla33@gmail.com");
		engSearchBar.setPhoneField("061444444");
		engSearchBar.clickOnSendButton();
		Thread.sleep(1000);
		WebElement alertmessage = driver.findElement(By.xpath("//*[@id=\"mCSB_5\"]/div[1]/div/div/div"));
		String message = alertmessage.getAttribute("class");
		Assert.assertEquals(message,"alert alert-success");

		
		
	}
}
