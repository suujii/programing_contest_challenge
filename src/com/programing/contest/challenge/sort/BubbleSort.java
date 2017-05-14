/**
 * 버블정렬
 * + : 구현이 쉽다. 이미 정렬된 데이터를 정렬할 때 가장 빠름, 정밀비교 가능
 * - : 정렬 속도가 느리다. 역순배열 정렬시 가장 느림.
 * 최적 : 이미 정렬된 경우
 * 최악 : 역순 배열 정렬
 * 복잡도 : O(n^2)
 */
package com.programing.contest.challenge.sort;

/**
 * @author SuJi, Lee
 *
 */
public class BubbleSort {
	private int[] data;
	private int n;

	public BubbleSort(int[] data, int n) {
		this.data = data;
		this.n = n;
	}

	public void sort() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}

	public void print() {
		for (int i = 0; i < n; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}
