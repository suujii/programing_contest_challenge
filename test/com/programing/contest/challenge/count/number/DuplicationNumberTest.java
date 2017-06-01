package com.programing.contest.challenge.count.number;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuplicationNumberTest {

	@Test
	public void testCheckDuplicationNumber() {
		DuplicationNumber d = new DuplicationNumber();
		assertTrue(d.checkDuplicationNumber("0123456789"));
	}

	@Test
	public void testCheckDuplicationNumber2() {
		DuplicationNumber d = new DuplicationNumber();
		assertFalse(d.checkDuplicationNumber("01234"));
	}

	@Test
	public void testCheckDuplicationNumber3() {
		DuplicationNumber d = new DuplicationNumber();
		assertFalse(d.checkDuplicationNumber("01234567890"));
	}

	@Test
	public void testCheckDuplicationNumber4() {
		DuplicationNumber d = new DuplicationNumber();
		assertTrue(d.checkDuplicationNumber("6789012345"));
	}

	@Test
	public void testCheckDuplicationNumber5() {
		DuplicationNumber d = new DuplicationNumber();
		assertFalse(d.checkDuplicationNumber("012322456789"));
	}

	@Test
	public void testCheckDuplicationNumber6() {
		DuplicationNumber d = new DuplicationNumber();
		assertTrue(d.checkDuplicationNumber2("0123456789"));
	}

	@Test
	public void testCheckDuplicationNumber7() {
		DuplicationNumber d = new DuplicationNumber();
		assertFalse(d.checkDuplicationNumber2("01234"));
	}

	@Test
	public void testCheckDuplicationNumber8() {
		DuplicationNumber d = new DuplicationNumber();
		assertFalse(d.checkDuplicationNumber2("01234567890"));
	}

	@Test
	public void testCheckDuplicationNumber9() {
		DuplicationNumber d = new DuplicationNumber();
		assertTrue(d.checkDuplicationNumber2("6789012345"));
	}

	@Test
	public void testCheckDuplicationNumber10() {
		DuplicationNumber d = new DuplicationNumber();
		assertFalse(d.checkDuplicationNumber2("012322456789"));
	}

	@Test
	public void testCheckDuplicationNumber11() {
		DuplicationNumber d = new DuplicationNumber();
		assertTrue(d.checkDuplicationNumber3("0123456789"));
	}

	@Test
	public void testCheckDuplicationNumber12() {
		DuplicationNumber d = new DuplicationNumber();
		assertFalse(d.checkDuplicationNumber3("01234"));
	}

	@Test
	public void testCheckDuplicationNumber13() {
		DuplicationNumber d = new DuplicationNumber();
		assertFalse(d.checkDuplicationNumber3("01234567890"));
	}

	@Test
	public void testCheckDuplicationNumber14() {
		DuplicationNumber d = new DuplicationNumber();
		assertTrue(d.checkDuplicationNumber3("6789012345"));
	}

	@Test
	public void testCheckDuplicationNumber15() {
		DuplicationNumber d = new DuplicationNumber();
		assertFalse(d.checkDuplicationNumber3("012322456789"));
	}
}
