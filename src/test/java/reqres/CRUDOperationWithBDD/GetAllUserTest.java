package reqres.CRUDOperationWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllUserTest {
	@Test
	public void getAllUser()
	{
		baseURI = "https://reqres.in";
        //step 1 create pre requisites - body
		
	    //step 2 send the request 
		when()
		.get("/api/users")
		.then()
		.log().all();
	}

}
