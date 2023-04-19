package API_Validation;
import static io.restassured.RestAssured.*;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class ValidateDyanmicResponse {
	@Test
	public void dyanmicrespo()
	{
		String expData = "TY_PROJ_206";
		baseURI="http://localhost";
		port=8084;

		Response projects = when()
				.get("/projects");
		boolean flag=false;
		List<String> pIDs = projects.jsonPath().get("projectId");
		for ( String pid : pIDs)
		{
			if (pid.equalsIgnoreCase(expData)) 
			{
				flag=true;
			}
		}
		System.out.println("Data verified");
		Assert.assertTrue(flag);
		projects.then().log().all();
	}
}


