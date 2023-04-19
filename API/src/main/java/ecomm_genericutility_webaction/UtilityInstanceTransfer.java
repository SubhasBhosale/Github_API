package ecomm_genericutility_webaction;

import com.aventstack.extentreports.ExtentTest;

public class UtilityInstanceTransfer                
//to add different different author names and category in report through testscript through report utility
{
      
	  private static ThreadLocal<ExtentTest> extentTest=new ThreadLocal<>();

	
	   //getters
	    public static ExtentTest getExtentTest()     //getters   
	    {
			return extentTest.get();
	    }
	    
	    
	    
	   //setters
		public static void setExtentTest(ExtentTest setExtentTest)      //setters
		{
			extentTest.set(setExtentTest);
		}
		
}

//static is single copy with the help of 8th line we can use it as a multiple copy
//thread local