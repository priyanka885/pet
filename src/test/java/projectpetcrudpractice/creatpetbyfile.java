package projectpetcrudpractice;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class creatpetbyfile {
	@Test
	public void createfile()
	{
		File fbody = new File("./jfile.json");
	RequestSpecification reqs = RestAssured.given();
	reqs.contentType(ContentType.JSON);
	reqs.body(fbody);
	
	Response resp = reqs.post("https://petstore.swagger.io/v2/pet");

	System.out.println(resp.getStatusCode());
	System.out.println(resp.getBody().prettyPrint());
	System.out.println(resp.getTime());
	
	System.out.println(resp.then().log().all());
	ValidatableResponse vr = resp.then();
	vr.statusCode(200);
	vr.contentType("application/json");

}
}