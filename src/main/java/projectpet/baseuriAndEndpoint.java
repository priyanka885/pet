package projectpet;

public interface baseuriAndEndpoint {
	
	String baseUri ="https://petstore.swagger.io/v2";

	String postEnpoint="/pet";
	String getEnpoint ="/pet/{petId}";
	String putEnpoint ="/pet";
	String getStatusEndpoint="/pet/findByStatus";
	String deleteEndpoint ="/pet/{petId}";
	

}
