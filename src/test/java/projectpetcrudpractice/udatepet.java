package projectpetcrudpractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class udatepet {
	@Test
	public void upet()
	{
		JSONObject obj=new JSONObject();
		obj.put("id", 100);
		obj.put("name", "scooby");
		obj.put("status", "pebding");
		RequestSpecification reqs= RestAssured.given();
		reqs.contentType(ContentType.JSON);
		reqs.body(obj);
		Response reps = reqs.put("https://petstore.swagger.io/v2/pet");
		System.out.println(reps.getBody().asPrettyString());
		System.out.println(reps.getStatusCode());
		System.out.println(reps.getTime());
		
	}

}
