/**
* n개의 봉이 있습니다. 봉의 길이는 ai 입니다. 3개의 봉을 선택해서 가능한 둘레의 길이가 긴 삼각형을 만들려고 합니다.
* 둘레의 길이의 최대값을 구하세요. (삼각형을 만들 수 없는 경우에는 0을 출력한다)
*
* 3<=n<=100
* 1<=ai<=10^6
*
* 입력
* n = 5
* a = {2, 3, 4, 5, 10}
* 
* n = 4
* a= {4, 5, 10, 20}
* 
* 출력
* 12(3,4,5를 선택했을 경우)
* 
* 0(삼각형 만들 수 없음)
*/
package com.programing.contest.challenge.triangle;

import java.util.Arrays;

/**
 * @author SuJi, Lee
 *
 */
public class Triangle {
	private int num;
	private int[] bong;

	public Triangle(int num, int[] bong) {
		this.num = num;
		this.bong = bong;
		Arrays.sort(bong);
	}

	public int maxGirth() {
		int max = 0;

		if (num < 3 || num > 100) {
			throw new IllegalArgumentException("n is invalid. Input scope is 3 <= n <=100");
		}

		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				for (int k = j + 1; k < num; k++) {
					if (bong[i] + bong[j] > bong[k]) {
						int girth = bong[i] + bong[j] + bong[k];

						if (max < girth) {
							max = girth;
						}
					}
				}
			}
		}

		return max;
	}

	public void printMaxGirth() {
		System.out.println(maxGirth());
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int[] getBong() {
		return bong;
	}

	public void setBong(int[] bong) {
		this.bong = bong;
	}
}
