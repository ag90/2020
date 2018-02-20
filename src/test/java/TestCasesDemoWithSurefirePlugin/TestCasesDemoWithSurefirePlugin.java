package TestCasesDemoWithSurefirePlugin;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasesDemoWithSurefirePlugin {
	
	
	@Test
	
	public void TestNG()
	{
		int a=10;
		int b=20;
		int c=a+b;
		
	    Assert.assertEquals(c, 30);
	}
	
	@Test
	public void Junit()
	{
		int a=10;
		int b=40;
		int c=a+b;
		
	    Assert.assertEquals(c, 50);
	}
}
