package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void method1() 
  {
	//System.out.println("Method2 from Remo class");
	  Reporter.log("Method1 from Remo class",true);
  }
  @Test
  public void method3() 
  {
	//System.out.println("Method2 from Remo class");
	  Reporter.log("Method2 from Remo class",false);
  }
}
