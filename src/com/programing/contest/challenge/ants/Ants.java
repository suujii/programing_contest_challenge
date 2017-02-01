/**
* 길이가 Lcm인 장대 위를 n 마리의 개미가 초당 1cm 속도로 걷고있다. 개미는 장대가 끝에 도착하면 장대 밑으로 떨이진다.
* 또한 장대 위는 매우 좁아서 교차할 수 없어 두 마리의 개미가 마주치면 반대방향으로 돌아가야 한다. 우리는 개미가 장대의 어디에 위치(Xi)하고 있는지를
* 알 수 있지만, 어느 쪽으로 향해 걷고 있는지는 알 수 없다. 모든 개미가 장대로부터 떨어질 때까지 걸리는 최소시간과 최대시간을 구하여라
*
* 1<=L<=106
* 1<=n<=106
* 1<=Xi<=L
*
* 입력
* L = 10
* n = 3
* x = {2, 6, 7}
* 
* 출력
* min = 4 {좌, 우, 우}
* max = 8 {우, 우, 우}
*/
package com.programing.contest.challenge.ants;

/**  
 * @author SuJi, Lee
 *
 */
public class Ants {
	private int length;
	private int num;
	private int[] points;

	public Ants(int length, int num, int[] point) {
		if (point == null || num != point.length) {
			throw new IllegalArgumentException("parameter is invalid.");
		}

		this.length = length;
		this.num = num;
		this.points = new int[num];
		this.points = point;
	}

	public void calcTime() {
		int minTime = 0;
		int maxTime = 0;

		for (int i = 0; i < num; i++) {
			int directionMin = Math.min(points[i], length - points[i]);
			minTime = Math.max(minTime, directionMin);
		}

		for (int j = 0; j < num; j++) {
			int directionMax = Math.max(points[j], length - points[j]);
			maxTime = Math.max(maxTime, directionMax);
		}

		printTime(minTime, maxTime);
	}

	public void printTime(int minTime, int maxTime) {
		System.out.println("min = " + minTime);
		System.out.println("max = " + maxTime);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int[] getAnts() {
		return points;
	}

	public void setAnts(int[] ants) {
		this.points = ants;
	}
}
