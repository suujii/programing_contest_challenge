package com.programing.contest.challenge.bomb.game;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class BombGameTest {

	@Test
	public void test() {
		String[][] arr = { {"*", ".", ".", "."}, {".", ".", ".", "."}, {".", "*", ".", "."}, {".", ".", ".", "."}};
		BombGame g = new BombGame(arr, 4, 4);
		g.print();
	}

	@Test
	public void test2() {
		System.out.println();
		String[][] arr = { {"*", "*", ".", ".", "."}, {".", ".", ".", ".", "."}, {".", "*", ".", ".", "."}};
		BombGame g = new BombGame(arr, 3, 5);
		g.print();
	}

}
