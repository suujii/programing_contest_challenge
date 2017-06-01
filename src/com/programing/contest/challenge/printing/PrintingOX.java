/**
input은 int n을 입력 받아 첫번째 row는 (n-1)의 O와 X, 두번째 row는 (n-2)의 O와 XX, 세번째 row는 (n-3)의 0와 XXX... n번째 row는 n의 X을 출력하시오.

입력 예시: 6
출력 예시:
OOOOOX
OOOOXX
OOOXXX
OOXXXX
OXXXXX
XXXXXX
 */
package com.programing.contest.challenge.printing;

/**
 * @author SuJi, Lee
 *
 */
public class PrintingOX {
	public void printOX(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= n - i - 1) {
					System.out.print("X");
				} else {
					System.out.print("O");
				}
			}
			System.out.println();
		}
	}
}
