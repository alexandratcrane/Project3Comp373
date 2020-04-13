package pattern.bridge;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import pattern.bridge.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAll {
	private Color blue;
	private Color red;
	private TShirtSize size;
	 
	

	@Before
	public void setUp(){
		blue = new Blue();
		red = new Red();
		size = null;
		
	}
	
	@Test
	public void testLargeBlue() {
		size = new Large(blue);
		 assertTrue(size instanceof TShirtSize);
	}
	
	
	@Test
	public void testMediumBlue() {
		size = new Medium(blue);
		 assertTrue(size instanceof TShirtSize);
	}
	
	
	@Test
	public void testSmallBlue() {
		size = new Small(blue);
		 assertTrue(size instanceof TShirtSize);
	}
	
	
	@Test
	public void testLargeRed() {
		size = new Large(red);
		 assertTrue(size instanceof TShirtSize);
	}
	
	@Test
	public void testMediumRed() {
		size = new Medium(red);
		 assertTrue(size instanceof TShirtSize);
	}
	
	@Test
	public void testSmallRed() {
		size = new Small(red);
		 assertTrue(size instanceof TShirtSize);
	}


}
