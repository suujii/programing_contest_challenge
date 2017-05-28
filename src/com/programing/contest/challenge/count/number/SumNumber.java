/**
 * 10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다. 
   1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
   http://codingdojang.com/scode/350?answer_mode=hide
 */
package com.programing.contest.challenge.count.number;

public class SumNumber {
	public int sumNumber(int n) {
		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) { //최소공배수는 둘중하나만, 만족하면 되므로 따로 제외시켜줄 필요없음
				sum += i;
			}
		}

		return sum;
	}

}
