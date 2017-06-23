/**
주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.
이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌
1.김씨와 이씨는 각각 몇 명 인가요?
2."이재영"이란 이름이 몇 번 반복되나요?
3.중복을 제거한 이름을 출력하세요.
4.중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.

 */
package com.programing.contest.challenge.name;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author SuJi, Lee
 *
 */
public class Name {
	// 1.김씨와 이씨는 각각 몇 명 인가요?
	public void count(String data) {
		String[] names = data.split(",");
		int kimCount = 0;
		int leeCount = 0;

		for (String name : names) {
			if (name == null) {
				continue;
			}
			if (name.startsWith("김")) {
				kimCount++;
			} else if (name.startsWith("이")) {
				leeCount++;
			}
		}

		System.out.println("kim : " + kimCount + " lee : " + leeCount);

	}

	//2."이재영"이란 이름이 몇 번 반복되나요?
	public void count2(String data) {
		String[] names = data.split(",");
		int count = 0;

		for (String name : names) {
			if (name == null) {
				continue;
			}
			if (name.equals("이재영")) {
				count++;
			}
		}

		System.out.println("leejaeyoung : " + count);
	}

	//3.중복을 제거한 이름을 출력하세요.
	public void printName(String data) {
		String[] names = data.split(",");
		Set<String> set = Arrays.stream(names).collect(Collectors.toSet());
		set.stream().forEach(value -> System.out.println(value));
	}

	//4.중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
	//	public void printName2(String data) {
	//		System.out.println();
	//		String[] names = data.split(",");
	//		Set<String> set = Arrays.stream(names).sorted().collect(Collectors.toSet());
	//		set.stream().forEach(value -> System.out.println(value));
	//	}

	//4.중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
	public void printName3(String data) {
		System.out.println();
		String[] names = data.split(",");
		Set<String> set = Arrays.stream(names).sorted().collect(Collectors.toSet());
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list); //treeset 도 가능.
		list.stream().forEach(value -> System.out.println(value));

	}

	public static void main(String[] args) {
		String data = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		Name n = new Name();
		n.count(data);
		n.count2(data);
		n.printName(data);
		//		n.printName2(data);
		n.printName3(data);
	}

}
