package Assignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {

	WebDriver d;
	static ExtentTest test;
	static ExtentReports report;

	@Test
	public void f() {
		if (d.getTitle().equals("Gmail")) {
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}

	}
	@Before
	public void beforeTest() {
		report = new ExtentReports("E:\\Reskill\\Selenium Workspace\\Selenium_Assignment_6\\Extent Report\\ExtentReport.html",true);
		test = report.startTest("Extent Demo");
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.gmail.com");
	}

	@After
	public void afterTest() {
		report.endTest(test);
		report.flush();
		d.quit();
	}

}
