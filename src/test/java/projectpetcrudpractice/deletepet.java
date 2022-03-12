package projectpetcrudpractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class deletepet {
@Test
	public void dpet()
	{
	Response reps = RestAssured.delete("https://petstore.swagger.io/v2/pet/100");
	  System.out.println(reps.getStatusCode());
	  System.out.println(reps.getTime());
		
	}
}
