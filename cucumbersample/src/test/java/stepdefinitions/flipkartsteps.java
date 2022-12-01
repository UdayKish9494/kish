package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class flipkartsteps {
	WebDriver driver;
	
	@Given("^load url of flipkart$")
	public void load_url_of_flipkart() {
		System.out.println("flipkart url load avali");
		System.setProperty("webdriver.chrome.driver","C://Users//Acer//Downloads//chromedriver_win32 (1)//chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("_1_3w1N")).click();
	   
	}

	@And("^enter userid and password$")
	public void enter_userid_and_password() {
		System.out.println("id password enter avali");
		 driver.findElement(By.className("_2IX_2- VJZDxU")).click();
	   driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("9494222906");
	   driver.findElement(By.className("_2IX_2- _3mctLh _2LYh3d VJZDxU")).click();
	   driver.findElement(By.className("_2IX_2- _3mctLh _2LYh3d VJZDxU")).sendKeys("Uday@891");
	}

	@Then("^user should login sucessfully$")
	public void user_should_login_sucessfully() {
		System.out.println("login avali");
	     driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
	     
	}

	@When("^user selected a item to add$")
	public void user_selected_a_item_to_add() {
		System.out.println("item select cheyali");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[5]/div[1]/div/div[2]/div/div/div[1]/div/div[2]/div/a/div[1]/div/img")).click();
	    driver.findElement(By.xpath("s1Q9rs")).click();
	}

	@Then("^item should be added to cart$")
	public void item_should_be_added_to_cart() {
		System.out.println("item cart loki add avali");
	   driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();
	}

}
