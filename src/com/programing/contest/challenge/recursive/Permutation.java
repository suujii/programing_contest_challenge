/**
 * 순열
 */
package com.programing.contest.challenge.recursive;

import java.util.Arrays;

/**
 * @author SuJi, Lee
 *
 */
public class Permutation {
	public void permutation(int[] arr) {
		permutation(arr, 0);
	}

	public void permutation(int[] arr, int pivot) {
		if (pivot == arr.length) {
			Arrays.stream(arr).forEach(data -> System.out.print(data));
			System.out.println();
			return;
		}

		for (int i = pivot; i < arr.length; i++) {
			swap(arr, i, pivot);
			permutation(arr, pivot + 1);
			swap(arr, i, pivot);
		}
	}

	public void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static void combination(int[] arr, int index, int n, int r, int target) {
		if (r == 0)
			print(arr, index);
		else if (target == n)
			return;
		else {
			arr[index] = target;
			combination(arr, index + 1, n, r - 1, target + 1);
			combination(arr, index, n, r, target + 1);
		}
	}

	public static void print(int[] arr, int length) {
		for (int i = 0; i < length; i++)
			System.out.print(arr[i]);
		System.out.println("");
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		Permutation p = new Permutation();
		p.permutation(arr);

		int[] arr2 = new int[5];
		combination(arr2, 0, 5, 3, 0);

	}
}
