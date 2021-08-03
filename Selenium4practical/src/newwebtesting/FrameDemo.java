package newwebtesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameDemo {
	
	@Test
	public void Test1() {
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver;
	driver=new ChromeDriver();
	
	driver.get("http://leafground.com/");
	
	//go to frame
	driver.findElement(By.linkText("Frame")).click();
	
	
	
	//i am inside a frame
	
	driver.switchTo().frame(0);
	driver.findElement(By.id("Click")).click();
	driver.switchTo().defaultContent();

	
	//i am inside a nested frame
	
	driver.switchTo().frame(1);
	driver.findElement(By.id("click1")).click();
	driver.switchTo().defaultContent();
	

	
	//find total no of frame
	List<WebElement> totalFrames=driver.findElements(By.tagName("iframe"));
	System.out.println("Total number of frames:-"+totalFrames.size());
	
	
	driver.close();
		
	
}


	
	
}
