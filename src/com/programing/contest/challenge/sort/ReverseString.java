/**
 * 문자열 역순
 */
package com.programing.contest.challenge.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class ReverseString {

	public static void main(String[] args) {
		String str = "abcd";
		int length = str.length();

		//1
		Character[] c = new Character[length];

		for (int i = 0; i < str.length(); i++) {
			c[i] = Character.valueOf(str.charAt(i));

		}
		Arrays.sort(c, new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {
				return c2 - c1;
			}

		});

		Arrays.stream(c).forEach(d -> {
			System.out.print(d);
		});

		System.out.println();

		//2
		Character[] c2 = new Character[length];

		for (int i = 0; i < str.length(); i++) {
			c2[i] = Character.valueOf(str.charAt(i));

		}

		List<Character> list = Arrays.asList(c2);
		Collections.reverse(list);

		list.stream().forEach(d -> {
			System.out.print(d);
		});

		System.out.println();

		//3
		StringBuilder s = new StringBuilder();
		s.append(str);
		System.out.println(s.reverse().toString());

		//4.
		char[] results = new char[str.length()];

		for (int i = 0; i < str.length() / 2; i++) {
			results[str.length() - i - 1] = str.charAt(i);
			results[i] = str.charAt(str.length() - i - 1);
		}

		for (char result : results) {
			System.out.print(result);
		}

		System.out.println();

		String[] strs = new String[] {"t1", "t2", "t3", "t4"};
		List<String> list2 = Arrays.asList(strs);
		Collections.reverse(list2);
		list2.stream().forEach(d -> System.out.print(d));

		//list2.toArray() 배열변환

	}

}
