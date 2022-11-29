package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo1_get {
	
	@Test
	public void getweather() {
		
		
		
		 Response response = get("https://reqres.in/api/users?page=2");
		 
		 System.out.println(response.asString());
		 System.out.println(response.getStatusCode());
		 System.out.println(response.getStatusLine());
		 System.out.println(response.getBody().asString());
		 System.out.println(response.getTime());
		 
		 
		 
	}
	}

	


