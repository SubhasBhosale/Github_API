package APIwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

public class UpdateProject {
@Test
public void updateProjectTest()
{
	JSONObject jb = new JSONObject();
	jb.put("createdBy", "IronMan");
	jb.put("projectName", "Iron12");
	jb.put("status", "Completed");
	jb.put("teamSize", 10);
	 baseURI = "http://rmgtestingserver";
	 port=8084;
	 
	 given().body(jb).contentType(ContentType.JSON)
	.when().put("/projects/TY_PROJ_2943")
	 .then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
	 
	
}
}
