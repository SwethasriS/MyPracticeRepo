package com.example.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class addNumber {
	
	@Test
	public void testCorrect() {
		UnitTesting obj=new UnitTesting();
		assertEquals(24,obj.square(12,12));
		assertEquals(4,obj.square(2,2));
	}
	@Test
	public void testIncorrect() {
		UnitTesting obj=new UnitTesting();
		assertNotEquals(1,obj.square(1,1));
		assertNotEquals(18,obj.square(12,76));
	}

}
