/**
 * 1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. 
 * (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
   예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.
 */
package com.programing.contest.challenge.distance;

import java.util.Arrays;

public class ShortDistance {
	public void printShortDistance(int[] arr) {
		//소팅이 되어있으므로, 모든 케이스를 비교할 필요가 없음..
		//예) (1,3) (1,4) (3,4) 1,4는 비교x (3,4)가 가까움.
		int min = arr[1] - arr[0];
		int[] minArray = new int[2];

		for (int i = 1; i < arr.length - 1; i++) {
			int data = arr[i + 1] - arr[i];
			if (min > data) {
				min = data;
				minArray[0] = arr[i];
				minArray[1] = arr[i + 1];
			}
		}

		Arrays.stream(minArray).forEach(data -> System.out.print(data + " "));
	}
}
