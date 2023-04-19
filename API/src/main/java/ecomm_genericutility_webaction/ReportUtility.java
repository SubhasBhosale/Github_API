package ecomm_genericutility_webaction;	

import java.io.IOException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import Constants.FrameworkContants1;
import ecomm_flashcart_enum.Propertykey;

public class ReportUtility 
{
	public ExtentReports  report;     
	//declared as public for report bcz we can access report to any classes 
	//so it will check the testscript and produce result according to it
	/**
	 * This constructor will initialize the report utility
	 * @param filePath
	 * @param title
	 * @param reportname
	 * @param browserName
	 */
	public ReportUtility()  // ============>>>>>>>>>>>>>> constructor
	{
		String randomName=null;
		Propertyutility pu = null;
		try 
		{
			pu = new Propertyutility(FrameworkContants1.TEST_PROPERTY_FILE_PATH);

		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		String overRide = pu.getPropertyData(Propertykey.OVERRIDEREPORT);          //this statement result is in yes or no
		//if we don't override the screenshot 
		//means it will not replace the older screenshot
		//then we have to save with unique name thats possible by giving date and time to it
		if(overRide.equalsIgnoreCase("no")) 
		{
			randomName = "_"+new JavaUtility().getCurrentDateTime();
		}

		//spark is a template that's it
		ExtentSparkReporter spark = new ExtentSparkReporter(pu.getPropertyData(Propertykey.REPORTFILEPATH)+"extentreport"+randomName+" .html");
		spark.config().setDocumentTitle( pu.getPropertyData(Propertykey.REPORTTITLE));
		spark.config().setReportName( pu.getPropertyData(Propertykey.REPORTNAME));
		spark.config().setTheme(Theme.DARK);

		report = new ExtentReports();
		report.attachReporter(spark);             //we are adding spark template to report referance variable  
		report.setSystemInfo("Browser",  pu.getPropertyData(Propertykey.BROWSER));
		report.setSystemInfo("OS", System.getProperty("os.name"));  //syntax

	}
	/**
	 * this method will create ExtentTest object for given test name
	 * @param testName
	 */
	public void createTest(String testName) 
	{
		ExtentTest test = report.createTest(testName);
		UtilityInstanceTransfer.setExtentTest(test);
	}

	/**
	 * this method will log test pass message into the report 
	 * and console as well
	 * @param message
	 */
	public void pass(ExtentTest test, String message) {
		test.pass(message);                                                    //template msg
		System.out.println(message);                                           //console
	}

	/**
	 * this method will log test fail message into the report 
	 * @param message
	 */
	public void fail(ExtentTest test, Throwable errormsg)
	//throwable is super class of all the errors and exceptions in the java language
	{
		test.fail(errormsg);
		System.out.println(errormsg);
	}
	/**
	 * 
	 * @param test
	 * @param errormsg
	 */
	public void fail(ExtentTest test, String msg) {
		test.fail(msg);
		System.out.println(msg);
	}
	/**
	 * 
	 * @param test
	 * @param message
	 */
	public void warn(ExtentTest test, String message) {
		test.warning(message);
		System.out.println(message);
	}

	/**
	 * 
	 * @param test
	 * @param message
	 * @param errorMessage
	 */
	public void skip(ExtentTest test, String message, Throwable errorMessage) {
		test.skip(message);
		test.skip(errorMessage);
		System.out.println(message);
	}

	/**
	 * 
	 * @param test
	 * @param message
	 */
	public void info(ExtentTest test, String message) {
		test.info(message);
		System.out.println(message);
	}

	/**
	 * 
	 * @param test
	 * @param names
	 */
	public void addAuthor(ExtentTest test, String... names) {
		test.assignAuthor(names);
	}

	/**
	 * 
	 * @param test
	 * @param names
	 */
	public void addCategory(ExtentTest test, String... names) {
		test.assignCategory(names);
	}
	/**
	 * 
	 * @param test
	 * @param screenshotPath
	 * @param title
	 * @param strategy
	 */
	public void attachScreenshot(ExtentTest test, String screenshotPath, String title, String strategy) 
	//screenshotPath ==>> selenium utility method name for screenshot that should return absolute screenshot path
	{
		if (strategy.equalsIgnoreCase("base64")) 
		{
			test.addScreenCaptureFromBase64String(screenshotPath, title);
		}
		else 
		{
			test.addScreenCaptureFromPath(screenshotPath, title);
		}
	}
	/**
	 * 
	 */
	public void saveReport()
	{
		report.flush();
	}
}
/*
 * we not added in bussiness class bcz
 * 
 * */
