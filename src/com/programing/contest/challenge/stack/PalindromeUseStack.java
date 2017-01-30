/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.stack;

/**
 * @author SuJi, Lee
 *
 */
public class PalindromeUseStack {
	private static final String ESPECIAL_CHARACTER = "X";
	private String word;
	private MyStack<Character> stack;

	public PalindromeUseStack(String word) {
		this.word = word;
		this.stack = new MyStack<>(word.length() / 2);
	}

	public boolean isPalindrome() {
		if (word == null || isInValidWord()) {
			return false;
		}

		int xIndex = word.indexOf(ESPECIAL_CHARACTER);

		for (int index = 0; index < xIndex; index++) {
			stack.push(word.charAt(index));
		}

		for (int index = xIndex + 1; index < word.length(); index++) {
			Character data = word.charAt(index);

			if (data == stack.top()) {
				stack.pop();
			} else {
				return false;
			}
		}

		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isInValidWord() {
		int cnt = 0;

		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == 'X') {
				cnt++;
			}
		}
		return cnt != 1;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public MyStack<Character> getStack() {
		return stack;
	}

	public void setStack(MyStack<Character> stack) {
		this.stack = stack;
	}
}
