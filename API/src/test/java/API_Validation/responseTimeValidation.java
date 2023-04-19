package API_Validation;
import static io.restassured.RestAssured.*;
import java.util.concurrent.TimeUnit;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class responseTimeValidation 
{
	@Test
	public void responseTime()
	{
		baseURI="http://rmgtestingserver";
		port=8084;

		when().get("/projects")
    	.then().time(Matchers.lessThan(500l),TimeUnit.MILLISECONDS)
		       .body("[5].teamSize", Matchers.equalTo(8))                                                                                                                                                                                                                                                                                                                                                                                                                        
		       .log().all();
	}
}

