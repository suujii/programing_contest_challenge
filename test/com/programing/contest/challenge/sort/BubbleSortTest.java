package com.programing.contest.challenge.sort;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class BubbleSortTest {

	@Test
	public void test() {
		int[] data = {4, 1, 6, 9, 11, 3};
		int n = 6;
		BubbleSort b = new BubbleSort(data, n);
		b.sort();
		b.print();
	}

	@Test
	public void test2() {
		int[] data = {11, 10, 9, 8, 7, 6};
		int n = 6;
		BubbleSort b = new BubbleSort(data, n);
		b.sort();
		b.print();
	}

}
