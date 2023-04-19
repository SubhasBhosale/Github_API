package API_Parameter;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class QueryParameter {
@Test
public void queryparam()
{
	baseURI="https://reqres.in/api/users";
	
	given().queryParam("page", "2")
	.when().get()
	.then().log().all();
	
}
}
