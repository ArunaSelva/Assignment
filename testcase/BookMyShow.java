package testcase;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class BookMyShow {
public static void main(String[] args) throws InterruptedException {
	//ChromeDriver driver=new ChromeDriver();
	
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(option);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://in.bookmyshow.com/");
	
	
	driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Hyderabad");
	
	driver.findElement(By.xpath("//span[@class='sc-dBaXSw gYlrLO']")).click();
	
	String Pagetitle = driver.getTitle();
	System.out.println(Pagetitle);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
		
	driver.findElement(By.xpath("//div[@class='sc-7o7nez-0 fNzwUg']")).click();
	driver.findElement(By.xpath("//div[@class='sc-1vmod7e-2 iBonLL']")).click();
	driver.findElement(By.xpath("//div[@class='sc-vhz3gb-3 dRokFO']")).click();
	
	Thread.sleep(3000);
	String TheatreName = driver.findElement(By.xpath("//a[@class='__venue-name']")).getText();
	System.out.println(TheatreName);
	//driver.findElement(By.xpath("//div[@id='btnPopupAccept']")).click();
	
	driver.findElement(By.xpath("//div[@class='venue-info-text']")).click();
	String Parking = driver.findElement(By.xpath("(//div[@class='facility-text'])[2]")).getText();
	
	driver.findElement(By.xpath("//div[@class='cross-container']")).click();
	
	driver.findElement(By.xpath("(//div[@class='__text'])[3]")).click();
	driver.findElement(By.xpath("//li[@id='pop_1']")).click();
	driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
	driver.findElement(By.xpath("//a[@class='_available']")).click();
	driver.findElement(By.xpath("//a[@id='btmcntbook']")).click();

	Thread.sleep(3000);
	String Total1 = driver.findElement(By.id("subTT")).getText();
	System.out.println("The sub total by id is "+Total1);
//	String Tot1 = driver.findElement(By.xpath("//span[@id='subTT']")).getText();
	//System.out.println("The sub Total is by ID "+Tot1);
	
	String Tot = driver.findElement(By.xpath("//span[@class='__sub-total']")).getText();
	System.out.println("The sub Total is by class "+Tot);
//	driver.close();
	
}

}
