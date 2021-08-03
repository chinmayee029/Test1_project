package newwebtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver_win32//chromedriver.exe");
		ChromeOptions c1=new ChromeOptions();
		c1.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(c1);
		driver.get("http://www.google.com");
		System.out.println("Title of web "+driver.getTitle());
		
		System.out.println("curreent url of an application "+driver.getCurrentUrl());
		
	}

}
