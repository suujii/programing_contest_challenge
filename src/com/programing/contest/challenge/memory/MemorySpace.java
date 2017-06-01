/**
프로그램 실행 순서
1.입력할 정수의 개수를 사용자로부터 입력 받는다.
2.입력받은 정수의 개수만큼 정수를 입력받는다.
3.입력받은 정수의 합과 평균 값을 출력한다.
4.할당된 메모리공간을 비운다.

요구사항 
1.메모리공간은 사용자의 입력 수의 따라 변동된다.
2.사용한 공간은 마지막에 비워야 한다.
3.배열을 사용하면 안된다.

 */
package com.programing.contest.challenge.memory;

import java.util.Scanner;

/**
 * @author SuJi, Lee
 *
 */
public class MemorySpace {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("1.입력할 정수의 개수를 사용자로부터 입력 받는다.");
		int n = s.nextInt();

		//2.입력받은 정수의 개수만큼 정수를 입력받는다.
		int sum = 0;
		int average = 0;
		for (int i = 0; i < n; i++) {
			int data = s.nextInt();
			sum += data;
		}

		average = sum / n;
		//3.입력받은 정수의 합과 평균 값을 출력한다.
		System.out.println("sum : " + sum + ", average : " + average);

		//4.할당된 메모리공간을 비운다.
	}
}
