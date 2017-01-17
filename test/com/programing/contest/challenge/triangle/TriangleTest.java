/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.triangle;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class TriangleTest {
	@Test
	public void testTriangle() {
		int num = 5;
		int[] bong = {2, 3, 4, 5, 10};
		Triangle triangle = new Triangle(num, bong);
		triangle.printMaxGirth();
	}

	@Test
	public void testTriangle2() {
		int num = 4;
		int[] bong = {4, 5, 10, 20};
		Triangle triangle = new Triangle(num, bong);
		triangle.printMaxGirth();
	}
}
