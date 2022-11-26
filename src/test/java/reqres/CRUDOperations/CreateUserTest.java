package reqres.CRUDOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateUserTest {
	@Test
	public void createUser() 
	{
		//step 1 create pre requisites - body
           JSONObject obj = new JSONObject();
           obj.put("name", "morpheus");
           obj.put("job", "leader");
           
           //step 2 send the request 
          RequestSpecification request = RestAssured.given();
          request.body(obj);
          request.contentType(ContentType.JSON);
         Response resp = request.post("https://reqres.in/api/users");
          
          //step 3 validate response 
          System.out.println(resp.getStatusCode());
//          System.out.println(resp.asString());
//          resp.prettyPrint();
//          resp.prettyPeek();
          
          ValidatableResponse val = resp.then();
          val.log().all();
           
	}

}
