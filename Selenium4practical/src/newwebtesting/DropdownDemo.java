package newwebtesting;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement dd=driver.findElement(By.id("select-demo"));
		dd.click();
		
		Select s1=new Select(dd);
		s1.selectByIndex(3);
		
		List<WebElement> list=s1.getOptions();
		System.out.println(list.size());
		for(WebElement i:list)	
		{

			System.out.println(i.getText());
			if(i.getText().contains("Tuesday")) 
			{
				i.click();
				
			}
			
		}
		
		System.out.println("Text get selected and passed");

	}

}
