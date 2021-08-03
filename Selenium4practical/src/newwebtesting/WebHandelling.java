package newwebtesting;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebHandelling {

	//open orangehrm
	//click on linkdin link
	//enter username
	//then come back to login page 
	//then login and logout
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("http://www.google.com/gmail/about/#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String parent=driver.getWindowHandle();
		System.out.println("parent id is"+parent);
		System.out.println("parent title is"+driver.getTitle());
		
		driver.findElement(By.linkText("Create an account")).click(); //parent
		//after click you are on child window
		
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println("child id is"+ allwindows);
		System.out.println("child title is"+driver.getTitle());
		System.out.println("total child window is"+allwindows.size());
		
		for(String child:allwindows)
		{
			if(!parent.equals(child))
			{
				//switch to child
				driver.switchTo().window(child);
				driver.findElement(By.id("firstName")).sendKeys("Chinmayee"); //child window
				driver.close();
			}
			driver.switchTo().window(parent);
			
		}
		
		

	}

}
