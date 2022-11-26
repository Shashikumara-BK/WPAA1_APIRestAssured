package reqres.CRUDOperationWithHashMap;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;

import org.testng.annotations.Test;

import POJO_Classes.UserLibrary;
import io.restassured.http.ContentType;

public class CreateUser {
	@Test
	public void createUser()
	{
		 //step 1 create pre requisites - body	
        //	HashMap obj = new HashMap();
       //	obj.put("name", "morpheus");
      //	obj.put( "job", "leader");
		
	//	File obj = new File(".\\src\\test\\resources\\Data.json");
		
		
		UserLibrary obj = new UserLibrary("shashi", "leader");
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
