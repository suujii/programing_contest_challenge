/**
 * 스택을 사용하여 중위를 후위로 전환하는 알고리즘을 설명하세요
 * 
 * A+B -> AB+
 * A+B-C -> AB+C-
 * (A+B)*C-D -> AB+C*D-
 */
package com.programing.contest.challenge.stack;

/**
 * @author SuJi, Lee
 *
 */
public class InOrderToPostOrder {
	private MyStack<Character> stacks;
	private String input;

	public InOrderToPostOrder(String input) {
		this.stacks = new MyStack<>(input.length());
		this.input = input;
	}

	public String getPostOrder() {
		StringBuffer s = new StringBuffer();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (isOperand(c)) { //피연산자로 영어대문자만 온다고 가정.
				s.append(c);

			} else if (c == ')') {
				while (stacks.isEmpty() == false && stacks.top() != '(') {
					s.append(stacks.pop());
				}

			} else {
				if (stacks.isEmpty() == false && c > stacks.top()) {
					while (stacks.isEmpty() == false && stacks.top() != ')') {
						char data = stacks.pop();
						if (data != '(') {
							s.append(data);
						}
					}
				}
				stacks.push(c); // 연산자는 +, -, *, /, (, )
			}
		}

		while (stacks.isEmpty() == false) {
			s.append(stacks.pop());
		}

		return s.toString();
	}

	private boolean isOperand(char c) {
		return 'A' <= c && c <= 'Z';
	}

}
