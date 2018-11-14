package webbasic;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class proba {

	public void assertEqual() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Nejla\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver ();
		//WebElement element = driver.findElement(By.id(""));
		driver.get("http://www.navigator.ba");
		driver.manage().window().maximize();
		
		//Nova ideja
		WebElement createObject=driver.findElement(By.xpath("//*[@id=\"ember572\"]/span[2]"));
		createObject.click();
		Assert.assertEquals("pass","pass");
        System.out.println("This line is executed because assertEquals "
                + "passed as both the strings are same");
        Assert.assertNull("assertion");
        System.out.println("Since the object under assertion"
                + " is not null, the assertion will fail. "
                + "This line will not be executed");
		
	
//		//driver.findElement(By.xpath("//*[@id=\"ember572\"]/span[2]")).click();	
//		
//		driver.findElement(By.xpath("//*[@id=\"poi_name\"]")).sendKeys("Just Fumari");
//		
//		driver.findElement(By.xpath("//*[@id=\"poi_city_name\"]")).sendKeys("Sarajevo");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//*[@id=\"poi_city_name\"]")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
//		
//		
//
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"poi_place_id\"]")).sendKeys("Omera Kovača");
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//*[@id=\"poi_place_id\"]")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
//
//		driver.findElement(By.xpath("//*[@id=\"poi_house_number\"]")).sendKeys("4");
//		
//		Thread.sleep(1000);
//		
//		WebElement marker = driver.findElement(By.xpath("//*[@id=\"ember628\"]/div[2]/div[2]/div[3]/div"));
//				System.out.println(marker.getLocation());
//		((JavascriptExecutor)driver).executeScript(""
//				+ "var x = document.getElementsByClassName(\"leaflet-marker-icon place-form-marker-icon leaflet-zoom-animated leaflet-clickable leaflet-marker-draggable\");"
//				+ "x[0].style.marginLeft=\"-40px\"");
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"ember937\"]")).click();
//		Thread.sleep(1000);		
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[2]/select")).click();
//	
//		driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[2]/select")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
//				
//		
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[3]/select")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[3]/select")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER);
//		
//		Thread.sleep(1000);
//
//		
//		driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[4]/select")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"ember988\"]/div/div[4]/select")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
//		
//		
//			
//		Thread.sleep(1000);
//		//driver.findElement(By.xpath("//*[@id=\"place-form\"]/div[10]/div/button[1]")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"ember551\"]/img")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"ember564\"]")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"ember564\"]")).sendKeys("Hotel Han");
//		
//		driver.findElement(By.xpath("//*[@id=\"ember564\"]")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
//		Thread.sleep(1000);
//
//
//		
//		driver.findElement(By.xpath("//*[@id=\"ember1296\"]/div/img")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"ember551\"]/img")).click();
//		
		
		
		
		
	}
	

}
//