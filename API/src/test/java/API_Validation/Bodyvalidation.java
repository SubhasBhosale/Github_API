package API_Validation;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class Bodyvalidation 
{
	@Test
	public void bodyvaltest()
	{
		String expdata = "TY_PROJ_2947";

		Response res = given()
				.get("http://rmgtestingserver:8084/projects");

		//		System.out.println(res);    //print the address of the body
		//		ResponseBody respbody = res.getBody();    
		//		System.out.println(respbody);        //print the address of the body

		//			String body = res.getBody().prettyPrint();   //response body 
		//				System.out.println(body);


		//	System.out.println(res.getBody().asString());		//response body 


		// System.out.println(res.getBody().prettyPeek());	 //response body header ...........??????
		// System.out.println(res.getBody().asPrettyString());    //response body 
		//	System.out.println(res.getBody().toString());   //print the address of the body

	}
}
