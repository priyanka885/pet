package bddapprochcrud;

import java.io.File;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class createhm {
	
	@Test
	public void createpetwithhashmap()
	{
		
		 given()
		  .contentType(ContentType.JSON)
		   .body(new File("./jfile.json"))
	.when()
	   .post("https://petstore.swagger.io/v2/pet")
	  .then()
	      .assertThat().statusCode(200)
	      .assertThat().contentType(ContentType.JSON)
	      .log().all();
		  
		  
	
		
		
		
		
	}

}
