package ex2;
import static org.junit.Assert.*;
import org.junit.Test;




public class AssertCheck {
	
	@Test
	public  void testCorrect() {
		UnitTest obj=new UnitTest();
		assertEquals(4,obj.square(2));
		assertEquals(49,obj.square(7));

		
		
	}
	@Test
	public  void testNotCorrect() {
		UnitTest obj=new UnitTest();
		assertNotEquals(6,obj.square(2));
		assertNotEquals(12,obj.square(7));

		
		
	}

}

