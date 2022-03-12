package projectpetcrudpractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class createpet {

	@Test
	public void create()
	{
		JSONObject obj=new JSONObject();
		obj.put("id", 100);
		obj.put("name", "scooby");
		obj.put("status", "sold");


		RequestSpecification reqs = RestAssured.given();
		reqs.contentType(ContentType.JSON);
		reqs.body(obj);
		
		Response resp = reqs.post("https://petstore.swagger.io/v2/pet");

		System.out.println(resp.getStatusCode());
		System.out.println(resp.getBody().prettyPrint());
		System.out.println(resp.getTime());
		
		
		ValidatableResponse vr = resp.then();
		vr.statusCode(200);
		vr.contentType("application/json");
		
	}
}
