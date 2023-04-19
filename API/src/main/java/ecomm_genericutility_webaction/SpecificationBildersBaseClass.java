package ecomm_genericutility_webaction;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Constants.FrameworkContants;
import ecomm_flashcart_enum.Propertykey;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecificationBildersBaseClass
{
	public ResponseSpecification respnosespec;
	public RequestSpecification requestspec;
	@BeforeSuite
	public void bsCofig() throws IOException
	{
		RequestSpecBuilder builder = new RequestSpecBuilder();
		Propertyutility pu=new Propertyutility(FrameworkContants.TEST_PROPERTY_FILE_PATH);		
		String baseURI = "http://localhost";//pu.getPropertyData(Propertykey.BASEURI);

		builder.setBaseUri(baseURI);
		builder.setPort(8084);
		builder.setContentType(ContentType.JSON);
		requestspec = builder.build();
		
		
		
		ResponseSpecBuilder builder2= new ResponseSpecBuilder();
		builder2.expectContentType(ContentType.JSON);
		builder2.expectResponseTime(Matchers.lessThan(800L),TimeUnit.SECONDS);
		respnosespec = builder2.build();
	}
	}















