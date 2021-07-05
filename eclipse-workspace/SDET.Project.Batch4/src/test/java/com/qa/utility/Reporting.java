package com.qa.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports xReports;
	ExtentTest xTest;

	

	@Override
	public void onStart(ITestContext start) {
		String Timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName="Test-Execution-Report"+Timestamp+".html";
		String Dest=System.getProperty("user.dir")+"/Reports/"+repName;
		
	 htmlReporter = new ExtentHtmlReporter(Dest);
		htmlReporter.config().setDocumentTitle("Orange HRM Page");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setReportName("Functional Testing");
		
		 xReports = new ExtentReports();
		xReports.attachReporter(htmlReporter);
		xReports.setSystemInfo("HostName", "LocalHost");
		xReports.setSystemInfo("OS", "Windows");
		xReports.setSystemInfo("QA Name", "Hema");
	}
	
	@Override
	public void onFinish(ITestContext finish) {
		xReports.flush();
	}
	
	

	@Override
	public void onTestSkipped(ITestResult tr) {
		xTest = xReports.createTest(tr.getName());
		xTest.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREY));
		xTest.log(Status.SKIP,"Test is Skipped");	
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		xTest = xReports.createTest(tr.getName());
		xTest.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		xTest.log(Status.PASS, "Test is Passed");
	}
	@Override
	public void onTestFailure(ITestResult tr) {
		xTest = xReports.createTest(tr.getName());
		xTest.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		xTest.log(Status.FAIL,"Test is Failed");
	}

}
