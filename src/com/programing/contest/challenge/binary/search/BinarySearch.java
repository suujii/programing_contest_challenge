/**
 * 이진검색
 */
package com.programing.contest.challenge.binary.search;

/**
 * @author SuJi, Lee
 *
 */
public class BinarySearch {
	public int binarySearch(int[] arr, int n, int data) {
		int low = 0;
		int high = n - 1;
		int mid = 0;
		while (low <= high) {
			//			mid = low + (high-low) 오버플로우 방지
			mid = (low + high) / 2;

			if (arr[mid] == data) {
				return mid;
			} else if (arr[mid] < data) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		return -1;
	}

	public int binarySearch2(int[] arr, int low, int high, int data) {
		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;

		if (arr[mid] == data) {
			return mid;
		} else if (arr[mid] > data) {
			return binarySearch2(arr, low, mid - 1, data);
		} else {
			return binarySearch2(arr, mid + 1, high, data);
		}
	}

	public static void main(String[] args) {
		BinarySearch b = new BinarySearch();
		int[] arr = {1, 2, 3, 4};
		System.out.println(b.binarySearch(arr, 4, 2));
		System.out.println(b.binarySearch(arr, 4, 5));
		System.out.println(b.binarySearch2(arr, 0, 3, 4));
		System.out.println(b.binarySearch2(arr, 0, 3, 5));
	}

}
