package com.programing.contest.challenge.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class MergeSort {
	public List<Integer> merge(List<Integer> list) { //분할작업
		if (list.size() < 2) {
			return list;
		}

		List<Integer> left = list.subList(0, list.size() / 2);
		List<Integer> right = list.subList(list.size() / 2, list.size());
		return mergeSort(merge(left), merge(right));
	}

	private List<Integer> mergeSort(List<Integer> left, List<Integer> right) { //합질때 소팅하여 합치기
		int leftPtr = 0;
		int rightPtr = 0;
		List<Integer> merge = new ArrayList<Integer>(left.size() + right.size());

		while (leftPtr < left.size() && rightPtr < right.size()) {
			if (left.get(leftPtr) < right.get(rightPtr)) {
				merge.add(left.get(leftPtr));
				leftPtr++;
			} else {
				merge.add(right.get(rightPtr));
				rightPtr++;
			}
		}

		while (leftPtr < left.size()) { //남은 것 넣기
			merge.add(left.get(leftPtr));
			leftPtr++;
		}

		while (rightPtr < right.size()) {
			merge.add(right.get(rightPtr));
			rightPtr++;
		}

		return merge;
	}

	//	private int[] data;
	//	private int n;
	//
	//	public MergeSort(int[] data, int n) {
	//		this.data = data;
	//		this.n = n;
	//	}
	//
	//	public void sort() {
	//		mergeSort(0, n - 1);
	//	}
	//
	//	private void mergeSort(int left, int right) {
	//		int middle;
	//		if (left < right) {
	//			middle = (left + right) / 2;
	//			mergeSort(left, middle);
	//			mergeSort(middle + 1, right);
	//			merge(left, middle, right);
	//		}
	//	}
	//
	//	private void merge(int left, int middle, int right) {
	//		int i, j, k, t;
	//		int[] sorted = new int[n];
	//
	//		i = left;
	//		j = middle + 1;
	//		k = left;
	//
	//		while (i <= middle && j <= n) {
	//			if (data[i] <= data[j])
	//				sorted[k] = data[i++];
	//			else
	//				sorted[k] = data[j++];
	//			k++;
	//		}
	//
	//		if (i > middle) {
	//			for (t = j; t <= n; t++, k++)
	//				sorted[k] = data[t];
	//
	//		} else {
	//			for (t = i; t <= middle; t++, k++)
	//				sorted[k] = data[t];
	//		}
	//
	//		for (t = left; t <= n; t++)
	//			data[t] = sorted[t];
	//
	//	}
	//
	//	public void print() {
	//		for (int i = 0; i < n; i++) {
	//			System.out.print(data[i] + " ");
	//		}
	//		System.out.println();
	//	}

	//	public int[] getData() {
	//		return data;
	//	}
	//
	//	public void setData(int[] data) {
	//		this.data = data;
	//	}
	//
	//	public int getN() {
	//		return n;
	//	}
	//
	//	public void setN(int n) {
	//		this.n = n;
	//	}
}
