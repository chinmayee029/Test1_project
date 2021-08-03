package newwebtesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));  //pageloadtimeout
		
				
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //implicitly wait
		
		//go to dropdown and click
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
		List<WebElement> ddlist=driver.findElements(By.xpath("//ul[@class='dropdown-menu test' and @aria-labelledby='menu1']//li[@role='presentation']//a"));
		System.out.println("Size of dropdown Elements" +ddlist.size());
		for(WebElement i:ddlist)
		{
			//System.out.println(i.getText());  //print total list
			if(i.getText().contains("JavaScript"))
			{
				i.click();
				System.out.println("Element get selected test passed");
			}
		}
	}
}
							