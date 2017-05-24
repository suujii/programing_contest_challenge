package com.programing.contest.challenge.sort;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class QuickSortTest {
	@Test
	public void test() {
		int[] data = {4, 1, 6, 9, 11, 3};
		int n = 6;
		QuickSort s = new QuickSort(data, n);
		s.sort();
		s.print();
	}

	@Test
	public void test2() {
		int[] data = {11, 10, 9, 8, 7, 6};
		int n = 6;
		QuickSort s = new QuickSort(data, n);
		s.sort();
		s.print();

		Integer[] datas = {5, 4, 3, 2, 1};
		List<Integer> list = Arrays.asList(datas);
		s.quickSort(list).stream().forEach(item -> System.out.print(item + " "));
	}
}
