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

	@Test
	public void test2() {
		Prisoner p = new Prisoner(120);
		System.out.println(p.releasePrsonerCnt2());
	}

}
