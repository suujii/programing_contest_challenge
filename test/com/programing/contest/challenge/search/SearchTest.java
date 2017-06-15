/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.search;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class SearchTest {

	@Test
	public void test() {
		Search s = new Search();
		int[] arr = {3, 2, 1, 2, 2, 3};
		s.printFirstRepeatNumber(arr);

		int[] arr2 = {1, 2, 4, 6, 3, 7, 8};
		s.printRemoveData(arr2, 9);
		s.printRemoveData2(arr2, 9);

		int[] arr3 = {4, 2, 4, 5, 2, 3, 1};
		s.printTwoRepeatCnt(arr3, 5);
	}

	@Test
	public void test2() {
		Search s = new Search();
		int[] arr3 = {4, 2, 4, 5, 2, 3, 1};
		s.printTwoRepeatCnt(arr3, 5);
	}

	@Test
	public void test3() {
		Search s = new Search();
		int[] arr3 = {3, 4, 5, 1, 2};
		s.printTwoRepeatCnt(arr3, 5);
	}

	@Test
	public void test4() {
		Search s = new Search();
		int[] arr3 = {1, 60, -10, 70, -80, 85};
		s.sumZero(arr3, 6);
	}

	@Test
	public void test5() {
		Search s = new Search();
		int[] arr3 = {1, 1, 2, 2, 4};
		System.out.println(s.repeatCntMin(arr3, 0, 5, 2));
	}

	@Test
	public void test6() {
		Search s = new Search();
		int[] arr3 = {1, 1, 2, 2, 4};
		System.out.println(s.repeatCntMax(arr3, 0, 5, 2));
	}

	@Test
	public void test7() {
		Search s = new Search();
		int[] arr3 = {12, 34, 45, 9, 8, 90, 3};
		s.addEvenNumber(arr3);
	}
}
