package API_RequestChaining_RestAssured;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojolibrary.pojoclassforctreatingproject;
import static io.restassured.RestAssured.*;

public class Post_DeleteProject 
{
	@Test
	public void test()
	{
		pojoclassforctreatingproject pojo = new pojoclassforctreatingproject("Hulk", "Hulk1", "Completed", 8);
		baseURI="http://localhost:8084";           port=8084;
		 Response resp = given().body(pojo).contentType(ContentType.JSON)
		.when().post("/addProject");
		
		Object pid = resp.jsonPath().get("projectId");
		given().pathParam("projectId", pid)
		.when().delete("/projects/{projectId}")
		.then().log().all();
	}
}
