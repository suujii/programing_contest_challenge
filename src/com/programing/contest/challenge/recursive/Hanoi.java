/**
 * 하노이 탑 만들기
 */
package com.programing.contest.challenge.recursive;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class Hanoi {
	private int n;
	private List<Integer> h1;
	private List<Integer> h2;
	private List<Integer> h3;
	private int count;

	public Hanoi(int n) {
		this.n = n;
		this.h1 = new ArrayList<Integer>(n);
		this.h2 = new ArrayList<Integer>(n);
		this.h3 = new ArrayList<Integer>(n);
		init();
	}

	private void init() {
		for (int i = 0; i < n; i++) {
			h1.add(i, i + 1);
		}
	}

	public void executeHanoi() {
		executeHanoi(h1, h2, h3);
	}

	public void executeHanoi(List<Integer> start, List<Integer> sub, List<Integer> target) {
		if (target.size() == n) {
			System.out.println(count);
		}
		//1. 최초 쌓은 탑(h1이라 가정)에서 제일 위에 것을 특정 한쪽에 넣는다.
		sub.add(start.get(0));
		start.remove(0);
		count++;

		//2. 다음 위에 것을 1에서 넣은 것과 다른 곳에 넣는다.
		target.add(start.get(0));
		start.remove(0);
		count++;

		//3. 2에서 넣은 것을 1에서 넣은 곳에 넣는다- 합치기
		target.add(sub.get(0));
		sub.remove(0);
		count++;

		//4. 그러면 어느한쪽은 비게된다. 빈곳에 최초 쌓은 위치에 있는 제일 위의 것을 넣기
		sub.add(start.get(0));
		start.remove(0);
		count++;

		//5. 계속반복
		executeHanoi(target, start, sub);
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public List<Integer> getH1() {
		return h1;
	}

	public void setH1(List<Integer> h1) {
		this.h1 = h1;
	}

	public List<Integer> getH2() {
		return h2;
	}

	public void setH2(List<Integer> h2) {
		this.h2 = h2;
	}

	public List<Integer> getH3() {
		return h3;
	}

	public void setH3(List<Integer> h3) {
		this.h3 = h3;
	}
}
