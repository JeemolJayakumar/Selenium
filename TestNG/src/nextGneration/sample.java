package nextGneration;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class sample {
  @Test
  public void f() {
	  System.out.println("At Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterTest");
  }
}
