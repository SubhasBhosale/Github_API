package APIwithBDD;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
public class addProject
{
	@Test
	public void addproject()
	{
		JSONObject jb = new JSONObject();
		jb.put("createdBy", "IronMan");
		jb.put("projectName", "Iron125");
		jb.put("status", "On Going");
		jb.put("teamSize", 10);
		baseURI="http://rmgtestingserver";
		port=8084;
		given()
		.body(jb).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().statusCode(201).contentType(ContentType.JSON).log().all();
	}
}

//TY_PROJ_2804
