package bddapprochcrud;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import projectpet.RequestUtility;
import projectpet.baseuriAndEndpoint;

public class GetSinglePet extends RequestUtility{
	
	@Test
	public void getSinglePetTest() {
		
		Response response = getSinglePetRequest(baseuriAndEndpoint.baseUri, "abc", baseuriAndEndpoint.getEnpoint);
		
		Assert.assertEquals(getStatusCode(),200);
		System.out.println(responseTime());
		System.out.println(getBody());
	}

}
