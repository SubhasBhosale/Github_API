package APIwithBDD;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class getProject {
	@Test
	public void getproject()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		when()
		.get("/projects/TY_PROJ_2943")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();  
	}
}
