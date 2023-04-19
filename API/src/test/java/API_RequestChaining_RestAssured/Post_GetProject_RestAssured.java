package API_RequestChaining_RestAssured;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojolibrary.pojoclassforctreatingproject;

import static io.restassured.RestAssured.*;

public class Post_GetProject_RestAssured 
{
@Test
public void test()
{
	baseURI="http://localhost:8084";
	pojoclassforctreatingproject pojo = new pojoclassforctreatingproject("Batman", "Batman1", "Created", 8);
	Response resp = given().body(pojo).contentType(ContentType.JSON)
			.when().post("/addProject");
	
	Object pid = resp.jsonPath().get("projectId");
	
	given().pathParam("projectId", pid)
	.when().get("/projects/{projectId}")
	.then().log().all();
	
	
	
}
}
