package test.java.JenkinsCalculatrice;


import junit.framework.*;
import main.java.JenkinsCalculatrice.*;

public class TestCalculatrice extends TestCase{

	
	public void test() {
		assertEquals(true, true);
	}
	
	public void testAddition()
	{
		try {
			assertEquals(Calculatrice.operation("2+2"),4.0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testSuous()
	{
		try {
			assertEquals(Calculatrice.operation("2-2"),0.0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testMultiplication()
	{
		try {
			assertEquals(Calculatrice.operation("2*2"),4.0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
