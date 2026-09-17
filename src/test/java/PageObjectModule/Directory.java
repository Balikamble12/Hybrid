package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Apputils;
import Utility.Baseclass;

public class Directory {
	WebDriver driver;
	Baseclass base= new Baseclass();
	
	@FindBy(id="menu_directory_viewDirectory")
	WebElement Directory;
	@FindBy(id="searchDirectory_emp_name_empName")
	WebElement empName;
	@FindBy(id="searchDirectory_job_title")
	WebElement DirectoryJobtitle;
	@FindBy(id="searchDirectory_location")
	WebElement Location;
	@FindBy(id="searchBtn")
	WebElement SearchButton;
	
	public Directory(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void UserClickOnDirectory() {
		Directory.click();
	}
	public void UserEnteredEmpName(String emp) 
	{
		empName.sendKeys(emp);
	}
	
	public void UserSelectJobtitle() {
		base.dropdowntext(DirectoryJobtitle, "Test Engineer");
		
	}
	public void UserClickOnSearch() {
		SearchButton.click();
		
	}
}
