package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tester {
	
	WebDriver driver;
	@BeforeTest
	public static void main(String[] args) {
		googleSearch();
		
	}
	@Test
	public static void googleSearch()  {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C://Users//Acer//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		testingobjects.textbox_search(driver).sendKeys("AlluArjun");
		testingobjects.buttton_search(driver).sendKeys(Keys.RETURN);
		
		
		
		driver.close();
		
		System.out.println("Test Completed Sucessfully");
		
	}


}
