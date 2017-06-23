/**
연구자의 연구업적을 평가할 때 사용되는 지표 중 h-index와 g-index라는 것이 있다.
•h-index : 인용 횟수가 h번 이상인 논문이 h개일 때 가능한 h의 최댓값
어느 과학자가 h개의 논문이 h번 이상 인용되고 나머지 논문들은 h번 미만 인용되었다면, 그 과학자의 h-index는 h이다.

•g-index : 인용 횟수가 높은 상위 g개 논문의 인용 횟수 총합이 g²이상일 때 가능한 g의 최댓값

어떤 학자가 쓴 논문 각각의 인용 횟수가 주어질 때, h-index와 g-index를 계산하시오.

e.g.)
•입력 : 0 15 4 0 7 10 0
•h-index : 4
•g-index : 6
 */
package com.programing.contest.challenge.index;

import java.util.Arrays;

/**
 * @author SuJi, Lee
 *
 */
public class Index {
	public void printIndex(Integer[] arr) {
		long c = Arrays.stream(arr).filter(j -> j != 0).count();
		long h = Arrays.stream(arr).filter(k -> k >= c).count();
		double g = Math.sqrt(Arrays.stream(arr).mapToInt(Integer::intValue).sum());
		System.out.printf("h-index : %s , g-index : %s", h, g);
	}

	public static void main(String[] args) {
		Index i = new Index();
		Integer[] arr = {0, 15, 4, 0, 7, 10, 0};
		i.printIndex(arr);
	}

}
