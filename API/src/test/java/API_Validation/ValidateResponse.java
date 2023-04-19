package API_Validation;
import static io.restassured.RestAssured.given;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class ValidateResponse {
	@Test
	public void validatetest()
	{
		String expcontenttype = "application/json";
		String expPragma = "no-cache";
		String expvary = "Access-Control-Request-Headers";

		Response res = given()
				//	.get("http://rmgtestingserver:8084/projects");
				.get("http://localhost:8084/dashboard/projects");
		System.out.println(res.getBody().prettyPeek());

		String actcontenttype = res.getContentType();
		String actPragma = res.getHeader("Pragma");
		String 	actVary = res.getHeader("Vary");
		res.then().log().all();
		Assert.assertEquals(expcontenttype,actcontenttype);
		Assert.assertEquals(expPragma,actPragma);
		Assert.assertEquals(expvary,actVary);

		System.out.println("======>>>>>  "+res.sessionId());

		System.out.println(res.getHeaders());
		System.out.println("****************************************");
		System.out.println(res.getHeader("Connection"));
	}
}
//Pragma: no-cache
//Vary: Access-Control-Request-Method
//Vary: Origin