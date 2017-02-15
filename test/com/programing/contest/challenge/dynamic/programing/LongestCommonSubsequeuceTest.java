/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.dynamic.programing;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class LongestCommonSubsequeuceTest {
	@Test
	public void test() {
		int n = 4;
		int m = 4;
		String s = "abcd";
		String t = "becd";
		LongestCommonSubsequeuce l = new LongestCommonSubsequeuce(n, m, s, t);
		l.printLongestCommonSubsequeuce();
	}

	@Test
	public void test2() {
		int n = 8;
		int m = 7;
		String s = "abcdabcd";
		String t = "efcdagh";
		LongestCommonSubsequeuce l = new LongestCommonSubsequeuce(n, m, s, t);
		l.printLongestCommonSubsequeuce();
	}

	@Test
	public void test3() {
		int n = 5;
		int m = 5;
		String s = "cdegt";
		String t = "cdabe";
		LongestCommonSubsequeuce l = new LongestCommonSubsequeuce(n, m, s, t);
		l.printLongestCommonSubsequeuce();
	}

	@Test
	public void test4() {
		int n = 8;
		int m = 7;
		String s = "abcdabcd";
		String t = "bfcdagh";
		LongestCommonSubsequeuce l = new LongestCommonSubsequeuce(n, m, s, t);
		l.printLongestCommonSubsequeuce();
	}

	@Test
	public void test5() {
		int n = 4;
		int m = 4;
		String s = "acdb";
		String t = "babc";
		LongestCommonSubsequeuce l = new LongestCommonSubsequeuce(n, m, s, t);
		l.printLongestCommonSubsequeuce();
	}

	@Test
	public void test6() {
		int n = 4;
		int m = 3;
		String s = "abcd";
		String t = "bca";
		LongestCommonSubsequeuce l = new LongestCommonSubsequeuce(n, m, s, t);
		l.printLongestCommonSubsequeuce();
	}
}
