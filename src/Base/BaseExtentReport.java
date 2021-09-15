package Base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class BaseExtentReport {

    public static         ExtentTest test;
    public static         ExtentReports extent;



    @BeforeSuite

    public static  ExtentReports Instance() {

        //ExtentReports extent;
        String path = "C:\\Users\\juee.ningshetti\\OneDrive\\Desktop\\TestNGReport-demo.html";
        extent =new ExtentReports(path,false);
        ExtentTest test;

        return extent;



    }

    @AfterMethod
            public void getResult(ITestResult result)
    {
        if(result.getStatus()==ITestResult.FAILURE)
        {return ;        }



}




}
