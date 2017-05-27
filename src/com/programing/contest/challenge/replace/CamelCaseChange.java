/**
 * 파이썬과 같은 몇몇 프로그래밍 언어는 Pothole_case 를 더 선호하는 언어라고 합니다.
Example:
codingDojang --> coding_dojang
numGoat30 --> num_goat_3_0
위 보기와 같이 CameleCase를 Pothole_case 로 바꾸는 함수를 만들어요!

 */
package com.programing.contest.challenge.replace;

/**
 * @author SuJi, Lee
 *
 */
public class CamelCaseChange {
	//방법1 아스키코드
	public String change(String s) {
		if (s == null) {
			return s;
		}

		StringBuilder sb = new StringBuilder();

		int length = s.length();
		for (int i = 0; i < length; i++) {
			char data = s.charAt(i);

			if (97 <= data && data <= 122) {
				sb.append(data);
			} else if (48 <= data && data <= 57) {
				sb.append("_" + data);
			}
			else {
				char changeData = (char)(data + 32);
				sb.append("_" + changeData);
			}
		}

		return sb.toString();
	}

	//방법2 아스키코드 안쓰고
	public String change2(String s) {
		if (s == null) {
			return s;
		}

		StringBuilder sb = new StringBuilder();

		int length = s.length();
		for (int i = 0; i < length; i++) {
			String data = s.substring(i, i + 1);
			char charData = data.toCharArray()[0];

			if ('0' <= charData && charData <= '9') { //이렇게 비교해도 무방
				sb.append("_" + data);
			} else if (data.equals(data.toLowerCase())) {
				sb.append(data);
			} else {
				sb.append("_" + data.toLowerCase());
			}
		}

		return sb.toString();
	}
}
