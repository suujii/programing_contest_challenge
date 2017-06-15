/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.tree;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class BinarySearchTreeTest {
	@Test(expected = IllegalArgumentException.class)
	public void testWhenError() {
		BinarySearchTree t = new BinarySearchTree();
		t.insert(6);
		t.insert(2);
		t.insert(8);
		t.insert(2);
	}

	@Test
	public void test() {
		BinarySearchTree t = new BinarySearchTree();
		t.insert(6);
		t.insert(2);
		t.insert(8);
		t.insert(1);
		t.insert(5);
		t.find(100);
		t.find(6);
		t.find(8);
		t.findMax();
		t.findMin();
		t.delete(100); //없을 때
		t.delete(5); // leaf Node 삭제
		t.insert(4);
		t.insert(3);
		t.delete(4); // 왼쪽 자식 1개 존재하는 경우 삭제
		t.insert(9);
		t.insert(10);
		t.delete(9); // 오른쪽 자식 1개 존재하는 경우 삭제
		t.insert(0);
		t.inOrder(t.getRoot());
		t.delete(2); // 자식이 2개 존재하는 경우 삭제
		t.inOrder(t.getRoot());
	}

	@Test
	public void test2() {
		BinarySearchTree t = new BinarySearchTree();
		t.insert(6);
		t.insert(2);
		t.insert(8);
		t.insert(1);
		t.insert(5);
		System.out.println("---in---");
		t.inOrder(t.getRoot());
		System.out.println();
		System.out.println("---pre---");
		t.preOrder(t.getRoot());
		System.out.println();
		System.out.println("---post---");
		t.postOrder(t.getRoot());
		System.out.println();
		System.out.println("---height---");
		System.out.println(t.treeHeight(t.getRoot()));
	}
}
