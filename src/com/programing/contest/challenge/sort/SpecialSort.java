/**
 * 구글 전화면접 문제
   n개의 정수를 가진 배열이 있다. 이 배열은 양의정수와 음의 정수를 모두 가지고 있다. 이제 당신은 이 배열을 좀 특별한 방법으로 정렬해야 한다. 
   정렬이 되고 난 후, 음의 정수는 앞쪽에 양의정수는 뒷쪽에 있어야 한다. 또한 양의정수와 음의정수의 순서에는 변함이 없어야 한다.
   
   예. -1 1 3 -2 2 ans: -1 -2 1 3 2.
 */
package com.programing.contest.challenge.sort;

/**
 * @author SuJi, Lee
 *
 */
public class SpecialSort {
	public int[] sort(int[] arr) { //단순하게 생각했을때..
		if (arr == null || arr.length == 0) {
			return arr;
		}

		int[] datas = new int[arr.length];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				datas[index] = arr[i];
				index++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				datas[index] = arr[i];
				index++;
			}
		}

		return datas;
	}

	public int[] sort2(int[] arr) { // 공간 1개로
		if (arr == null || arr.length == 0) {
			return arr;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[j] >= 0 && arr[j + 1] < 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

	//TODO : 더좋은 방법이 있을까?
}
