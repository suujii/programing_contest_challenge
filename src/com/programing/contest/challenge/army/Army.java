/**
* 직선상에 N개의 점이 있다. 점 i의 위치는 Xi이다. N개의 점 중 몇개를 골라 표시해 둔다.
* N개의 모든 점에 대해 거리가 R 이내의 장소에 표시를 해둔 점이 없으면 안된다.(자기에게 표시가 있으면, 거리가 0인 곳에 있다고 생각할 수 있음)
* 위의 모든 조건을 만족하면서 가능한 가장 작은 경우의 표시를 해둔 점을 만들고 싶다고 할 대 몇 개의 점에 표시를 해둘 필요가 있을까?
* 
* 1 <= N <= 1000
* 0 <= R <= 1000
* 0 <= Xi <= 1000
*
* 입력
* N = 6
* R = 10
* X = {1, 7, 15, 20, 30, 50}
* 
* 출력
* 3
*/
package com.programing.contest.challenge.army;

/**
 * @author SuJi, Lee
 *
 */
public class Army {
	private static final int MAX_POSITION = 1000;
	private static final int MIN_POSITION = 0;
	private int n;
	private int interval;
	private int[] position;

	public Army(int n, int interval, int[] position) {
		if (n != position.length) {
			throw new IllegalArgumentException("invalid param");
		}

		this.n = n;
		this.interval = interval;
		this.position = position;
	}

	public void printMarkingCount() {
		printMarkingCount(0);
	}

	public void printMarkingCount(int startIndex) {
		boolean[] markings = new boolean[n];

		for (int i = startIndex; i < position.length; i++) {
			int current = position[i];
			int leftInterval = Math.max(MIN_POSITION, current - interval);
			int rightInterval = Math.min(MAX_POSITION, current + interval);

			if (i - 1 >= 0 && markings[i - 1] == false && leftInterval < position[i - 1]) {
				markings[i] = true;
			}

			if (i + 1 < position.length && markings[i + 1] == false && position[i + 1] < rightInterval) {
				markings[i] = true;
			}
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public int[] getPosition() {
		return position;
	}

	public void setPosition(int[] position) {
		this.position = position;
	}
}
