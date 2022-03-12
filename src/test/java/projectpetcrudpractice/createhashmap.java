package projectpetcrudpractice;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createhashmap {
	@Test
	public void createbyhash()
	{
		HashMap hm=new HashMap();
		hm.put("id",101);
		hm.put("name","swty");
		hm.put("status","available");
		
		RequestSpecification reqs = RestAssured.given();
		reqs.contentType(ContentType.JSON);
		reqs.body(hm);
		Response reps = reqs.post("https://petstore.swagger.io/v2/pet");
		System.out.println(reps.prettyPrint());
		System.out.println(reps.contentType());
		System.out.println(reps.statusCode());
		
	}

}
