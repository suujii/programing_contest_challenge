/**
(())())
(((()())()
(()())((()))
((()()(()))(((())))()
()()()()(()()())()
(()((())()(
NO
NO
YES
NO
YES
NO
 */
package com.programing.contest.challenge.stack;

import java.util.Stack;

/**
 * @author SuJi, Lee
 *
 */
public class Bracket {
	public boolean isRight(String str) {
		Stack<Character> s = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (c == '(' || c == '{') {
				s.push(c);
			} else {
				if (s.isEmpty() || s.peek() != '(' && c == ')' || s.peek() != '{' && c == '}') {
					return false;
				} else {
					if (s.peek() == '(' && c == ')') {
						s.pop();
					} else if (s.peek() == '{' && c == '}') {
						s.pop();
					}
				}
			}
		}

		if (s.isEmpty()) {
			return true;
		}

		return false;
	}
}
