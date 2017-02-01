/**
 * 승 계산하기
 * ex ) 2^3 = 8
 *      2^10 = 1024
 *      3^2 = 9
 */
package com.programing.contest.challenge.recursive;

/**
 * @author SuJi, Lee
 *
 */
public class NpowerOfM {
	public int nPowerOfM(int n, int m) {
		if (m == 0) {
			return 1;
		}
		return n * nPowerOfM(n, m - 1);
	}

}
