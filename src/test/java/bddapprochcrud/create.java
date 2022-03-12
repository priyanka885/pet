package bddapprochcrud;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class create {
	
	@Test
	public void cp()
	{
		JSONObject obj=new JSONObject();
		obj.put("id", 102);
		obj.put("name", "scooby");
		obj.put("status", "sold"); 
		
		given()
	       .contentType(ContentType.JSON)
	       .body(obj)
	     .when()
	       .post("https://petstore.swagger.io/v2/pet")
	     .then()
	        .assertThat().statusCode(200)
	        .log().all();
	       
	}

}
