package cse360assign3;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		
		assertNotNull(calc);
	}
	
	@Test
	public void testGetTotal(){
		Calculator calc = new Calculator();
		
		calc.add(10);
		System.out.print(calc.getTotal());
		
		assertEquals("10", outContent.toString());
	}
	
	@Test
	public void testAdd(){
		Calculator calc = new Calculator();
		
		calc.add(10);
		calc.add(5);
		calc.add(21);
		System.out.print(calc.getTotal());
		
		assertEquals("36", outContent.toString());
	}
	
	@Test
	public void testSubtract(){
		Calculator calc = new Calculator();
		
		calc.subtract(10);
		calc.subtract(5);
		calc.subtract(21);
		System.out.print(calc.getTotal());
		
		assertEquals("-36", outContent.toString());
	}
	@Test
	public void testMultiply(){
		Calculator calc = new Calculator();
		
		calc.add(3);
		calc.multiply(5);
		calc.multiply(4);
		System.out.print(calc.getTotal());
		
		assertEquals("60", outContent.toString());
	}
	
	@Test
	public void testDivide(){
		Calculator calc = new Calculator();
		
		calc.add(6);
		calc.divide(2);
		System.out.print(calc.getTotal());
		
		assertEquals("3", outContent.toString());
	}
	
	@Test
	public void testDivideByZero() {
		Calculator calc = new Calculator();
		
		calc.add(4);
		calc.divide(0);
		System.out.print(calc.getTotal());
		
		assertEquals("0", outContent.toString());
	}
	
	@Test
	public void testGetHistory(){
		fail("Not yet implemented");
	}
}
