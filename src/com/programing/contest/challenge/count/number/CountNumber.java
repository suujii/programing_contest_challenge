/**
 * 1~1000에서 각 숫자의 개수 구하기
 * 예로 10 ~ 15 까지의 각 숫자의 개수를 구해보자 
 10 = 1, 0
 11 = 1, 1
 12 = 1, 2
 13 = 1, 3
 14 = 1, 4
 15 = 1, 5 
그러므로 이 경우의 답은 0:1개, 1:7개, 2:1개, 3:1개, 4:1개, 5:1개

 */
package com.programing.contest.challenge.count.number;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SuJi, Lee
 *
 */
public class CountNumber {
	public Map<Integer, Integer> countNumber(int n, int m) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = n; i <= m; i++) {
			if (i < 10) {
				divide(map, i);
			} else {
				int temp = i;
				divide(map, temp % 10);

				while (temp / 10 >= 10) {
					temp /= 10;
					divide(map, temp % 10);
				}
				divide(map, temp / 10);
			}
		}
		return map;
	}

	private void divide(Map<Integer, Integer> map, int i) {
		if (map.containsKey(i)) {
			map.put(i, map.get(i) + 1);
		} else {
			map.put(i, 1);
		}
	}
}
