package projectpet;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static projectpet.LogManager.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
public class RequestUtility {
	   
	private static Response response;
	public  static Response getSinglePetRequest(String baseUri ,String petId ,String endpoint)
	{
		logger().info("Base uri: "+baseUri+" pet Id: "+petId+" endpoint: "+endpoint);
		 response= RestAssured.given()
				.pathParam("petId",petId)
				.baseUri(baseUri)
				.when()
				.get(endpoint);
		
		return response;
	
	}
	
	public static Response createPetRequest(String baseUri ,String endpoint , Object payloadPojo)
	{
		logger().info("Base Uri: "+baseUri+" end point: "+endpoint+" payload: "+payloadPojo);
		 response = RestAssured.given()
		   .contentType(ContentType.JSON)
		   .baseUri(baseUri)
		   .body(payloadPojo)
		   .when()
		    .post(endpoint);
		
		return response;
		    
    }
	
	public static Response getPetByStatusReqest(String baseUri ,String endpoint ,String statusOfPet )
	{
		logger().info("Base uri: "+baseUri+" end point: "+endpoint+" status: "+statusOfPet);
		 response = RestAssured.given()
				    .baseUri(baseUri)
				    .queryParam("status", statusOfPet)
				     .when()
				    .post(endpoint);
				
				return response;
				    
	}
	
	public static Response deletePetRequest(String baseUri ,int petId ,String endpoint)
	{ 
		logger().info("Base uri: "+baseUri+" pet id: "+petId+" end point: "+endpoint);
		 response= RestAssured.given()
				.pathParam("petId",petId)
				.baseUri(baseUri)
				.when()
				.delete(endpoint);
		
		return response;
		
	}
	
	public static Response updatePetRequest(String baseUri ,String endpoint , Object payloadPojo)
	{
		logger().info("Base uri: "+baseUri+" end point: "+endpoint+" pay load: "+payloadPojo);
		 response = RestAssured.given()
				   .contentType(ContentType.JSON)
				   .baseUri(baseUri)
				   .body(payloadPojo)
				   .when()
				    .put(endpoint);
				
				return response;
		
	}
	
	public static int getStatusCode() {
		return response.getStatusCode();
	}
	
	public static Headers getHeaders() {
		return response.getHeaders();
	}
	
	public static String getResponseBodyJsonValue(String jsonPath) {
		return response.getBody().jsonPath().get(jsonPath);
	}
	
	public static String getHeader(String headerName) {
		return response.getHeader(headerName);
	}
	
	public static long responseTime() {
		return response.timeIn(TimeUnit.MILLISECONDS);
		
	}
	
	public static String getBody() {
		return response.body().asString();
	}

}
