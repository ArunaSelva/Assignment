package Week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class CreateLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//login functionality
		driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//click on CRM/SFA
		driver.findElement(By.xpath("//div[@id='label']")).click();
		//maximize
		driver.manage().window().maximize();
		//Leads option
		driver.findElement(By.linkText("Leads")).click();
		//create lead option
		driver.findElement(By.linkText("Create Lead")).click();
		//org Name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Leaf");
		//First name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Aruna");
		//last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("T");
		//last name local
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Aruna");
		//department
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
		//drscription
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Non IT");
		//email id
		driver.findElement(By.xpath("(//input[@class='inputBox'])[20]")).sendKeys("arunace31@gmail.com");
		//select province
		WebElement findElement = driver.findElement(By.xpath("(//select[@class='inputBox'])[6]"));
		Select dd=new Select(findElement);
		dd.selectByVisibleText("Indiana");
		//create button
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//title
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}

}
