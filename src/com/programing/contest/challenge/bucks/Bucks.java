/**
 * 아이스벅스 문제.
 * 여름음료 5잔을 포함하여 12잔 이상을 구매하면 텀블러 한개 증정!
 * 최대 받을 수 있는 텀블러 갯수 구하기
 * 
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
		return Math.min(summberCnt / 5, (summberCnt + generalCnt) / 12);
	}
}
