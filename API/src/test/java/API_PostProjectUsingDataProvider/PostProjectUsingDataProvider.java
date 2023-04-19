package API_PostProjectUsingDataProvider;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import pojolibrary.pojoclassforctreatingproject;

public class PostProjectUsingDataProvider 
{
	@Test  (dataProvider = "testBody")
	public void dataprovidertest(String createdBy,String projectName,String status,int teamsize)
	{
		pojoclassforctreatingproject pojo = new pojoclassforctreatingproject(createdBy, projectName, status, teamsize);
		baseURI="http://localhost:8084/projects";
		given().body(pojo).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then()/*.assertThat().statusCode(201)*/.contentType(ContentType.JSON).log().all();

	}
	@DataProvider
	public Object[][] testBody()
	{

		Object[][] obj= new Object[2][4];

		obj[0][0]="IronMan4";
		obj[0][1]="Iron1234";
		obj[0][2]="Completed";
		obj[0][3]=10;

		obj[1][0]="SpiderMan4";
		obj[1][1]="SpiderMan1234";
		obj[1][2]="On Going";
		obj[1][3]=8;
		return obj;	
	}
}
