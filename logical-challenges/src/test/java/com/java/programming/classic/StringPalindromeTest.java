package com.java.programming.classic;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringPalindromeTest {
	
	private StringPalindrome stringPalindrome;
	private String str;
	private boolean expectedResult;
	
	public StringPalindromeTest (String str, boolean expectedResult){
		this.str=str;
		this.expectedResult=expectedResult;
	}
	
	@Before
	public void initialize() {
		stringPalindrome = new StringPalindrome();
	}
	
	  @Parameterized.Parameters
	   public static Collection palindrom() {
	      return Arrays.asList(new Object[][] {
	         { "amma", true },
	         { "appa", true },
	         { "aunty", false },
	         { "malayalam", true },
	         { "tamil", false },
	         { "telugu", false }
	      });
	   }
	  
	  @Test
	  public void isPalindrom() {
		  assertEquals(expectedResult,stringPalindrome.isPalindrome(str));
	  }
}
