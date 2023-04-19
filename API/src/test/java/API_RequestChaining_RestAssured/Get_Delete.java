package API_RequestChaining_RestAssured;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Get_Delete 
{
	@Test
	public void test()
	{
		baseURI="http://rmgtestingserver:8084";
		Response resp = when().get("/projects");
		resp.then().log().all();
		
	
		 Object cb = resp.jsonPath().get("[1].createdBy");
		 given().pathParam("createdBy", cb)
		.when().delete("/projects/{createdBy}")
		.then().log().all();
	}
}
