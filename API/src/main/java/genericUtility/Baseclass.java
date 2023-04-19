package genericUtility;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import Constants.FrameworkContants1;
import ecomm_genericutility_webaction.ExcelUtility;
import ecomm_genericutility_webaction.JavaUtility;
import ecomm_genericutility_webaction.PopupUtiltity;
import ecomm_genericutility_webaction.Propertyutility;
import ecomm_genericutility_webaction.dropDownUtility;
import ecomm_genericutility_webaction.selenium_utility;
import ecomm_genericutility_webaction.verification_utility;
import ecomm_genericutility_webaction.waitUtility;

public class Baseclass 
{
	public waitUtility wu;  
	public selenium_utility su;   
	public verification_utility vfu;  
	public Propertyutility pu;  
	public ExcelUtility xlu;   
	public WebDriver driver ;
	public PopupUtiltity popu;       
	public JavaUtility ju;
	public dropDownUtility du;
	public String browser;
	public SoftAssert sa;
	@BeforeClass
	public void beforeSuite() throws IOException
	{
	 	selenium_utility su = new selenium_utility();	
		verification_utility vfu = new verification_utility();
		dropDownUtility	du = new dropDownUtility();
		ExcelUtility	xlu = new ExcelUtility(FrameworkContants1.TEST_EXCEL_FILE_PATH);
		Propertyutility pu = new Propertyutility(FrameworkContants1.TEST_PROPERTY_FILE_PATH);
		waitUtility	wu=new waitUtility();
		PopupUtiltity	popu = new PopupUtiltity();
		SoftAssert sa = new SoftAssert();                                                //remove from here add in script
    }
	
	@AfterMethod
	public void afterMethod()
	{
		
	}
	
}
