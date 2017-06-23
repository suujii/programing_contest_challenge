/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.recursive;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class FibonachiTest {

	@Test
	public void testFibonachi() {
		Fibonachi f = new Fibonachi();
		f.fibonachi(10).stream().forEach(data -> System.out.print(data + " "));
		System.out.println();
		System.out.println(f.fibonachi2(5));
	}

}
