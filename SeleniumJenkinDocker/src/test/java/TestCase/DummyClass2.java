package TestCase;

import org.testng.annotations.Test;

import com.OrangeHRM.base.BaseClass;

public class DummyClass2 extends BaseClass{
	@Test
	public void DummyTest() throws InterruptedException
	{
		String Ti = driver.getTitle();
		assert Ti.equals("OrangeHRM") ;
		
		System.out.println(" Test Pass ") ;
	}
}
