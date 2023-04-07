package Week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize
		driver.manage().window().maximize();
		//login function
		//username by id
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Password by id
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//loginbutton by class
		driver.findElement(By.className("decorativeSubmit")).click();
		//linktext
		driver.findElement(By.partialLinkText("CRM")).click();
		// Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		// 6. Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
		//  7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		// 8. Enter FirstName Field Using id Locator
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aruna");
		 //9. Enter LastName Field Using id Locator
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
		// 10. Enter FirstName(Local) Field Using id Locator
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aruna");
		 
		 // 11. Enter Department Field Using any Locator of Your Choice
		 driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
		 // 12. Enter Description Field Using any Locator of your choice 
		 WebElement findElement2 = driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']"));
		 findElement2.sendKeys("NON IT");
		  //13. Enter your email in the E-mail address Field using the locator of your choice
		 driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("arunace31@gmail.com");
		 
		 // 14. Select State/Province as NewYork Using Visible Text
		 WebElement findElement = driver.findElement(By.xpath("(//select[@class='inputBox'])[6]"));
			Select dd=new Select(findElement);
			dd.selectByVisibleText("Indiana");
		//  15. Click on Create Button
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
         //  16. Click on edit button
			driver.findElement(By.linkText("Edit")).click();
			
           // 17. Clear the Description Field using .clear()
			
			//driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).clear();
			//driver.findElement(By.id("createLeadForm_description")).clear();
			driver.findElement(By.id("updateLeadForm_description")).clear();
			//Thread.sleep(3000);
		//  18. Fill ImportantNote Field with Any text
			driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Leataps");
	//	  19. Click on update button 
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			//driver.findElement(By.id("ext-gen595")).click();
		
			driver.close();

}
}