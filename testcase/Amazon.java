package testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;


public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='s-heavy'])[2]")).click();
		String NoOfBags = driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]")).getText();
		System.out.println(NoOfBags);
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();
		Thread.sleep(3000);
		String BagName = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText();
		System.out.println(BagName);
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
