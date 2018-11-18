package webbasic;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {
	
	private WebDriver driver;
	
	public SmokeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nejla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void assertCreateObject() throws InterruptedException {
		
		System.out.println("Starting test assertCreateObject");
		
		driver.get("http://www.navigator.ba");

		WebElement createObjectLink = driver.findElement(By.xpath("//*[@id=\"ember572\"]/span[2]"));
		createObjectLink.click();

		WebElement nameField = driver.findElement(By.xpath("//*[@id=\"poi_name\"]"));
		nameField.sendKeys("Milky");

		WebElement cityField = driver.findElement(By.xpath("//*[@id=\"poi_city_name\"]"));
		cityField.sendKeys("Sarajevo");
		Thread.sleep(1000);
		cityField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

		WebElement placeField = driver.findElement(By.xpath("//*[@id=\"poi_place_id\"]"));
		placeField.sendKeys("Omera Kovača");
		Thread.sleep(1000);
		placeField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);

		WebElement houseNumberElement = driver.findElement(By.xpath("//*[@id=\"poi_house_number\"]"));
		houseNumberElement.sendKeys("4");
		Thread.sleep(1000);
	
		((JavascriptExecutor) driver).executeScript(""
				+ "var x = document.getElementsByClassName(\"leaflet-marker-icon place-form-marker-icon leaflet-zoom-animated leaflet-clickable leaflet-marker-draggable\");"
				+ "x[0].style.marginLeft=\"-400px\"");

		WebElement chooseCategoryButton = driver.findElement(By.xpath("//*[@id=\"ember937\"]"));
		chooseCategoryButton.click();
		Thread.sleep(1000);

		WebElement firstCategorySelect = driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[2]/select"));
		firstCategorySelect.click();
		firstCategorySelect.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);

		WebElement secondCategorySelect = driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[3]/select"));
		secondCategorySelect.click();
		secondCategorySelect.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);

		WebElement thirdCategorySelect = driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[4]/select"));
		thirdCategorySelect.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);




		driver.findElement(By.xpath("//*[@id=\"poi_name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"poi_name\"]")).sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,
				Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,
				Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,
				Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,
				Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,
				Keys.TAB);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"place-form\"]/div[10]/div/button[1]")).click();
		Thread.sleep(1000);
		

		WebElement createdObject = driver.findElement(By.className("name"));
		System.out.println("title attribute"+ createdObject.getAttribute("title"));
		AssertJUnit.assertEquals(createdObject.getAttribute("title"), "Milky");
		
		System.out.println("Finished test assertCreateObject");
	}
	
	@Test
	public void assertExistingObject() throws InterruptedException {

		System.out.println("Starting test assertExistingObject");
		
		driver.get("http://www.navigator.ba");
		Thread.sleep(1000);
		WebElement searchInputField = driver.findElement(By.xpath("//*[@id=\"ember564\"]"));
		searchInputField.click();
		searchInputField.sendKeys("hotel han");
		Thread.sleep(1000);
		searchInputField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"ember1036\"]/div")).click();
		Thread.sleep(1000);
		
		
		WebElement searchObject = driver.findElement(By.xpath("//*[@id=\"ember1094\"]/a[1]/div[2]"));
		String title = searchObject.getAttribute("title");
		title=title.toLowerCase();
		title=title.replace("\"", "");
		System.out.println(title);
		AssertJUnit.assertEquals(title , "hotel han");

		driver.findElement(By.xpath("//*[@id=\"ember551\"]/img")).click();
		
		System.out.println("Finished test assertExistingObject");
//		
}
	
}
