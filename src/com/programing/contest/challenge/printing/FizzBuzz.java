/**
 * 1~n까지 숫자를 출력하되 3의 배수는 Fizz라는 문자열 출력, 5의 배수는 Buzz라는 문자열을 출력하고,
 * 15의 배수는 FizzBuzz라는 문자열을 출력하라
 */
package com.programing.contest.challenge.printing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class FizzBuzz {
	public static void fizzBuzz(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else {
				if (i % 3 == 0) {
					System.out.println("Fizz");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
			}
		}
	}

	public static List<String> fizzBuzz2(int n) {
		List<String> list = new ArrayList<String>();

		for (int i = 1; i <= n; i++) {
			String word = getData(i, 3, "Fizz") + getData(i, 5, "Buzz");
			if (word.equals("")) {
				list.add(Integer.toString(i));
			} else {
				list.add(word);
			}
		}
		return list;
	}

	public static String getData(int data, int division, String word) {
		if (data % division == 0) {
			return word;
		} else {
			return "";
		}
	}
}
