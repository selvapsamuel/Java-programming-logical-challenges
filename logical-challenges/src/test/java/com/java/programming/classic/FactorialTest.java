package com.java.programming.classic;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FactorialTest {

	private FactorialRecursive factorialRecursive ;
	private FactorialIterative factorialIterative ;
	private int n;
	private int expectedResult;
	
	
	
	public FactorialTest(int n, int expectedResult) {
		super();
		this.n = n;
		this.expectedResult = expectedResult;
	}

	@Before
	   public void initialize() {
		factorialRecursive = new FactorialRecursive();
		factorialIterative = new FactorialIterative();
	   }
	
	  @Parameterized.Parameters
	   public static Collection factorial() {
	      return Arrays.asList(new Object[][] {
	         { 0, 1 },
	         { 1, 1 },
	         { 2, 2 },
	         { 3, 6 },
	         { 4, 24 },
	         { 5, 120 }
	      });
	   }
	  
	@Test
	public void calculateFactorialRecursive() {
		
		assertEquals(expectedResult, 
				factorialRecursive.findFactorial(n));
	}
	@Test
	public void calculateFactorialIterative() {
		
		assertEquals(expectedResult, 
				factorialIterative.findFactorial(n));
	}
}
