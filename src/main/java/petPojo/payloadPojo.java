package petPojo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class payloadPojo {
	
  static Object payloadBody;

	public static void body() throws Throwable 
	{
		tags tags=new tags(12, "Fish");
		ArrayList<petPojo.tags> tag=new ArrayList<tags>();
		tag.add(tags);
		
		//Pojo pojo = new Pojo();
		Pojo pojoc = new Pojo(12, new Category(12, "name"), "Dog", new String[] {"url"}, tag, "Sold");
		
		
		//pojo.setId(1);
		//pojo.setName("mini");
		//pojo.setStatus("sold");
		
		//Category category = new Category();
		//category.setId(1);
		//category.setName("mini");
		//pojo.setCategory(category);
		
		//String[] url= {"url1","url2"};
		//pojo.setUrls(url);
	
	        
	
	//List<tags> tag=new ArrayList<tags>();
	//tags tags=new tags();
	//	tags.setId(123);
	//	tags.setName("Priyanka's Dog");
	//	tag.add(tags);
	//	pojo.setTags(tag);
		
	ObjectMapper objmap = new ObjectMapper();
	  Object payloadPojo=objmap.writerWithDefaultPrettyPrinter().writeValueAsString(pojoc);
	  System.out.println(payloadPojo);
	  payloadBody=payloadPojo;
	}

}
