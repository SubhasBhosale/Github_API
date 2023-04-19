package API_WaysToPostRequest_HM;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class imagepost 
{
	@Test
	public void test()
	{
		File file = new File("./src/test/resources/common_data/image/Screenshot (1005).png");
		baseURI = "https://petstore.swagger.io/v2";
		given().multiPart(file)
		.when().post("/pet/2/uploadImage")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON);
	}
}
