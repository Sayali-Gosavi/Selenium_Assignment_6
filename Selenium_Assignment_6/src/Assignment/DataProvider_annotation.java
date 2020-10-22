package Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class DataProvider_annotation {
	@Test(dataProvider = "details")
	public void f(Integer SrNo, String FirstName,String LastName) throws IOException {
		System.out.println(SrNo);
		System.out.println(FirstName);
		System.out.println(LastName);
	}

	@DataProvider(name="details")
	public Object[][] details() {
		Object[][] data = new Object[2][3];

		data[0][0]=1;
		data[0][1]="Satyam";
		data[0][2]="Gosavi";

		data[1][0]=2;
		data[1][1]="Shivam";
		data[1][2]="Gosavi";

		return data;
	}
	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
