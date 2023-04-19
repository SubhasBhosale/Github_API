package tyss_training.API;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreatProjectUsingJsonFile {
		@Test
		public void  creatProjectUsingJsonFile()
		{
			File file = new File("./Subhas bhosale/OneDrive/Desktop");
			baseURI="http://rmgtestingserver";
			port=8084;
			given().body(file).contentType(ContentType.JSON)
			.when().post("/addProject")
			.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
			
		}
	}

