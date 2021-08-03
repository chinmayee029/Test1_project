package testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestDemo4 {
	
	
  @Test
  public void chrometesting()
  {
	  System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver_win32//chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  System.out.println("title of the page:"+driver.getTitle());
	  
	  
	  
  }
  
  @Test
  public void firefoxtesting()
  {
	  System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver-v0.29.1-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println("Title is: "+title);
		
				

  }
}
