package webbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

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

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nejla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// WebElement element = driver.findElement(By.id(""));
		driver.get("http://www.navigator.ba");

		WebElement createObjectLink = driver.findElement(By.xpath("//*[@id=\"ember572\"]/span[2]"));
		createObjectLink.click();
		// driver.findElement(By.xpath("//*[@id=\"ember572\"]/span[2]")).click();

		WebElement nameField = driver.findElement(By.xpath("//*[@id=\"poi_name\"]"));
		nameField.sendKeys("Milky");

		WebElement cityField = driver.findElement(By.xpath("//*[@id=\"poi_city_name\"]"));
		cityField.sendKeys("Sarajevo");
		Thread.sleep(1000);
		cityField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

		// driver.findElement(By.xpath("//*[@id=\"poi_city_name\"]")).sendKeys(Keys.ARROW_DOWN,
		// Keys.ENTER);

		WebElement placeField = driver.findElement(By.xpath("//*[@id=\"poi_place_id\"]"));
		placeField.sendKeys("Omera Kovača");
		Thread.sleep(1000);
		placeField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);

		WebElement houseNumberElement = driver.findElement(By.xpath("//*[@id=\"poi_house_number\"]"));
		houseNumberElement.sendKeys("4");
		Thread.sleep(1000);

		WebElement marker = driver.findElement(By.xpath("//*[@id=\"ember628\"]/div[2]/div[2]/div[3]/div"));
		System.out.println(marker.getLocation());
		((JavascriptExecutor) driver).executeScript(""
				+ "var x = document.getElementsByClassName(\"leaflet-marker-icon place-form-marker-icon leaflet-zoom-animated leaflet-clickable leaflet-marker-draggable\");"
				+ "x[0].style.marginLeft=\"-400px\"");

		WebElement chooseCategoryButton = driver.findElement(By.xpath("//*[@id=\"ember937\"]"));
		chooseCategoryButton.click();
		Thread.sleep(1000);

		//*[@id="ember988"]/div/div[2]/select
		WebElement firstCategorySelect = driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[2]/select"));
		firstCategorySelect.click();
		firstCategorySelect.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);

		WebElement secondCategorySelect = driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[3]/select"));
		secondCategorySelect.click();
		secondCategorySelect.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);

		WebElement thirdCategorySelect = driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[4]/select"));
//		thirdCategorySelect.click();
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
		Assert.assertEquals(createdObject.getAttribute("title"), "Milky");		

	}
	
	@Test
	public void assertExistingObject() throws InterruptedException {

		
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
		Assert.assertEquals(title , "hotel han");

		driver.findElement(By.xpath("//*[@id=\"ember551\"]/img")).click();
//		
}
//	@Test
//	public void assertExistingObjectInList() throws InterruptedException {
//		driver.get("http://www.navigator.ba");
//		Thread.sleep(1000);
//		WebElement searchInputField = driver.findElement(By.xpath("//*[@id=\"ember564\"]"));
//		searchInputField.click();
//		searchInputField.sendKeys("hotel han");
//		Thread.sleep(1000);
//		searchInputField.sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
//		
//		List<WebElement> searcResultItems = driver.findElements(By.className("name"));
//		boolean foundElement = false;
//		for(WebElement searcResultItem : searcResultItems  ) {
//			String titleValue = searcResultItem.getAttribute("title");
//			System.out.println("Prvobitni title:" + titleValue);
//			titleValue = titleValue.replaceAll("\"", "");
//			System.out.println("Title nakon izbacivanja \":" + titleValue);
//			titleValue = titleValue.toLowerCase();
//			System.out.println("Title nakon smanjivanja slova:" + titleValue);
//			System.out.println();
//			
//			if(titleValue.equals("hotel han")) {
//				searcResultItem.click();
//				foundElement = true;
//				break;
//			}
//		}
//		
//		Assert.assertTrue(foundElement);		
//	}	
	
}
