package newwebtesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class NumberOfObjects {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));  //pageloadtimeout
		
				
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicitly wait
		
		//total no of link in home page
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int num=links.size(); //total no of link
		System.out.println("Total num of links:"+num); //6
		
		//name of the link
		for(WebElement i:links)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());
			
		}
		
		//total no of textbox in home page
		List<WebElement> textbox=driver.findElements(By.tagName("input"));
		int txnum=textbox.size();
		System.out.println("Total num of textbox:"+txnum);  //8
		
		
		//login
		driver.findElement(By.xpath("//input[contains(@id,'txtUsername')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#btnLogin")).click();
		
		//go to pim
		
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).sendKeys("chinmayee");
		
		//go to employee status 
		WebElement empstatus=driver.findElement(By.xpath("//select[contains(@id,'empsearch_employee_status')]"));
		empstatus.click();
		
		
		
		
		//go to employee status dropdown <select> tag
		
		Select s1=new Select(empstatus);
		System.out.println("Is dropdown support multiple selections:"+s1.isMultiple()); //false
		s1.selectByIndex(5);
		List<WebElement> status=s1.getOptions();
		for(WebElement i:status)
		{
			System.out.println(i.getText());
		}
		
		
		//go to jobtitle dropdown
		WebElement jobtitle=driver.findElement(By.xpath("//select[contains(@id,'empsearch_job_title')]"));
		jobtitle.click();
		
		Select s2=new Select(jobtitle);
		s2.selectByValue("8"); //QA LEAD
		
		//go to subunit dropdown
		WebElement subunit=driver.findElement(By.xpath("//select[@id='empsearch_sub_unit']"));
		subunit.click();
		
		Select s3=new Select(subunit);
		s3.selectByVisibleText("Quality Assurance");
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
	}

}
