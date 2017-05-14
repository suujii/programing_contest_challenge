/**
* 퀵정렬
* + : 빠르다
* - : 안전성이 낮다
* 최악 : 이미 정렬된 경우 O(n^2)
* 복잡도 : 평균 O(nlogn)
*/
package com.programing.contest.challenge.sort;

/**
 * @author SuJi, Lee
 *
 */
public class QuickSort {
	private int[] data;
	private int n;

	public QuickSort(int[] data, int n) {
		this.data = data;
		this.n = n;
	}

	public void sort() {
		sort(0, n - 1);
	}

	private void sort(int left, int right) {
		if (left < right) {
			int index = partition(left, right);
			sort(left, index - 1);
			sort(index + 1, right);
		}
	}

	private int partition(int left, int right) {
		int pivot = data[(left + right) / 2];
		while (left < right) {
			while ((data[left] < pivot) && (left < right)) {
				left++;
			}

			while ((data[right] > pivot) && (left < right)) {
				right--;
			}

			if (left < right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
			}
		}

		return left;
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
