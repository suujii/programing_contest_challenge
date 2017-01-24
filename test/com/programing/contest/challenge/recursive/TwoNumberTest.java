/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.recursive;

import java.util.List;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class TwoNumberTest {

	@Test
	public void test() {
		TwoNumber t = new TwoNumber();
		List<Integer> resultList = t.twoNumber(8);

		for (int i = resultList.size() - 1; i >= 0; i--) {
			System.out.print(resultList.get(i));
		}
		System.out.println();
	}

	@Test
	public void test2() {
		TwoNumber t = new TwoNumber();
		List<Integer> resultList = t.twoNumber(5);

		for (int i = resultList.size() - 1; i >= 0; i--) {
			System.out.print(resultList.get(i));
		}
		System.out.println();
	}

}
