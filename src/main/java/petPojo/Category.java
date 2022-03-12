package petPojo;

public class Category {
	
	
	int id;
	String name;
	
	public Category(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	
	public Category() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
