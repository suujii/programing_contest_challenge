/**
 * 하노이 탑 만들기
 */
package com.programing.contest.challenge.recursive;

/**
 * @author SuJi, Lee
 *
 */
public class Hanoi {
	private int n;

	public Hanoi(int n) {
		this.n = n;
	}

	public void executeHanoi() {
		executeHanoi(n, 1, 3, 2);
	}

	void move(int n, int from, int to) {
		System.out.println("Move " + n + "번 from : " + from + " to : " + to);
	}

	public void executeHanoi(int n, int from, int sub, int to) {
		if (n == 1) {
			move(n, from, to);
		}

		else {
			executeHanoi(n - 1, from, to, sub); //from에서 n-1개의 원소들은 sub로 옮겨놓기
			move(n, from, to); //n번째 요소는 최종 목적지에
			executeHanoi(n - 1, sub, from, to); //sub에 옮겨논 n-1개의 원소들을 최종 목적지로 합친다.
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}
