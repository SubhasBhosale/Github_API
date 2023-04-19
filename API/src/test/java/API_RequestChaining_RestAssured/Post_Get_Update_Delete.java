package API_RequestChaining_RestAssured;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojolibrary.pojoclassforctreatingproject;

import static io.restassured.RestAssured.*;

public class Post_Get_Update_Delete 
{
@Test
public void test()
{
	baseURI="http://rmgtestingserver:8084";
	pojoclassforctreatingproject pojo = new pojoclassforctreatingproject("shubham", "shubham","Created" , 7);
	
	Response resp = given().body(pojo).contentType(ContentType.JSON)
	.when().post("/addProject");
	resp.then().log().all();
	
	Object pid = resp.jsonPath().get("projectId");
	given().pathParam("projectId", pid)
	.when().get("/projects/{projectId}")
	.then().log().all();
	
	pojoclassforctreatingproject pojo1 = new pojoclassforctreatingproject("shuu", "shuu","Created" , 7);
	Object pid1 = resp.jsonPath().get("projectId");
	  given().body(pojo1).contentType(ContentType.JSON).pathParam("projectId", pid1)
	  .when().put("/projects/{projectId}")
	  .then().log().all();
	  
	  
	  
	  Object pid2 = resp.jsonPath().get("projectId");
	  given().pathParam("projectId", pid2)
	  .when().delete("/projects/{projectId}")
	  .then().log().all();
	  

}		
}
