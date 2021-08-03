package newwebtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookApplication {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/ul/li[11]/a")).click(); //english language
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();*/
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.manage().window().maximize();
		driver.manage().window().minimize();  //minimize options only avilable in selenium 4.
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
		
		
	
		
		
		
				
		

	}

}
