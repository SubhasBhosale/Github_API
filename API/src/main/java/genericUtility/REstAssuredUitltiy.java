package genericUtility;


import io.restassured.response.Response;
public class REstAssuredUitltiy
{
	public String getJsonData(Response response,String path)
	{
		String jsonData = response.jsonPath().get(path);
		return jsonData;
	}
}