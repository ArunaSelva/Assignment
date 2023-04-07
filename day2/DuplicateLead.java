package Week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();	  
         // 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
  // Enter UserName and Password Using Id Locator
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
  //Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
  // Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();		
  // Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
  // Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
  // Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
  // Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aruna");
  // Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
  // Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aruna");
  // Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
  // Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("NON IT");
  // Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arunace31@gmail.com");
  // Select State/Province as NewYork Using Visible Text
		WebElement Province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd=new Select(Province);
		dd.selectByVisibleText("Indiana");
		Thread.sleep(3000);
  // Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();
          // Get the Title of Resulting Page(refer the video)  using driver.getTitle()
		String title = driver.getTitle();
		System.out.println(title);
		   // Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
          // Clear the CompanyName Field using .clear() And Enter new CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf1");
          //Clear the FirstName Field using .clear() And Enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arunaa");
		
          //Click on Create Lead Button
		driver.findElement(By.className("smallSubmit")).click();
          // Get the Title of Resulting Page(refer the video)  using driver.getTitle();
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.close();
	}

}
