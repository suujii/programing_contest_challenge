package com.programing.contest.challenge.sort;

import org.junit.Test;

public class SpecialSortTest {

	@Test
	public void testSort() {
		SpecialSort s = new SpecialSort();
		int[] arr = {-1, 1, 3, -2, 2};

		for (int data : s.sort(arr)) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

	@Test
	public void testSort2() {
		SpecialSort s = new SpecialSort();
		int[] arr = {-1, 1, 3, -2, 2};

		for (int data : s.sort2(arr)) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

	@Test
	public void testSort3() {
		SpecialSort s = new SpecialSort();
		int[] arr = {1, -2, 6, -1, -5};

		for (int data : s.sort(arr)) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

	@Test
	public void testSort4() {
		SpecialSort s = new SpecialSort();
		int[] arr = {1, -2, 6, -1, -5};

		for (int data : s.sort2(arr)) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
}
