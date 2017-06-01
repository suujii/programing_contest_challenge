/**
0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.
•sample inputs: 0123456789 01234 01234567890 6789012345 012322456789
•sample outputs: true false false true false
 */
package com.programing.contest.challenge.count.number;

import java.util.Arrays;

/**
 * @author SuJi, Lee
 *
 */
public class DuplicationNumber {
	public boolean checkDuplicationNumber(String s) {
		if (s == null || s.length() != 10) {
			return false;
		}

		boolean[] check = new boolean[10];
		char[] datas = s.toCharArray();
		for (char data : datas) {
			if (Character.isDigit(data) == false) {
				return false;
			}

			int index = Character.getNumericValue(data);
			if (check[index] == true) {
				return false;
			} else {
				check[index] = true;
			}
		}
		return true;
	}

	public boolean checkDuplicationNumber2(String s) {
		if (s == null || s.length() != 10) {
			return false;
		}

		boolean[] check = new boolean[100]; //배열 공간의 낭비 이슈가 있을 수 있음. char -> int 변환으로 인해
		for (int i = 0; i < s.length(); i++) {
			int data = s.charAt(i);

			if (Character.isDigit(data) == false) {
				return false;
			}

			if (check[data] == true) {
				return false;
			} else {
				check[data] = true;
			}
		}
		return true;
	}

	public boolean checkDuplicationNumber3(String s) { //sorting
		if (s == null || s.length() != 10) {
			return false;
		}

		char[] datas = s.toCharArray();
		Arrays.sort(datas);

		for (int i = 0; i < datas.length - 1; i++) {
			if (datas[i] == datas[i + 1]) {
				return false;
			}
		}

		return true;
	}

}
