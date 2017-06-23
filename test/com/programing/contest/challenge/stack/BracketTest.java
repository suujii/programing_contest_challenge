package com.programing.contest.challenge.stack;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class BracketTest {

	@Test
	public void testIsRight() {
		Bracket b = new Bracket();
		assertFalse(b.isRight("(())())"));
		assertFalse(b.isRight("(((()())()"));
		assertTrue(b.isRight("(()())((()))"));
		assertFalse(b.isRight("((()()(()))(((())))()"));
		assertTrue(b.isRight("()()()()(()()())()"));
		assertFalse(b.isRight("(()((())()("));
		assertTrue(b.isRight("({})"));
		assertFalse(b.isRight("({}})"));
	}

}
