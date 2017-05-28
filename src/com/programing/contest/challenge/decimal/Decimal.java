/**
 * 10진수를 n진수로 변환하기
 * 위 그림을 참조하여 라이브러리를 사용하지 말고 10진수를 n진수로 변환하는 프로그램을 작성하시오.. (단, n의 범위는 2 <= n <= 16)

예)
•2진수로 변환 : 233 --> 11101001(2)
•8진수로 변환 : 233 --> 351(8)
•16진수로 변환 : 233 --> E9(16)
  16진수 규칙. 10~15 A-F로 표기, 나머지 그대로
  
  라이브러리
  Integer.toBinaryString(int);
  Integer.toOctalString(int);
  Integer.toHexString(int);
 */
package com.programing.contest.challenge.decimal;

import java.util.Stack;

public class Decimal {
	private static final char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};

	//자료구조 x
	public String getDecimal(int data, int n) {
		String result = "";

		if (data < 0) {
			throw new IllegalArgumentException("invalid param");
		}

		while (data != 0) {
			if (data % n >= 10) {
				result = chars[data % n - 10] + result;
			} else {
				result = data % n + result;
			}
			data = data / n;
		}

		return result;
	}

	//자료구조 o
	public String getDecimal2(int data, int n) {
		String result = "";
		Stack<Integer> stack = new Stack<Integer>();

		if (data < 0) {
			throw new IllegalArgumentException("invalid param");
		}

		while (data != 0) {
			stack.push(data % n);
			data = data / n;
		}

		while (stack.isEmpty() == false) {
			Integer dataInfo = stack.pop();
			if (dataInfo >= 10) {
				result += chars[dataInfo - 10];
			} else {
				result += dataInfo;
			}
		}

		return result;
	}

	private StringBuilder sb = new StringBuilder();

	//재귀
	public String getDecimal3(int data, int n) {
		if (data < 0) {
			throw new IllegalArgumentException("invalid param");
		}

		if (data == 0) {
			return sb.reverse().toString();
		}

		if (data % n >= 10) {
			sb.append(chars[data % n - 10]);
		} else {
			sb.append(data % n);
		}

		return getDecimal3(data / n, n);
	}

	//TODO : 32진수?
}
