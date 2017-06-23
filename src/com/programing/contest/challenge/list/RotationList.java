/**
 * 아래 조건에 따라 리스트를 회전하는 프로그램을 작성하시오.
조건
•입력값은 한 행의 문자열로 주어지며, 각 값은 공백으로 구분된다.
•첫 번째 값은 리스트를 회전하는 양과 방향(음수의 경우 좌측으로, 양수의 경우 우측으로 회전)이다.
•첫 번째 값을 제외한 나머지 값은 리스트의 각 항목의 값이다.
•회전된 리스트를 문자열로 출력한다.
•구현에 이용할 자료구조에 대한 조건이나 제약은 없다.
•입력되는 리스트의 항목의 개수는 유한한다.

입출력예

예 1)
•입력: 1 10 20 30 40 50
•출력: 50 10 20 30 40

예 2)
•입력: 4 가 나 다 라 마 바 사
•출력: 라 마 바 사 가 나 다

예 3)
•입력: -2 A B C D E F G
•출력: C D E F G A B

예 4)
•입력: 0 똘기 떵이 호치 새초미
•출력: 똘기 떵이 호치 새초미
 */
package com.programing.contest.challenge.list;

/**
 * @author SuJi, Lee
 *
 */
public class RotationList {
	public void rotationList(int rotateCnt, String data) {
		if (data == null) {
			return;
		}
		String[] datas = data.split(" ");
		int length = datas.length;

		for (int i = 0; i < length; i++) {
			if (rotateCnt >= 0) {
				int cnt = 0;

				while (cnt < rotateCnt * length) {
					if (length - rotateCnt - 1 >= i) {
						String temp = datas[i + 1];
						datas[i + 1] = datas[i];
						datas[0] = temp;
					} else {
						datas[length - i - 1] = datas[i];
					}
					cnt++;
				}

			} else {

			}
		}
	}

}
