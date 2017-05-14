package com.programing.contest.challenge.sort;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class InsertionSortTest {

	@Test
	public void test() {
		int[] data = {4, 1, 6, 9, 11, 3};
		int n = 6;
		InsertionSort s = new InsertionSort(data, n);
		s.sort();
		s.print();
	}

	@Test
	public void test2() {
		int[] data = {11, 10, 9, 8, 7, 6};
		int n = 6;
		InsertionSort s = new InsertionSort(data, n);
		s.sort();
		s.print();
	}

}
