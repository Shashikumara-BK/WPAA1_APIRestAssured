package reqres.CRUDOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllUsers {
	@Test
	public void getAllUsers()
	{
		//step 1 create pre requisites - body
		
	    //step 2 send the request 
		Response resp = RestAssured.get("https://reqres.in/api/users");
		
	    //step 3 validate response 
		ValidatableResponse val = resp.then();
		val.log().all();
	}

}
