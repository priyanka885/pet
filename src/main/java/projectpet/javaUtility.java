package projectpet;

import java.util.List;

public class javaUtility {
	
	public void verifyTheData(List<String> list , String expectedData)
	{
		for(String actualData:list)
		{
			if(actualData.equals(expectedData))
			{
				System.out.println(actualData+"===>datis verified");
				break;
			}
		}
	}

}
