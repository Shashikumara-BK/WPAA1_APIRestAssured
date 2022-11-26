package ResponseValidation;

import org.testng.annotations.Test;

import POJO_Classes.UserLibrary;
import groovyjarjarantlr.collections.List;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetAllUsersTest {
	@Test
	public void getAllUser()
	{
		
		// Step 1 : create prerequisites 
         String expData = "janet.weaver@reqres.in";
		baseURI = "http://reqres.in";
		
		//Step 2 : capture the response
		Response resp = when()
				                   .get("/api/users");
		
		//Step 3 : write json path using jsonpath() and validate
		ArrayList <Object> actData = resp.jsonPath().get("data");
		for(Object d : actData)
		{
			String data = d.toString();
			if (data.contains(expData))
			{
				System.out.println(data+"  ->data matched");
				break;
			}
			else
			{
				System.out.println("data not matched");
			}
		}
	}

}
