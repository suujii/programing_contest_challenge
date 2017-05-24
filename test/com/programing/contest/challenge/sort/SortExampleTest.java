package com.programing.contest.challenge.sort;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import com.programing.contest.challenge.sort.SortExample.RepeatNumber;

/**
 * @author SuJi, Lee
 *
 */
public class SortExampleTest {

	@Test
	public void test() {
		int[] arr = {3, 3, 4, 1, 2};
		System.out.println(RepeatNumber.isRepeat1(arr));
	}

	@Test
	public void test2() {
		int[] arr = {3, 3, 4, 1, 2};
		System.out.println(RepeatNumber.isRepeat2(arr));
	}

	@Test
	public void test3() {
		int[] arr = {2, 3, 4, 1, 5};
		System.out.println(RepeatNumber.isRepeat1(arr));
	}

	@Test
	public void test4() {
		int[] arr = {2, 3, 4, 1, 5};
		System.out.println(RepeatNumber.isRepeat2(arr));
	}

	@Test
	public void test5() {
		int[] arr = {4, 2, 4, 5, 5};
		Map<Integer, Integer> result = RepeatNumber.repeatNumberPerCnt(arr);

		result.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});

		Set<Entry<Integer, Integer>> entries = result.entrySet();

		for (Entry<Integer, Integer> entry : entries) {
			if (entry.getValue() != 1) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
	}

	@Test
	public void test6() {
		int[] arr = {3, 3, 2, 1, 1, 7, 5, 2, 3};
		System.out.println(RepeatNumber.checkWhoWins(arr));
		System.out.println(RepeatNumber.checkWhoWins2(arr));
	}

	@Test
	public void test7() {
		int[] arr1 = {1, 3, 4};
		int[] arr2 = {2, 2, 5};

		System.out.println(RepeatNumber.existNumber(arr1, arr2, 3, 6));

	}

}
