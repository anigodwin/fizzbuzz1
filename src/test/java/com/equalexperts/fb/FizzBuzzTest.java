package com.equalexperts.fb;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz;
	
	@Before
	public void setUp() throws Exception {
		fizzBuzz  = new FizzBuzz();
	}

	@Test
	public void fizzForMultipleOfThree() {
		assertTrue("fizz".equals(fizzBuzz.fizzForMultipleOfThree("3")));		
		assertTrue("fizz".equals(fizzBuzz.fizzForMultipleOfThree("6")));		
		assertTrue("fizz".equals(fizzBuzz.fizzForMultipleOfThree("9")));
	}

	@Test
	public void fizzForMultipleOfThree_ShouldReturnNumberForNonMultipleOfThree() throws Exception {
		assertTrue("4".equals(fizzBuzz.fizzForMultipleOfThree("4")));
		assertTrue("10".equals(fizzBuzz.fizzForMultipleOfThree("10")));
		assertTrue("19".equals(fizzBuzz.fizzForMultipleOfThree("19")));
	}
	
	@Test
	public void fizzForMultipleOfThree_isNotNumber_shouldReturnValue() throws Exception {
		assertTrue("fizz".equals(fizzBuzz.buzzForMultipleOfFive("fizz")));
		assertTrue("fizzbuzz".equals(fizzBuzz.buzzForMultipleOfFive("fizzbuzz")));
	}
	
	@Test
	public void fizzForMultipleOfThree_isNegativeNumber_shouldReturnValue() throws Exception {
		assertTrue("-13".equals(fizzBuzz.buzzForMultipleOfFive("-13")));
		assertTrue("-6".equals(fizzBuzz.buzzForMultipleOfFive("-6")));
		assertTrue("-20".equals(fizzBuzz.buzzForMultipleOfFive("-20")));
	}
	@Test
	public void fizzForMultipleOfThree_ShouldThrowExcptionForZero() throws Exception {
		assertTrue("0".equals(fizzBuzz.fizzForMultipleOfThree("0")));
	}
	
	@Test
	public void buzzForMultipleOfFive() throws Exception {
		assertTrue("buzz".equals(fizzBuzz.buzzForMultipleOfFive("5")));
		assertTrue("buzz".equals(fizzBuzz.buzzForMultipleOfFive("10")));
		assertTrue("buzz".equals(fizzBuzz.buzzForMultipleOfFive("15")));
		assertTrue("buzz".equals(fizzBuzz.buzzForMultipleOfFive("20")));
	}
	
	@Test
	public void buzzForMultipleOfFive_ShouldReturnNumberForNonMultipleOfFive() throws Exception {
		assertTrue("7".equals(fizzBuzz.buzzForMultipleOfFive("7")));
		assertTrue("11".equals(fizzBuzz.buzzForMultipleOfFive("11")));
		assertTrue("18".equals(fizzBuzz.buzzForMultipleOfFive("18")));
	}
	
	@Test
	public void buzzForMultipleOfFive_isNotNumber_shouldReturnValue() throws Exception {
		assertTrue("fizz".equals(fizzBuzz.buzzForMultipleOfFive("fizz")));
		assertTrue("fizzbuzz".equals(fizzBuzz.buzzForMultipleOfFive("fizzbuzz")));
		
	}
	
	@Test
	public void buzzForMultipleOfFive_isNegativeNumber_shouldReturnValue() throws Exception {
		assertTrue("-13".equals(fizzBuzz.buzzForMultipleOfFive("-13")));
		assertTrue("-5".equals(fizzBuzz.buzzForMultipleOfFive("-5")));
		assertTrue("-10".equals(fizzBuzz.buzzForMultipleOfFive("-10")));
	}
	
	@Test
	public void buzzForMultipleOfFive_ShouldThrowExcecptionForZero() throws Exception {
		assertTrue("0".equals(fizzBuzz.buzzForMultipleOfFive("0")));
	}
	
	@Test
	public void fizzBuzzForMultipleOfFifteen() throws Exception {
		assertTrue("fizzbuzz".equals(fizzBuzz.fizzBuzzForMultipleOfFifteen(15)));
		assertTrue("fizzbuzz".equals(fizzBuzz.fizzBuzzForMultipleOfFifteen(30)));
	}
	
	@Test
	public void fizzBuzzForMultipleOfFifteen_ShouldReturnNumberForNonMultipleOfFifteen() throws Exception {
		assertTrue("12".equals(fizzBuzz.fizzBuzzForMultipleOfFifteen(12)));
		assertTrue("23".equals(fizzBuzz.fizzBuzzForMultipleOfFifteen(23)));
		assertTrue("16".equals(fizzBuzz.fizzBuzzForMultipleOfFifteen(16)));
	}
	
	@Test
	public void fizzBuzzForMultipleOfFifteen_ShouldThrowExcecptionForZero() throws Exception {
		assertTrue("0".equals(fizzBuzz.fizzBuzzForMultipleOfFifteen(0)));
	}
	
	@Test
	public void fizzBuzzForMultipleOfFifteen_ShouldThrowExcecptionForNegativeNumber() throws Exception {
		assertTrue("-14".equals(fizzBuzz.fizzBuzzForMultipleOfFifteen(-14)));
		assertTrue("-18".equals(fizzBuzz.fizzBuzzForMultipleOfFifteen(-18)));
		assertTrue("-25".equals(fizzBuzz.fizzBuzzForMultipleOfFifteen(-25)));
	}
	
	//@Test
	public void realFizzBuzzForMultiplesOfThreeOnly() throws Exception {
		String[] expected = new String[] {"1", "2", "fizz", "4", "5", "fizz", "7", "8", "fizz", "10",
				"11", "fizz", "13", "14", "fizz", "16", "17", "fizz", "19", "20"};
		List<String> result = fizzBuzz.realFizzBuzz(1, 20);
		assertTrue(Arrays.equals(expected, result.toArray()));
	}
	
	//@Test
	public void realFizzBuzzForMultiplesOfFiveOnly() throws Exception {
		String[] expected = new String[] {"1", "2", "3", "4", "buzz", "6", "7", "8", "9", "buzz",
				"11", "12", "13", "14", "buzz", "16", "17", "18", "19", "buzz"};
		List<String> result = fizzBuzz.realFizzBuzz(1, 20);
		assertTrue(Arrays.equals(expected, result.toArray()));
	}
	
	//@Test
	public void realFizzBuzzForMultiplesOfFifteenOnly() throws Exception {
		String[] expected = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11", "12", "13", "14", "fizzbuzz", "16", "17", "18", "19", "20"};
		List<String> result = fizzBuzz.realFizzBuzz(1, 20);
		assertTrue(Arrays.equals(expected, result.toArray()));
	}
	
	@Test
	public void realFizzBuzzForRangeOfNumbers_OneToTwenty() throws Exception {
		String[] expected = new String[] {"1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz",
				"11", "fizz", "13", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz"};
		List<String> result = fizzBuzz.realFizzBuzz(1, 20);
		assertTrue(Arrays.equals(expected, result.toArray()));
	}
	
	@Test
	public void realFizzBuzzForRangeOfNumbers_OneToFouty() throws Exception {
		String[] expected = new String[] {"1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz",
				"11", "fizz", "13", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz", "fizz",
				"22", "23", "fizz", "buzz", "26", "fizz", "28", "29", "fizzbuzz", "31", "32",
				"fizz", "34", "buzz", "fizz", "37", "38", "fizz", "buzz"};
		
		List<String> result = fizzBuzz.realFizzBuzz(1, 40);
		assertTrue(Arrays.equals(expected, result.toArray()));
	}
	
	@Test
	public void realFizzBuzzForRangeOfNumbers_MinusFiveToTwenty() throws Exception {
		String[] expected = new String[] {"-5", "-4", "-3", "-2", "-1", "0", "1", "2", "fizz", 
				"4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", 
				"fizzbuzz", "16", "17", "fizz", "19", "buzz"};
		List<String> result = fizzBuzz.realFizzBuzz(-5, 20);
		assertTrue(Arrays.equals(expected, result.toArray()));
	}
}
