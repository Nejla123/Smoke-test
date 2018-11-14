package basicweb;
import org.testng.Assert;
import org.testng.annotations.*;

//import appcode.sm

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestClass {
	
	public void testSearchResultCorrect() {
		WebElement searchElement = driver.findElement(By.xpath("//*[@id=\"place-form\"]/div[10]/div/button[1]"))
				searchElement.click();
		Assert.assertEquals(driver.findElement(By.className("name")).getText(), "Just Furmari");
		
	}

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Nejla\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    
		WebDriver driver = new ChromeDriver ();
		//WebElement element = driver.findElement(By.id(""));
		driver.get("http://www.navigator.ba");
		driver.manage().window().maximize();

		
		WebElement createObject=driver.findElement(By.xpath("//*[@id=\"ember572\"]/span[2]"));
		createObject.click();
		//driver.findElement(By.xpath("//*[@id=\"ember572\"]/span[2]")).click();	
	
		
		WebElement nameField = driver.findElement(By.xpath("//*[@id=\"poi_name\"]"));
		nameField.sendKeys("Just Furmari");
		
		
		
		WebElement cityField= driver.findElement(By.xpath("//*[@id=\"poi_city_name\"]"));
		cityField.sendKeys("Sarajevo");
		Thread.sleep(1000);
		cityField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		
		//driver.findElement(By.xpath("//*[@id=\"poi_city_name\"]")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	
		
	WebElement placeField = driver.findElement(By.xpath("//*[@id=\"poi_place_id\"]"));
		placeField.sendKeys("Omera Kovača");
		Thread.sleep(1000);
		placeField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
driver.findElement(By.xpath("//*[@id=\"poi_place_id\"]")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"poi_house_number\"]")).sendKeys("4");
		
		Thread.sleep(1000);
		
		WebElement marker = driver.findElement(By.xpath("//*[@id=\"ember628\"]/div[2]/div[2]/div[3]/div"));
				System.out.println(marker.getLocation());
		((JavascriptExecutor)driver).executeScript(""
				+ "var x = document.getElementsByClassName(\"leaflet-marker-icon place-form-marker-icon leaflet-zoom-animated leaflet-clickable leaflet-marker-draggable\");"
				+ "x[0].style.marginLeft=\"-40px\"");
		
	
		driver.findElement(By.xpath("//*[@id=\"ember937\"]")).click();
		Thread.sleep(1000);		
		
		
		driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[2]/select")).click();
	
		driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[2]/select")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
				
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[3]/select")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[3]/select")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER);
		
		Thread.sleep(1000);

		
		driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[4]/select")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[4]/select")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
		Thread.sleep(1000);
		//Kreiraj ????????????
		
		
		//driver.findElement(By.xpath("//*[@id=\"mCSB_4\"]/div[1]/div[1]")).sendKeys(Keys.END);
		
//		JavascriptExecutor jse = (JavascriptExecutor) driver; 
//		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//		
//		driver.findElement(By.xpath("//*[@id=\"place-form\"]/div[10]/div/button[1]")).click();
//		
//		
		
//		WebElement elem = driver.findElement(By.xpath("//*[@id=\"place-form\"]/div[10]/div/button[1]"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(elem);
//		actions.perform();

		
		
	//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoview(true);", elem);
				
	
		driver.findElement(By.xpath("//*[@id=\"poi_name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"poi_name\"]")).sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB);
		
		
		driver.findElement(By.xpath("//*[@id=\"place-form\"]/div[10]/div/button[1]")).click();
		Assert.assertEquals(driver.findElement(By.className("name")).getText(), "Just Furmari");

		
		
		
		
//			System.out.println("\nRunning Test -> ProvjeraKreiranja");
//			String title = driver.findElement(By.xpath("//*[@id=\"mCSB_11\"]/div[1]/div[2]/div[1]/div[1]/div[1]")).getText();
//			System.out.println("title");
//			Assert.assertEquals(title, "Just Furmari");
//			
		
		
//		driver.findElement(By.xpath("//*[@id=\"ember551\"]/img")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"ember564\"]")).click();
//		Thread.sleep(1000);
//
//		
//		driver.findElement(By.xpath("//*[@id=\"ember564\"]")).sendKeys("Hotel Han");
//		
//		driver.findElement(By.xpath("//*[@id=\"ember564\"]")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
//		Thread.sleep(1000);
//
//
//		driver.findElement(By.xpath("//*[@id=\"ember1036\"]/div")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"ember551\"]/img")).click();
//		
//		
//		
		
		
	}
	

}
