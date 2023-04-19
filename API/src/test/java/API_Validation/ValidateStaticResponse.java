package API_Validation;
import static io.restassured.RestAssured.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
public class ValidateStaticResponse {
	@Test
	public void staticresponse()
	{
		String expData = "TY_PROJ_202";
		baseURI="http://localhost";
		port=8084;

		Response projects = when().get("/projects");
		Object actData = projects.jsonPath().get("[1].projectId");
		Assert.assertEquals(expData,actData);
		System.out.println("******data varified **********");
		projects.then().log().all();
	}
}
