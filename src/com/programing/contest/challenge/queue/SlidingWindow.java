/**
숫자들로만 채워진 주어진 배열 A[]는 크기 w의 슬라이딩 윈도우를 가지고 있다.
이 슬라이딩 윈도우는 배열의 가장 왼쪽에서 오른쪽 끝으로 매번 한 칸씩 움직인다.
또 배열 내 숫자들은 윈도우 안의 w개의 숫자들만 볼 수 있다. 예를 들어 배열이 [1 3 -1 -3 5 3 6 7]이고, w가 3일때 슬라이딩 윈도우 움직임은 아래와 같다.
 */
package com.programing.contest.challenge.queue;

/**
 * @author SuJi, Lee
 *
 */
public class SlidingWindow {
	private int[] arr;
	private int w;

	public SlidingWindow(int[] arr, int w) {
		this.arr = arr;
		this.w = w;
	}

	public void slidingWindow() {
		for (int i = 0; i <= arr.length - w; i++) {
			calculate(i, i + w);
		}
	}

	public void calculate(int start, int end) {
		int max = 0;
		for (int i = start; i < end; i++) {
			System.out.print(arr[i] + " ");

			if (max < arr[i]) {
				max = arr[i];
			}
		}

		System.out.println("max :" + max);
	}
}
