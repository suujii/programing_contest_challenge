/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.heap;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class BinaryMinHeapTest {
	@Test
	public void test() {
		BinaryHeap b = new BinaryMinHeap(10);
		b.insert(1);
		b.insert(2);
		b.insert(5);
		b.insert(10);
		b.insert(51);
		b.insert(21);
		b.insert(94);
		b.insert(90);
		b.insert(95);
		b.insert(68);
		b.insert(15);
		System.out.println(b);
		System.out.println(b.getMinimum());
		System.out.println(b.deleteMin());
		System.out.println(b);
		System.out.println(b.delete(1));
		System.out.println(b);
		System.out.println(b.deleteData(15));
		System.out.println(b);
		System.out.println(b.deleteData(1000));
	}

	@Test
	public void test2() {
		BinaryHeap b = new BinaryMaxHeap(11);
		b.insert(31);
		b.insert(10);
		b.insert(16);
		b.insert(9);
		b.insert(8);
		b.insert(14);
		b.insert(12);
		b.insert(3);
		b.insert(1);
		b.insert(5);
		b.insert(7);
		b.insert(19);
		System.out.println(b);
		System.out.println(b.getMaximum());
		System.out.println(b.deleteMax());
		System.out.println(b);
		System.out.println(b.delete(1));
		System.out.println(b);
		System.out.println(b.deleteData(9));
		System.out.println(b);
		System.out.println(b.deleteData(1000));
	}

}
