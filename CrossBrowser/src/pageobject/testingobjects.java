package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testingobjects {
	
	private static WebElement element;
	public static WebElement textbox_search(WebDriver driver) {
		
		element = driver.findElement(By.name("q"));
		return element;
		
	}
	public static WebElement buttton_search(WebDriver driver) {
		
		element = driver.findElement(By.name("btnK"));
		return element;
		
	}

}
