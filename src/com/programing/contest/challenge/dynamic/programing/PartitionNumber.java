/**
* n개의 상호 구별 불가능한 물건을 m개 이하로 분할하는 방법의 총 갯수를 구해 M으로 나눈 나머지를 구해봅시다.
*
* 1 <= m <= n <= 1000
* 2 <= M <=10000
*
* 입력
* n = 4
* m = 3
* M = 10000
* 
* 출력
* 4(1+1+2=1+3=2+2=4)
*/
package com.programing.contest.challenge.dynamic.programing;

/**
 * @author SuJi, Lee
 *
 */
public class PartitionNumber {
	private int n;
	private int m;
	private int M;
	private int[] arr;

	public PartitionNumber(int n, int m, int M) {
		if (n < m) {
			throw new IllegalArgumentException("invalid param");
		}

		this.n = n;
		this.m = m;
		this.M = M;
		this.arr = new int[m];
	}

	public void printRemainder() {
		int count = 0;

		for (int i = 1; i <= m; i++) { //분할 포문. 1개분할, 2개분할, ... m개분할

		}

		System.out.println(count);

	}
}
