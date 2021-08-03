package testngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {
	
	@Test(priority=1)
	public void register()
	{
		System.out.println("This is registration process");
	}
	
	@Test(priority=2)
	public void login()
	{
		System.out.println("This is login page");
	}
	
	@Test(priority=3)
	public void addtocart()
	{
		System.out.println("This is add to cart");
	}
	
	@BeforeMethod
	public void bmethod()
	{
		System.out.println("welcome to the page");
	}
	
	@AfterMethod
	public void amethod()
	{
		System.out.println("Thank you for visiting");
		
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("This is called before class/test");		
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("This is called after class/test");		
	}
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This is called before first method");		
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("This called after last method");
	}
	
	

}
