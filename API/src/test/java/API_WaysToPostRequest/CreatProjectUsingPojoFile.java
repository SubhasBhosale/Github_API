package API_WaysToPostRequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojolibrary.pojoclassforctreatingproject;

public class CreatProjectUsingPojoFile {
@Test
public void pojo()
{
	pojoclassforctreatingproject pojo = new pojoclassforctreatingproject("so", "so@122", "Completed", 11);
	baseURI="http://rmgtestingserver";
	port=8084;
	given().body(pojo).contentType(ContentType.JSON)
	.when().post("/addProject")
	.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	
	
}
}
