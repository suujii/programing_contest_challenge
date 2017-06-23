/**
아래와 같은 결과를 출력하는 function을 구현하라 

bool OneEditApart(string s1, string s2) 
OneEditApart("cat", "dog") = false
OneEditApart("cat", "cats") = true 
OneEditApart("cat", "cut") = true 
OneEditApart("cat", "cast") = true 
OneEditApart("cat", "at") = true
OneEditApart("cat", "acts") = false 

한개의 문자를 삽입, 제거, 변환을 했을때 s1, s2가 동일한지를 판별하는 OneEditApart 함수를 작성하시오.

 */
package com.programing.contest.challenge.words;

/**
 * @author SuJi, Lee
 *
 */
public class Words {
	public boolean oneEditApart(String s1, String s2) {
		if (Math.abs(s1.length() - s2.length()) > 1) {
			return false;
		}

		if (s1.contains(s2) || s2.contains(s1)) {
			return true;
		}

		int leftIdx = 0;
		int rightIdx = 0;
		boolean isSame = true;
		while (leftIdx < s1.length() && rightIdx < s2.length()) {
			char c1 = s1.charAt(leftIdx);
			char c2 = s2.charAt(rightIdx);

			if (c1 != c2) {
				if (isSame == false) {
					return isSame;
				}
				isSame = false;
			}

			leftIdx++;
			rightIdx++;

		}

		if (isSame == false && leftIdx < s1.length()) {
			if (s1.charAt(leftIdx) != s2.charAt(rightIdx - 1)) {
				return false;
			}
		}

		if (isSame == false && rightIdx < s2.length()) {
			if (s1.charAt(leftIdx - 1) != s2.charAt(rightIdx)) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		Words w = new Words();
		System.out.println(w.oneEditApart("cat", "dog"));
		System.out.println(w.oneEditApart("cat", "cats"));
		System.out.println(w.oneEditApart("cat", "cut"));
		System.out.println(w.oneEditApart("cat", "cast"));
		System.out.println(w.oneEditApart("cat", "at"));
		System.out.println(w.oneEditApart("cat", "acts"));
		System.out.println(w.oneEditApart("cat", "cass"));
		System.out.println(w.oneEditApart("cas", "cass"));
		System.out.println(w.oneEditApart("as", "cass"));
	}

}
