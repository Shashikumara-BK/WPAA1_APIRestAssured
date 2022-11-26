package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import POJO_Classes.UserLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class ResponseValidationTest {
	@Test
	public void responseBodyValidation()
	{
		String expData = "morpheus";
		
		// Step 1 : create prerequisites 
		UserLibrary uLib = new UserLibrary("morpheus", "leader");
		baseURI = "http://reqres.in";
		
		//Step 2 : send the request and capture the response
		
		Response resp = given()
				                    .body(uLib)
				                    .contentType(ContentType.JSON)
				                     .when()
				                     .post("/api/users");
		
		//Step 3 : write json path using jsonpath() and validate
		String actData  = resp.jsonPath().get("name");
		System.out.println(actData);
		resp.then().log().all();
		Assert.assertEquals(expData, actData);
		
	}
	

}
