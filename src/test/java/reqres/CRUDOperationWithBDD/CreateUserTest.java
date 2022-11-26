package reqres.CRUDOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateUserTest {
	@Test
	public void createUser()
	{
        //step 1 create pre requisites - body
		JSONObject obj = new JSONObject();
		obj.put("name", "morpheus");
		obj.put( "job", "leader");
		
	    //step 2 send the request 
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}

}
