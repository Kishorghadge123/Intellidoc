package Tests;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentJavaFactory {
    public static  ExtentReports Instance() {

        ExtentReports extent;
        String path = "C:\\Users\\juee.ningshetti\\OneDrive\\Desktop\\TestNGReport-demo.html";
        extent =new ExtentReports(path,false);

        return extent;



    }
}
