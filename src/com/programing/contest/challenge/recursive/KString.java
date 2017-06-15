/**
 * 0..k-1 에서 도출된 길이 n의 모든 문자열을 생성하세요
 * k는 문자의 개수
 * n은 문자열의 길이
 */
package com.programing.contest.challenge.recursive;

import java.util.Arrays;

/**
 * @author SuJi, Lee
 *
 */
public class KString {
	public static void main(String[] args) {
		KString k = new KString(10, 2);
		k.kString(10, 2);
	}

	private int[] array;

	public KString(int n, int k) {
		this.array = new int[n];
	}

	public void kString(int n, int k) {
		if (n < 1) {
			Arrays.stream(array).forEach(d -> {
				System.out.print(d + " ");
			});
		} else {
			for (int i = 0; i < k; i++) {
				array[n - 1] = i;
				kString(n - 1, k);
			}
		}
	}
}
