package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossCheck {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		
	//Check if parameter passed from TestNG is 'firefox'
	if(browser.equalsIgnoreCase("firefox")){
	//create firefox instance
	System.setProperty("webdriver.firefox.driver"," C://Users//Acer//Downloads//geckodriver-v0.31.0-win64//geckodriver.exe");
	driver = new FirefoxDriver();
	}
	//Check if parameter passed as 'chrome'
	else if(browser.equalsIgnoreCase("chrome")){
	//set path to chromedriver.exe
	System.setProperty("webdriver.chrome.driver","C://Users//Acer//Downloads//chromedriver_win32 (1)//chromedriver.exe");
	driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("Edge")){
	//set path to Edge.exe
	System.setProperty("webdriver.edge.driver", "C://Users//Acer//Downloads//edgedriver_win32//edgedriver.exe");
	driver = new EdgeDriver();
	}
	else{
	//If no browser is passed throw exception
	throw new Exception("Incorrect Browser");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testParameterWithXML() throws InterruptedException {
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("allu arjun");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
	Thread.sleep(5000);
	driver.quit();
	
	
	}
	}



