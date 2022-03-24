package week5.day2.classroom2;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		excelFilePath = "./testData/CreateLead.xlsx";
	}
	
	@Test(dataProvider = "Dynamic_Data")
	public void runTC001(String username, String pwd, String companyName, String fName, String lName) {
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(pwd);
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
			driver.findElement(By.name("submitButton")).click();

	}

}
