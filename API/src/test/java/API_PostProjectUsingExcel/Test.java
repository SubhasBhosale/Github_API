package API_PostProjectUsingExcel;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;

import io.restassured.http.ContentType;
import pojolibrary.pojoclassforctreatingproject;

public class Test 
{
@org.testng.annotations.Test
public void test()
{	
	pojoclassforctreatingproject pojo = new pojoclassforctreatingproject("subhas", "so@122", "Completed", 11);
	baseURI="http://rmgtestingserver";
	port=8084;
	given().body(pojo).contentType(ContentType.JSON)
	.when().post("/addProject")
	.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
}




@DataProvider
public void trust()
{
	
}
}
