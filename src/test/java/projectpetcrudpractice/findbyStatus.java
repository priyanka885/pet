package projectpetcrudpractice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class findbyStatus {
	@Test
	public void fbs()
	{
		RequestSpecification reqs = RestAssured.given();
		reqs.queryParam("status", "pending");
		Response reps = reqs.get("https://petstore.swagger.io/v2/pet/findByStatus");
		System.out.println(reps.asPrettyString());
	  // 
	}

}
