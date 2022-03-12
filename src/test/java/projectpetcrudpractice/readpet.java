package projectpetcrudpractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class readpet {
	@Test
	public void readp()
	{
		RequestSpecification reqs = RestAssured.given();
		reqs.pathParam("petId", 100);
		Response reps = reqs.get("https://petstore.swagger.io/v2/pet/{petId}");
		System.out.println(reps.asPrettyString());
		System.out.println("status code is ===>"+reps.getStatusCode());
	}

}
