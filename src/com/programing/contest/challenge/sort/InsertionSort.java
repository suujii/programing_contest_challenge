/**
* 삽입정렬
*/
package com.programing.contest.challenge.sort;

/**
 * @author SuJi, Lee
 *
 */
public class InsertionSort {
	private int[] data;
	private int n;

	public InsertionSort(int[] data, int n) {
		this.data = data;
		this.n = n;
	}

	public void sort() {
		for (int i = 1; i < n; i++) {
			int d = data[i];
			int aux = i - 1;

			while (aux >= 0 && d < data[aux]) {
				data[aux + 1] = data[aux];
				aux--;
			}
			data[aux + 1] = d;
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
