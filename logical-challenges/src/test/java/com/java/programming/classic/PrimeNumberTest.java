package com.java.programming.classic;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberTest {


	private PrimeNumber primeNumber ;
	private int n;
	private boolean expectedResult;
	
	
	
	public PrimeNumberTest(int n, boolean expectedResult) {
		super();
		this.n = n;
		this.expectedResult = expectedResult;
	}

	@Before
	   public void initialize() {
		primeNumber = new PrimeNumber();
	   }
	
	  @Parameterized.Parameters
	   public static Collection factorial() {
	      return Arrays.asList(new Object[][] {
	         { 17, true },
	         { 21, false },
	         { 2, true },
	         { 3, true },
	         { 4, false },
	         { 6, false }
	      });
	   }
	  
	@Test
	public void checkIsPrime() {
		
		assertEquals(expectedResult, 
				primeNumber.isPrime(n));
	}

}
