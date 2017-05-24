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
public class HanoiTest {

	@Test
	public void test() {
		Hanoi hanoi = new Hanoi(3);
		hanoi.executeHanoi();
	}

}
