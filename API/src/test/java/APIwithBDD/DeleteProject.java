package APIwithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProject {
	@Test
	public void deleteproject()
	{
		baseURI = "http://rmgtestingserver";
		port=8084;
		when()
		.delete("/projects/TY_")
		.then().assertThat().statusCode(204).log().all();

	}
}
