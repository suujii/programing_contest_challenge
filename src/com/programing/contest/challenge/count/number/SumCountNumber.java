/**
 * 10~1000까지 각 숫자 분해하여 곱하기의 전체 합 구하기
예로, 10~15까지의 각 숫자 분해하여 곱하기의 전체 합은 다음과 같다. 

 10 = 1 * 0 = 0
 11 = 1 * 1 = 1
 12 = 1 * 2 = 2
 13 = 1 * 3 = 3
 14 = 1 * 4 = 4
 15 = 1 * 5 = 5 

그러므로, 이 경우의 답은 0+1+2+3+4+5 = 15

 */
package com.programing.contest.challenge.count.number;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class SumCountNumber {
	public void sumCountNumber(int n, int m) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = n; i <= m; i++) {
			if (i < 10) {
				list.add(i);
			} else {
				int multi = 1;
				int temp = i;
				while (temp >= 10) {
					if (temp / 10 < 10) {
						multi *= temp / 10;
					}
					multi *= temp % 10;
					temp /= 10;
				}
				list.add(multi);
			}
		}

		int sum = 0;

		for (Integer data : list) {
			System.out.println(data);
			sum += data;
		}

		System.out.println(sum);
	}
}
