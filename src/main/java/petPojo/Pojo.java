package petPojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
@Data

@AllArgsConstructor
@ToString

public class Pojo {
	
	
	 int id ;
	 Category category;
	 String name;
	 String [] photoUrls;
     List<tags>tag;
	 String status;
	
	
}
