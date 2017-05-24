package com.programing.contest.challenge.sort;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class MergeSortTest {
	//	@Test
	//	public void test() {
	//		int[] data = {4, 1, 6, 9, 11, 3};
	//		int n = 6;
	//		MergeSort s = new MergeSort(data, n);
	//		s.sort();
	//		s.print();
	//	}
	//
	//	@Test
	//	public void test2() {
	//		int[] data = {11, 10, 9, 8, 7, 6};
	//		int n = 6;
	//		MergeSort s = new MergeSort(data, n);
	//		s.sort();
	//		s.print();
	//	}

	@Test
	public void test3() {
		Integer[] datas = {5, 4, 3, 2, 1};
		MergeSort s = new MergeSort();
		s.merge(Arrays.asList(datas)).stream().forEach(item -> System.out.print(item + " "));

	}

}
