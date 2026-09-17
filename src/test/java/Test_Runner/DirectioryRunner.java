package Test_Runner;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModule.Directory;
import Utility.Apputils;

public class DirectioryRunner extends Apputils {

Directory dir;

@BeforeMethod
public void driversetup() {
	dir= new Directory(driver);
}


@DataProvider(name="data")
public Object[][] getdata(){
	return new Object[][] {
		{"user1"},
		{"user2"},
		{"user3"},		
	};
		
	}
@Test(dataProvider="data")
public void Directory_functionlity(String emp) {
	dir.UserClickOnDirectory();
	dir.UserEnteredEmpName(emp);
	dir.UserSelectJobtitle();
	dir.UserClickOnSearch();
}

	
	
	
}
