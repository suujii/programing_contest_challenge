/**
 * 이진수 구하기
 * ex ) 5 = 101
 *      8 = 1000
 */
package com.programing.contest.challenge.recursive;

/**
 * @author SuJi, Lee
 *
 */
public class TwoNumber {
	private StringBuffer sb = new StringBuffer();

	public String twoNumber(int n) {
		sb.append(n % 2);

		if (n == 1) {
			return sb.reverse().toString();
		}

		return twoNumber(n / 2);
	}
}
