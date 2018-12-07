package test.smoke;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import model.CreateObject;

public class SmokeTest {

	private WebDriver driver;
	private CreateObject createObject;
	private String baseURL = "http://www.navigator.ba";

	@BeforeTest
	public void setupEnviromnent() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nejla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		createObject = new CreateObject(driver);
	}

	@Test(priority = 1)
	public void testCreatingObject() throws InterruptedException {
		driver.get(baseURL);
		createObject.clickOnCreateObjectLink();
		createObject.setName("Milky");
		createObject.setAndSelectCity("Sarajevo");
		createObject.setAndSelectPlace("Omera Kovača");
		createObject.setHouseNumber("4");
		//
		createObject.moveMarkerLeft("-400px");
		createObject.clickOnChooseCategory();
		createObject.selectFirstCategory();
		createObject.selectSecondCategory();
		//
		createObject.selectThirdCategory();
		createObject.scrollToBottom();
		createObject.clickOnCreateButton();

		WebElement createdObject = driver.findElement(By.className("name"));
		System.out.println("title attribute" + createdObject.getAttribute("title"));
		Assert.assertEquals(createdObject.getAttribute("title"), "Milky");
//		Thread.sleep(1000);

	}

	@Test(priority = 2)
	public void assertExistingObject() throws InterruptedException {

		driver.get(baseURL);
		createObject.setSearchInputField("hotel han");
		createObject.clickOnObjectField();

		WebElement searchObject = driver.findElement(By.xpath("//*[@id=\"ember1094\"]/a[1]/div[2]"));
		String title = searchObject.getAttribute("title");
		title = title.toLowerCase();
		title = title.replace("\"", "");
		System.out.println(title);
		Assert.assertEquals(title, "hotel han");

		createObject.clickOnHomeImg();

	}
}
