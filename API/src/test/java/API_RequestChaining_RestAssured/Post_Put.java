package API_RequestChaining_RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojolibrary.pojoclassforctreatingproject;

public class Post_Put 
{
	public static void main(String[] args) 
	{
		pojoclassforctreatingproject pojo=new pojoclassforctreatingproject("Batman1", "Batman11", "Completed", 10);
		baseURI="http://localhost:8084";
		Response resp = given().body(pojo).contentType(ContentType.JSON)
		.when().post("/addProject");
		resp.then().log().all();
		
		pojoclassforctreatingproject pojo2=new pojoclassforctreatingproject("Batman", "Batwoman1", "Completed", 10);
		Object pid = resp.jsonPath().get("projectId");
		given().body(pojo2).contentType(ContentType.JSON).pathParam("projectId", pid)
		.when().put("/projects/{projectId}")
		.then().log().all();
	}
}
