package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void method1() 
  {
	 // System.out.println("Method1 from demo class");
	  Reporter.log("Method1 from demo class",true);
  }
  @Test
  public void method2() 
  {
	 // System.out.println("Method2 from demo class");
	  Reporter.log("Method2 from demo class",false);

  }
  
}

