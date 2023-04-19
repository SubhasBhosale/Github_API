package API_RequestChaining_RestAssured;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import pojolibrary.pojoclassforctreatingproject;

public class Put_Delete 
{
	@Test
	public void test()
	{
		baseURI="http://rmgtestingserver:8084";
		pojoclassforctreatingproject pojo = new pojoclassforctreatingproject("bro3","bro3","Created",8);
		Response resp = given().body(pojo).contentType(ContentType.JSON)
		.when().post("/addProject");
		resp.then().log().all();
		
		
		pojoclassforctreatingproject pojo2 = new pojoclassforctreatingproject("Spider","bro1","Created",8);
		Object pid = resp.jsonPath().get("projectId");
		given().body(pojo2).contentType(ContentType.JSON).pathParam("projectId", pid)
		.when().put("/projects/{projectId}")
		.then().log().all();
		
		
		
		

	}
}
//TY_PROJ_3414