package testCrudOpertion;

import projectpet.RequestUtility;
import projectpet.baseuriAndEndpoint;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import petPojo.*;

public class sendPostRequest   extends RequestUtility{
	
	@Test
	public void spq()
	{
		tags tags=new tags(12, "Fish");
		ArrayList<petPojo.tags> tag=new ArrayList<tags>();
		tag.add(tags);
		
		
	  Response response=createPetRequest(baseuriAndEndpoint.baseUri, baseuriAndEndpoint.postEnpoint,pojoc);
	  response.prettyPrint();
	}

}
