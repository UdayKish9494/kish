import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fackebookdemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Acer//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/maps/");
		driver.findElement(By.id("searchboxinput")).sendKeys("Kurnool,AP");
		driver.findElement(By.id("searchbox-searchbutton")).click();
		driver.close();
		
	}
}
