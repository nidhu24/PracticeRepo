package javaproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.miit.Calculator;

public class CalculatorTests {
	@Test
	public void testAdd() {
		assertEquals(5, Calculator.add(2, 3));
		assertEquals(1, Calculator.add(-2, 3));
	}
	@Test
	public void testSub() {
		assertEquals(5, Calculator.sub(5, 3));
		assertEquals(5, Calculator.sub(7, -3));
	}
	@Test
	public void testMul() {
		assertEquals(5, Calculator.mul(1, 3));
		assertEquals(5, Calculator.mul(7, -3));
	}
	@Test
	public void testDiv() {
		assertEquals(5, Calculator.div(2, 3));
		assertEquals(5, Calculator.div(2, -3));
	}

	}





