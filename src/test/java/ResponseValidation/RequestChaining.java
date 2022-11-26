package ResponseValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RequestChaining {
	@Test
	public void requestChainingTestGetAndDelete()
	{
		//step 1: create a prerequisites 
		baseURI = "https://reqres.in";
		// step 2send the request 
		Response resp = when()
				.get("/api/users");
		
		//step 3 capture the response using json path 
        int id = resp.jsonPath().get("data[1].id");
		System.out.println(id);
		
		//step 4 provide the response variable to another request
		when()
		.get("/api/users/"+id)
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}

}
