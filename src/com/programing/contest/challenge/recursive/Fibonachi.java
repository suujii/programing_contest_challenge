/**
피보나치 만들기
 */
package com.programing.contest.challenge.recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class Fibonachi {
	public static List<Integer> fibonachi(int n) {
		List<Integer> list = new ArrayList<Integer>();

		if (n == 0) {
			return list;
		} else if (n == 1) {
			return Arrays.asList(0);
		} else if (n == 2) {
			return Arrays.asList(0, 1);
		}

		list.add(0);
		list.add(1);

		int cnt = 2;
		while (cnt < n) {
			int a = list.get(cnt - 2);
			int b = list.get(cnt - 1);
			list.add(a + b);
			cnt++;
		}
		return list;
	}

	public static int fibonachi2(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return fibonachi2(n - 2) + fibonachi2(n - 1);
	}

}
