package bddapprochcrud;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import projectpet.javaUtility;

import static io.restassured.RestAssured.*;

import java.util.List;

public class findstatus {

@Test	
	public void findpet()
	{
	String expectedData="King Kong";
	javaUtility ut = new javaUtility();
	
		Response res = RestAssured.given()
		  .queryParam("status","sold")
		  .when()
		     .get("https://petstore.swagger.io/v2/pet/findByStatus");
		 // .then()
		    // .log().body();
		    List<String> list = res.jsonPath().get("name");
		    
		   //    for(String actualData:list)
		   // {
		   //	if(actualData.equals(expectedData))
		   //	{
		    //	System.out.println(actualData+"=====>is acutal data");
		   //	break;
		    //	}
		 //   }
		    	ut.verifyTheData(list, expectedData);
		    	
	
	}
}
