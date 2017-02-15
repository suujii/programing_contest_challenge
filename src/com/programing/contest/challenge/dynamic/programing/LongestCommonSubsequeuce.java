/**
* 문자열 S1, S2 .... Sn 과 T1, T2 ... Tm 이 주어져 있다. 이 둘의 공통 부분 문자열의 길이의 최대 값을 구하여라.
* 단 문자열 S1 S2 ... Sn의 문자열이란 Si1, Si2 ... Sim(i1 < i2 < .... im)로 표현 가능한 문자열을 말한다.
*
* 1 <= n,m <= 1000
*
* 입력
* n = 4
* m = 4
* s = "abcd"
* t = "becd"
* 
* 출력
* 3("bcd")
*/
package com.programing.contest.challenge.dynamic.programing;

/**
 * @author SuJi, Lee
 *
 */
public class LongestCommonSubsequeuce {
	private int n;
	private int m;
	private String s;
	private String t;
	private int[][] commons;

	//	private int max;
	//	private int cnt;

	public LongestCommonSubsequeuce(int n, int m, String s, String t) {
		if (s == null || t == null) {
			throw new IllegalArgumentException("param is null");
		}

		if (n != s.length() || m != t.length()) {
			throw new IllegalArgumentException("param length is different");
		}

		this.n = n;
		this.m = m;
		this.s = s;
		this.t = t;
		this.commons = new int[n][m];
		//		this.max = 0;
		//		this.cnt = 0;
	}

	public void printLongestCommonSubsequeuce() {
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				int sIndex = Math.max(i - 1, 0);
				int tindex = Math.max(j - 1, 0);

				if (s.charAt(i) == t.charAt(j)) {
					commons[i][j] = commons[sIndex][tindex] + 1;
				} else {
					commons[i][j] = Math.max(commons[sIndex][j], commons[i][tindex]);
				}
			}
		}

		//		for (int k = 0; k < n; k++) {
		//			for (int q = 0; q < m; q++) {
		//				System.out.print(commons[k][q]);
		//			}
		//			System.out.println();
		//		}
		System.out.println(commons[i - 1][j - 1]);
	}

	//	public void printLongestCommonSubsequeuce() {
	//		printLongestCommonSubsequeuce(s, t, 0, 0);
	//			printLongestCommonSubsequeuce(0, 0, 0);
	//		int max = 0;
	//		for (int i = 0; i < n; i++) {
	//			max = Math.max(printLongestCommonSubsequeuce(i, 0, 0), max);
	//		}
	//		System.out.println(max);
	//	}

	//	public void printLongestCommonSubsequeuce(String s, String t, int sIndex, int tIndex) {
	//		if (t.equals("")) {
	//			return;
	//		}
	//
	//		for (int i = sIndex; i < s.length(); i++) {
	//			for (int j = tIndex; j < t.length(); j++) {
	//
	//				if (s.charAt(i) != t.charAt(j)) {
	//					printLongestCommonSubsequeuce(s, t.substring(j + 1), i, j + 1);
	//				} else {
	//					cnt++;
	//					printLongestCommonSubsequeuce(s.substring(j + 1), t.substring(j + 1), sIndex + i, tIndex + j);
	//				}
	//			}
	//		}
	//	}

	//	public int printLongestCommonSubsequeuce(int startIndex, int index, int cnt) {
	//		if (startIndex == n) {
	//			return cnt;
	//		}
	//
	//		for (int j = index; j < m; j++) {
	//			if (s.charAt(startIndex) == t.charAt(j)) {
	//				cnt++;
	//				index = j + 1;
	//				printLongestCommonSubsequeuce(++startIndex, index, cnt);
	//			}
	//		}
	//
	//		return cnt;
	//	}

	//	public void printLongestCommonSubsequeuce(int startIndex, int cnt, int targetIndex) {
	//		if (targetIndex == n - 1) {
	//			System.out.println(max);
	//		}
	//
	//		for (int i = startIndex; i < n; i++) {
	//			for (int j = 0; j < m; j++) {
	//				if (s.charAt(i) == t.charAt(j)) {
	//					cnt++;
	//					printLongestCommonSubsequeuce(++i, cnt, targetIndex);
	//				}
	//			}
	//			max = Math.max(cnt, max);
	//			targetIndex++;
	//			startIndex = targetIndex;
	//		}
	//	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public int[][] getCommons() {
		return commons;
	}

	public void setCommons(int[][] commons) {
		this.commons = commons;
	}
}
