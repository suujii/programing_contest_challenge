/**
 * 선택정렬
 * + : 데이터 양이 적을 때 좋은 성능
 *     작은 값을 선택하기 위해서 비교는 여러번 수행되지만, 교환 횟수가 적음
 * - : 100개 이상의 자료에 대해서는 속도가 급격히 떨여져 사용되기 힘듬
 * 최적 : 역순 배열 정렬
 * 최악 : 이미 정렬된 경우
 * 복잡도 : O(n^2)
 */
package com.programing.contest.challenge.sort;

/**
 * @author SuJi, Lee
 *
 */
public class SelectionSort {
	private int[] data;
	private int n;

	public SelectionSort(int[] data, int n) {
		this.data = data;
		this.n = n;
	}

	public void sort() {
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (data[min] > data[j]) {
					min = j;
				}
			}

			int temp = data[min];
			data[min] = data[i];
			data[i] = temp;
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
