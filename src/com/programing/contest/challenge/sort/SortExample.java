/**
 * 정렬 관련 문제
 */
package com.programing.contest.challenge.sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author SuJi, Lee
 *
 */
public class SortExample {
	public static class RepeatNumber {
		//반복 숫자 여부 확인 O(n^2)
		public static boolean isRepeat1(int[] arr) {
			if (arr == null || arr.length == 0) {
				return false;
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						return true;
					}
				}
			}

			return false;
		}

		//반복 숫자 여부 확인 O(n) : 내부 정렬 제외
		public static boolean isRepeat2(int[] arr) {
			if (arr == null || arr.length == 0) {
				return false;
			}

			Arrays.sort(arr);

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == arr[i + 1]) {
					return true;
				}
			}

			return false;
		}

		public static Map<Integer, Integer> repeatNumberPerCnt(int[] arr) {
			Map<Integer, Integer> result = new HashMap<Integer, Integer>();

			if (arr == null || arr.length == 0) {
				return result;
			}

			Arrays.sort(arr);

			for (int i = 0; i < arr.length; i++) {
				if (result.containsKey(arr[i])) {
					result.put(arr[i], result.get(arr[i]) + 1);
				} else {
					result.put(arr[i], 1);
				}
			}

			return result;
		}

		//당선자 결정
		public static int checkWhoWins(int[] arr) {
			if (arr == null || arr.length == 0) {
				return 0;
			}

			int maxCnt = 0;
			int candidate = 0;
			for (int i = 0; i < arr.length; i++) {
				int cnt = 0;

				for (int j = i; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						cnt++;
					}
				}

				if (maxCnt < cnt) {
					maxCnt = cnt;
					candidate = arr[i];
				}
			}

			return candidate;
		}

		//배열에서 최대 빈도 요소 찾기 문제와도 유사
		public static int checkWhoWins2(int[] arr) {
			if (arr == null || arr.length == 0) {
				return 0;
			}

			Arrays.sort(arr);

			int candidate = 0;
			int maxCnt = 0;
			int cnt = 1;

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == arr[i + 1]) {
					cnt++;
				} else {
					cnt = 1;
				}

				if (maxCnt < cnt) {
					maxCnt = cnt;
					candidate = arr[i];
				}
			}

			return candidate;
		}

		//a+b = K를 만족하는 요소 찾기.(단 배열의 길이는 같다)
		public static boolean existNumber(int[] arr1, int[] arr2, int n, int K) {
			Arrays.sort(arr1);

			for (int i = 0; i < n; i++) {
				int findData = K - arr2[i];
				if (binarySearch(arr1, 0, n, findData)) {
					return true;
				}
			}
			return false;
		}

		private static boolean binarySearch(int[] arr, int low, int high, int findData) {
			int mid = (low + high) / 2;
			//			int mid = low + (high - low) / 2; 오버플로우 방지

			if (arr[mid] == findData) {
				return true;
			}

			if (arr[mid] > findData) {
				return binarySearch(arr, low, mid - 1, findData);
			} else {
				return binarySearch(arr, mid + 1, high, findData);
			}
		}
	}

}
