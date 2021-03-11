package com.testauto.exam.final_assignment_calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasicCalculatorTest {
	BasicCalculator bc = new BasicCalculator();

	@Test
	public void testAddition() {
		assertEquals(bc.addition(2, 1), 3, 0);
	}

}
