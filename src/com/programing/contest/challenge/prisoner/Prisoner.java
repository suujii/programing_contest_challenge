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
		for (Boolean data : list) {
			if (data) {
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
