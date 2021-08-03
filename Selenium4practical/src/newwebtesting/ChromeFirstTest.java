package newwebtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeFirstTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		/*System.out.println("page source:"+driver.getPageSource());
		driver.close();
		driver.quit();*/
		
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Title is:" +driver.getTitle()); //facebook
		driver.navigate().back(); //google
		driver.navigate().forward(); //facebook
		driver.navigate().refresh();
		
		
		

	}

}
