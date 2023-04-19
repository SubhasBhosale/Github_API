package API_WaysToPostRequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class creatProjectUsingHashMap 
{
	@Test
	public void addprojusingmap()
	{
		HashMap hm = new HashMap();
		hm.put("createdBy", "so");
		hm.put("projectName", "so1236");
		hm.put("status", "On Going");
		hm.put("teamSize", 10);
		baseURI="http://rmgtestingserver";
		port=8084;
		given().body(hm).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();

	}
}
//TY_PROJ_2841