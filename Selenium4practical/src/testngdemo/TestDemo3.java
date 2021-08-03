package testngdemo;

import org.testng.annotations.Test;

public class TestDemo3 
{
	
  @Test (priority=1,invocationCount=2)
  public void one()
  {
	  System.out.println("This is first testcase");
  }
  
  
  
  @Test (priority=2)
  public void two()
  {
	  System.out.println("This is second testcase");
  }
  
  
  
  @Test(priority=3,enabled=false)   //it will not run
  public void three()
  {
	  System.out.println("This is third testcase");
  }
  
}
