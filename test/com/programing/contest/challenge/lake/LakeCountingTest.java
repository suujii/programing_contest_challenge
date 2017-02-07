/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.lake;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class LakeCountingTest {
	@Test
	public void test() {
		int n = 10;
		int m = 12;
		char[][] lakes = new char[n][m];
		int[][] indexs = { {0, 9, 10}, {1, 2, 3, 9, 10, 11}, {4, 5, 9, 10}, {9, 10}, {9}, {2, 9}, {1, 3, 9, 10}, {0, 2, 4, 10}, {1, 3, 10}, {2, 10}};

		makeLakes(n, m, lakes, indexs);
		printLakes(n, m, lakes);

		LakeCounting lake = new LakeCounting(10, 12, lakes);
		lake.printLakeCounting();
	}

	private void makeLakes(int n, int m, char[][] lakes, int[][] indexs) {
		for (int row = 0; row < n; row++) {
			int index = 0;
			for (int col = 0; col < m; col++) {
				if (indexs[row].length > index && col == indexs[row][index]) {
					lakes[row][col] = 'W';
					index++;
				} else {
					lakes[row][col] = '.';
				}
			}
		}
	}

	public void printLakes(int n, int m, char[][] lakes) {
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < m; col++) {
				System.out.print(lakes[row][col]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
