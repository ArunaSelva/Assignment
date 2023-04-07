package testcase;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class RedBus {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.id("src"));
		findElement.sendKeys("chennai");
		
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//td[@class='wd day']")).click();
		
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
			
		String BusNum = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(BusNum);
		
	    driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
	    String busName = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
	    System.out.println(busName);
	    String pageName = driver.getTitle();
	    System.out.println(pageName);
	    driver.close();
	}

}
