import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import ecomm_genericutility_webaction.SpecificationBildersBaseClass;
import genericUtility.Endpoints;

import static io.restassured.RestAssured.*;

public class addProject extends SpecificationBildersBaseClass
{
@Test
public void addProject()
{
	JSONObject jo = new JSONObject();
	jo.put("createdBy", "so");
	jo.put("projectName", "so888");
	jo.put("status", "created");
	jo.put("teamSize", 8);
	
	given().spec(requestspec).body(jo)
	.when().post(Endpoints.project_addProject)
	.then().spec(respnosespec).log().all();
}
}
