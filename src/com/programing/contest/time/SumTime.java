/**
디지털 시계에 하루동안(00:00~23:59) 3이 표시되는 시간을 초로 환산하면 총 몇 초(second) 일까요? 

디지털 시계는 하루동안 다음과 같이 시:분(00:00~23:59)으로 표시됩니다.
00:00 (60초간 표시됨)
00:01 
00:02 
...
23:59
 */
package com.programing.contest.time;

/**
 * @author SuJi, Lee
 *
 */
public class SumTime {
	public int getSumTime() {
		int sum = 0;
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				if (i % 10 == 3 || j / 10 == 3 || j % 10 == 3) {
					sum += 60;
				}
			}
		}
		return sum;
	}
}
