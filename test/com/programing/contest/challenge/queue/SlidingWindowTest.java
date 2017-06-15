/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.queue;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class SlidingWindowTest {

	@Test
	public void testSlidingWindow() {
		int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
		SlidingWindow s = new SlidingWindow(arr, 3);
		s.slidingWindow();
	}

}
