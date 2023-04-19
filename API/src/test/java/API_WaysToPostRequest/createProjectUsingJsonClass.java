package API_WaysToPostRequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class createProjectUsingJsonClass 
{
@Test
public void addproj()
{
	JSONObject jo = new JSONObject();
	jo.put("createdBy", "so");
	jo.put("projectName", "so1235");
	jo.put("status", "On Going");
	jo.put("teamSize", 10);
	baseURI="http://rmgtestingserver";
	port=8084;
	given().body(jo).contentType(ContentType.JSON).when().post("/addProject").then().statusCode(201).contentType(ContentType.JSON).log().all();

}
}
