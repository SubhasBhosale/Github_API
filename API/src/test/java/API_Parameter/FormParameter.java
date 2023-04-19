package API_Parameter;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class FormParameter {
	@Test
	public void formparam()
	{
		baseURI="http://localhost:8084/projects";
		//port=8084;
		given()
				.formParam("createdBy", "IronMan")
				.formParam("projectName","Ironmame12")
				.formParam("status", "On Going")
				.formParam("teamSize","11")
		.when().post("/addProject")
		.then().log().all();
	}
}
