/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.stack;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class PalindromeUseStackTest {
	@Test
	public void testError() {
		String word = "";
		PalindromeUseStack p = new PalindromeUseStack(word);
		assertFalse(p.isPalindrome());
	}

	@Test
	public void testError2() {
		String word = "abab";
		PalindromeUseStack p = new PalindromeUseStack(word);
		assertFalse(p.isPalindrome());
	}

	@Test
	public void testError3() {
		String word = "abXXab";
		PalindromeUseStack p = new PalindromeUseStack(word);
		assertFalse(p.isPalindrome());
	}

	@Test
	public void test() {
		String word = "abababaXabababa";
		PalindromeUseStack p = new PalindromeUseStack(word);
		assertTrue(p.isPalindrome());
	}

	@Test
	public void test2() {
		String word = "abAXAba";
		PalindromeUseStack p = new PalindromeUseStack(word);
		assertTrue(p.isPalindrome());
	}

	@Test
	public void test3() {
		String word = "abaXAba";
		PalindromeUseStack p = new PalindromeUseStack(word);
		assertFalse(p.isPalindrome());
	}

}
