package com.programing.contest.challenge.printing;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class FizzBuzzTest {

	@Test
	public void testFizzBuzz() {
		FizzBuzz.fizzBuzz(100);
	}

	@Test
	public void testFizzBuzz2() {
		FizzBuzz.fizzBuzz2(100).stream().forEach(data -> System.out.println(data));
	}
}
