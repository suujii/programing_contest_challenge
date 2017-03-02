/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.bucks;

/**
 * @author SuJi, Lee
 *
 */
public class Bucks {
	private int summberCnt;
	private int generalCnt;

	public Bucks(int summberCnt, int generalCnt) {
		this.summberCnt = summberCnt;
		this.generalCnt = generalCnt;
	}

	public int printMaxTumblr() {
		int divide1 = summberCnt / 5;
		int divide2 = generalCnt - (divide1 * 7) >= 0 ? 0 : 1;

		return divide1 - divide2 >= 0 ? divide1 - divide2 : 0;
	}
}
