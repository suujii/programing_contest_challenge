package com.programing.contest.challenge.replace;

import org.junit.Test;

public class CamelCaseChangeTest {

	@Test
	public void test() {
		CamelCaseChange c = new CamelCaseChange();
		System.out.println(c.change("codingDojang"));
	}

	@Test
	public void test2() {
		CamelCaseChange c = new CamelCaseChange();
		System.out.println(c.change("numGoat30"));
	}

	@Test
	public void test3() {
		CamelCaseChange c = new CamelCaseChange();
		System.out.println(c.change2("codingDojang"));
	}

	@Test
	public void test4() {
		CamelCaseChange c = new CamelCaseChange();
		System.out.println(c.change2("numGoat30"));
	}

}
