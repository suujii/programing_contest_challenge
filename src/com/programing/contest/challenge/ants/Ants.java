/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.ants;

/**  
 * @author SuJi, Lee
 *
 */
public class Ants {
	private int length;
	private int num;
	private int[] points;

	public Ants(int length, int num, int[] point) {
		if (point == null || num != point.length) {
			throw new IllegalArgumentException("parameter is invalid.");
		}

		this.length = length;
		this.num = num;
		this.points = new int[num];
		this.points = point;
	}

	public void calcTime() {
		int minTime = 0;
		int maxTime = 0;

		for (int i = 0; i < num; i++) {
			int directionMin = Math.min(points[i], length - points[i]);
			minTime = Math.max(minTime, directionMin);
		}

		for (int j = 0; j < num; j++) {
			int directionMax = Math.max(points[j], length - points[j]);
			maxTime = Math.max(maxTime, directionMax);
		}

		printTime(minTime, maxTime);
	}

	public void printTime(int minTime, int maxTime) {
		System.out.println("min = " + minTime);
		System.out.println("max = " + maxTime);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int[] getAnts() {
		return points;
	}

	public void setAnts(int[] ants) {
		this.points = ants;
	}
}
