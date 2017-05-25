/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.prisoner;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class PrisonerTest {

	@Test
	public void test() {
		Prisoner p = new Prisoner(120);
		System.out.println(p.releasePrsonerCnt());
	}

}
