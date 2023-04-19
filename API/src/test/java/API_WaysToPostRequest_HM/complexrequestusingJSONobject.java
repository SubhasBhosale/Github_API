package API_WaysToPostRequest_HM;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class complexrequestusingJSONobject
{
	@Test
	public void test()
	{
		baseURI="https://petstore.swagger.io/v2";
		
		JSONObject jo = new JSONObject();
		jo.put("id", 0);
		
		
		JSONObject jo2 = new JSONObject();
		jo2.put("id", 0);
		jo2.put("name", "subhas");
		jo.put("category", jo2);

		jo.put("name", "doggie");
		
		JSONArray ja = new JSONArray();
		ja.add("./src/test/resources/common_data/image/Screenshot (1005).png");
		jo.put("photoUrls", ja);
		
		JSONObject jo3 = new JSONObject();
		jo3.put("id", 0);
		jo3.put("name", "string");
		JSONArray ja2 = new JSONArray();
		jo.put("tags", ja2);
		
		jo.put("status", "available");
		
		given().body(jo).contentType(ContentType.JSON)
		.when().post("/pet").then().assertThat().statusCode(200).log().all();

	}
}
