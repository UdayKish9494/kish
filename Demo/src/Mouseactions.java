import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Mouseactions {

	public static void main(String[] args) throws IOException {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        System.setProperty("webdriver.chrome.driver","C://Users//Acer//Downloads//chromedriver_win32 (1)//chromedriver.exe");
                WebDriver driver = new ChromeDriver();

                driver.get(baseUrl);           
                WebElement link_Home = driver.findElement(By.linkText("Home"));
                WebElement td_Home = driver
                        .findElement(By
                        .xpath("//html/body/div"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr"));    
                 
                Actions builder = new Actions(driver);
                Action mouseOverHome = builder
                        .moveToElement(link_Home)
                        .build();
                 
                String bgColor = td_Home.getCssValue("background-color");
                System.out.println("Before hover: " + bgColor);        
                mouseOverHome.perform();        
                bgColor = td_Home.getCssValue("background-color");
                System.out.println("After hover: " + bgColor);
                driver.close();
                
                TakesScreenshot ts = (TakesScreenshot)driver; 
        		File scrfile = ts.getScreenshotAs(OutputType.FILE);
        		File destfile = newFile("C:\\Users\\Acer\\Desktop\\screenshot\\newpic.png");
        		Files.copy(scrfile, destfile);
        		
        }

	private static File newFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
