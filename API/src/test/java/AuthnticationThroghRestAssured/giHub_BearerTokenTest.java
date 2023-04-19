package AuthnticationThroghRestAssured;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class giHub_BearerTokenTest 
{
	@Test
	public void test()
	{
		Response rep = given().auth().oauth2("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")
				       .when().get("https://api.github.com/user/repos");
	             
		 				rep.then().log().all();	
	}
}
