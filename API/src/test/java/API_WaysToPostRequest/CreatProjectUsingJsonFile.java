package API_WaysToPostRequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreatProjectUsingJsonFile 
{
@Test
public void  creatProject()
{
	File file = new File("D:\\Eclipse Workspace\\Selenium Workspace\\SDET Workspace\\ecommerce_flashcart_seleniumframework\\src\\test\\resources\\body.json");
	baseURI="http://rmgtestingserver";
	port=8084;
	given().body(file).contentType(ContentType.JSON)
	.when().post("/addProject")
	.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	
}
}
