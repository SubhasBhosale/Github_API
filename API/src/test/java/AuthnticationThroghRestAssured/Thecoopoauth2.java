package AuthnticationThroghRestAssured;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class Thecoopoauth2 
{
	@Test
	public void test()
	{
		Response resp = given().formParam("client_id", "det46")
				.formParam("client_secret","af3705638047277b40df172a0e818f9c")
				.formParam("grant_type", "client_credentials")
				.formParam("redirect_uri", "http://hello.com")
				.formParam("code", "4471")
				.when().post("http://coop.apps.symfonycasts.com/token");
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);

		given().auth().oauth2(token).pathParam("USER_ID", "4471")
		.when().post("http://coop.apps.symfonycasts.com/api/{USER_ID}/chickens-feed").then().log().all();
	}
}
