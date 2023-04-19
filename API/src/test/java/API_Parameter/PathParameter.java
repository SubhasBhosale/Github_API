package API_Parameter;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class PathParameter {
	@Test
	public void pathparam()
	{
		baseURI="http://rmgtestingserver";
		port=8084;

		given().pathParam("pid", "TY_PROJ_2952")
		.when().get("/projects/{pid}")	
		.then().log().all();
	}
}
