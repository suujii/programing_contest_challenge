package com.programing.contest.challenge.search;

import java.util.Arrays;

/**
 * @author SuJi, Lee
 *
 */
public class Search {
	//n개의 숫자를 가진 배열이 있다. 반복적으로 나타나는 수 중 처음 나타나는 수가 제일 먼저 나오는 수를 찾는 알고리즘 제시
	//예) A={3,2,1,2,2,3} 에서 3
	public void printFirstRepeatNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					return;
				}
			}
		}
	}

	//n-1개의 숫자로 구성된 배열이 있다. 이 배열의 중복요소는 없다. 하나값이 배열에서 빠져있다. 빠져있는 정수 찾기
	//입력 : [1,2,4,6,3,7,8] 출력:5
	public void printRemoveData(int[] arr, int n) {
		Arrays.sort(arr);

		for (int i = 1; i <= n - 1; i++) {
			if (arr[i - 1] != i) {
				System.out.println(i);
				return;
			}
		}
	}

	public void printRemoveData2(int[] arr, int n) {
		int sum = 0;
		int oriSum = (n - 1) * (n) / 2;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(oriSum - sum);
	}

	//두번 반복요소 찾기 
	public void printTwoRepeatCnt(int[] arr, int n) {
		for (int i = 0; i < n + 2; i++) {
			for (int j = 0; j < n + 2; j++) {
				if (i != j && arr[i] == arr[j]) {
					System.out.println(arr[i]); // 4 2 4 2
				}
			}
		}
	}

	//n개의 요소를 가진 배열이 있다. 변수 K를 주면 합이 K가되는 두 요소 찾기- 이전문제와동일

	// 동일. 이 배열메서 A[i]^2+A[j]^2 = A[k]^2 성립하는 요소의 인덱스 i, j k 찾기
	//	public void powerOfNumber(int[] arr, int n) {
	//
	//	}

	// 요소들의 값으로 음수와 양수를 모두 가진 배열이 있다. 가장 합이 0에 가까운 두 요소 찾기
	public void sumZero(int[] arr, int n) {
		int min = Math.abs(arr[0] + arr[1]);
		int[] data = new int[2];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && Math.abs(arr[i] + arr[j]) < min) {
					min = Math.abs(arr[i] + arr[j]);
					data[0] = arr[i];
					data[1] = arr[j];
				}
			}
		}
		System.out.println(data[0] + ", " + data[1]);
	}

	//n개의 요소들을 가진 정렬 배열 A가 있다. 요소들은 중복되어 나타날 수 있다. 배열 내 주어진 수가 처음 나타나는 인덱스, 마지막 인덱스 찾기
	public int repeatCntMin(int[] arr, int low, int high, int data) {
		int mid = 0;
		if (high >= low) {
			mid = (low + high) / 2;
			if ((mid == low && arr[mid] == data) || (arr[mid] == data && arr[mid - 1] < data)) {
				return mid;
			}
			else if (arr[mid] >= data) {
				return repeatCntMin(arr, low, mid - 1, data);
			} else {
				return repeatCntMin(arr, mid + 1, high, data);
			}
		}
		return -1;

	}

	public int repeatCntMax(int[] arr, int low, int high, int data) {
		int mid = 0;
		if (high >= low) {
			mid = (low + high) / 2;
			if ((mid == high && arr[mid] == data) || (arr[mid] == data && arr[mid + 1] > data)) {
				return mid;
			}
			else if (arr[mid] >= data) {
				return repeatCntMax(arr, low, mid - 1, data);
			} else {
				return repeatCntMax(arr, mid + 1, high, data);
			}
		}
		return -1;

	}

	//n개의 요소들을 가진 정렬된 배열 A가 있다. 요소들은 중복되어 나타날 수 있다. 주어진 수가 배열 내 나타나는 횟수 찾기
	//n/2번보다 많이 나타나는 요소가 최다 요소이다. n개의 요소들을 가진 배열을 받아 '최대요소' 찾는 알고리즘 제시
	//짝수와 홀수 분리하기
	public void addEvenNumber(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			while (arr[left] % 2 == 0 && left < right) {
				left++;
			}

			while (arr[left] % 2 != 0 && left < right) {
				right--;
			}

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right++;
			}
		}

	}
	//배열에 무작위 순으로 0과 1로 구성되어있을때, 0과 1을 배열의 왼쪽 오른쪽으로 분리하는 방법

	//0,1 그리고 2로 이루어진 배열 A[]가 있을때 A[]를 정렬하는 알고리즘. 
	//정수 N이 주어졌을때 N!내에서 0으로 끝나는 수를 찾는 알고리즘.
	//주어진 배열 A[]에서 A[j] > A[i]를 만족하는 j-i 의 최대값 찾기.

}
