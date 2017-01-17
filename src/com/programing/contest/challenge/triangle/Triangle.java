/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.triangle;

import java.util.Arrays;

/**
 * @author SuJi, Lee
 *
 */
public class Triangle {
	private int num;
	private int[] bong;

	public Triangle(int num, int[] bong) {
		this.num = num;
		this.bong = bong;
		Arrays.sort(bong);
	}

	public int maxGirth() {
		int max = 0;

		if (num < 3 || num > 100) {
			throw new IllegalArgumentException("n is invalid. Input scope is 3 <= n <=100");
		}

		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				for (int k = j + 1; k < num; k++) {
					if (bong[i] + bong[j] > bong[k]) {
						int girth = bong[i] + bong[j] + bong[k];

						if (max < girth) {
							max = girth;
						}
					}
				}
			}
		}

		return max;
	}

	public void printMaxGirth() {
		System.out.println(maxGirth());
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int[] getBong() {
		return bong;
	}

	public void setBong(int[] bong) {
		this.bong = bong;
	}
}
