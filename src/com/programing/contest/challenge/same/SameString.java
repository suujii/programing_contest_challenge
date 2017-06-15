/**
같은 문자 찾기
 */
package com.programing.contest.challenge.same;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author SuJi, Lee
 *
 */
public class SameString {
	public static void main(String[] args) {
		String[] strs = {"banana", "apple", "strawberry", "banana"};
		Map<String, Integer> result = new HashMap<String, Integer>();

		for (String s : strs) {
			if (result.containsKey(s)) {
				result.put(s, result.get(s) + 1);
			} else {
				result.put(s, 1);
			}
		}

		result.entrySet().stream().filter(s -> s.getValue() != 1).forEach(s -> System.out.print(s.getKey()));

		System.out.println();

		Set<String> set = new HashSet<String>();
		for (String s : strs) {
			set.add(s);
		}

		set.stream().forEach(s -> {
			System.out.print(s + " ");
		});

	}
}
