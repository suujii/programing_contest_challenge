/**************
 * 감옥에 120명의 죄수가 있다. 간수는 복도를 120번 동안 다음 조건에 지나간다.
•처음에 문은 모두 닫혀 있다.
•N번째 지나갈 때에는 N의 배수인 문들이 열려 있으면 닫고, 닫혀 있으면 연다.
•마지막에 문이 열려 있으면 그 방의 죄수는 석방이다.

과연 몇 명의 죄수가 석방될까?
 * 
 */
package com.programing.contest.challenge.prisoner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class Prisoner {
	private int count;
	private List<Boolean> list;

	public Prisoner(int count) {
		this.count = count;
		this.list = new ArrayList<Boolean>(count);
		init();
	}

	public void init() {
		for (int i = 0; i < count; i++) {
			list.add(false);
		}
	}

	public int releasePrsonerCnt() {
		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < count; j++) {
				if ((j + 1) % i == 0) {
					if (list.get(j)) {
						list.set(j, false);
					} else {
						list.set(j, true);
					}
				}
			}
		}

		int cnt = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)) {
				System.out.println(i + 1 + "번째 죄수 탈출");
				cnt++;
			}
		}
		return cnt;
	}

	/**방법2 : 제곱수 풀이
	 * 1번째 o o o o o o o o o o.... o
	   2번째 o x o x o x o x o x.....x
	   3번째 o x x x o o o x x x.....o
	   4번째 o x x o o o o o x x.....x
	   5번째 o x x o x o o o x o.....o
	   6번째 o x x o x x o o x o.....x
	   ... 
	   118번재 열려있으면
	   119번째 닫혀있으면되
	   120  o x x o x x x x o x.... 
	   최초 닫힘. 따라서 홀수번 여닫으면 최종은 열린 상태
	   a * b = 1 -> 1
	   a * b = 2 -> 1, 2
	 * a * b = 3 -> 1, 3
	 * a * b = 4 -> 1, 2, 4
	 * a * b = 5 -> 1, 5
	 * ...  
	 * 즉 약수의 개수가 홀수 일때 최종은 열림.
	 * 1과 자기자신을 제외한 약수가 제곱일 경우 결국 홀수개 
	 * 1 , 4, 9, 16, 25, 36, 47, 64, 81, 100 -> 총 10개
	 * 
	 */
	public int releasePrsonerCnt2() {
		int cnt = 0;
		for (int i = 1; i <= count; i++) {
			if (i * i <= count) {
				System.out.println(i * i + "번째 죄수 탈출");
				cnt++;
			}
		}

		return cnt;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<Boolean> getList() {
		return list;
	}

	public void setList(List<Boolean> list) {
		this.list = list;
	}
}
