package com.equalexperts.fb;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

	public String fizzForMultipleOfThree(String number) {
		if (!isPositiveNumber(number)) {
			return number;
		}
		
		int num = Integer.parseInt(number);
		
		if (num == 0) {
			return number;
		}
		
		if (num % 3 == 0) {
			return "fizz";
		}
		
		return number;
	}

	public String buzzForMultipleOfFive(String number) {
		if (!isPositiveNumber(number)) {
			return number;
		}
		
		int num = Integer.parseInt(number);
		
		if (num == 0) {
			return number;
		}
		
		if (num % 5 == 0) {
			return "buzz";
		}
		
		return number;
	}

	private boolean isPositiveNumber(String number) {
		char[] charArray = number.toCharArray();
		for (char c : charArray) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	public String fizzBuzzForMultipleOfFifteen(int num) {
		String number = String.valueOf(num);
		if (!isPositiveNumber(number)) {
			return number;
		}
		
		if (num == 0) {
			return number;
		}
		
		if (num % 15 == 0) {
			return "fizzbuzz";
		}
		
		return number;
	}

	public List<String> realFizzBuzz(int start, int end) {
		return IntStream.range(start, end + 1)
				.mapToObj(this::fizzBuzzForMultipleOfFifteen)
				.map(this::buzzForMultipleOfFive)
				.map(this::fizzForMultipleOfThree)
				.collect(Collectors.toList());		
	}

}
