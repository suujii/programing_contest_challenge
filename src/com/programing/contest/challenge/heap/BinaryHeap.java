/**
 * 이진힙(최소힙, 최대힙)
 * 임의의 요소 삭제하기
 * i번째 요소 삭제하기
 */
package com.programing.contest.challenge.heap;

/**
 * @author SuJi, Lee
 *
 */
public abstract class BinaryHeap {
	protected int[] heap;
	protected int cnt; // 데이터 개수
	protected int size; // 힙 크기

	public BinaryHeap(int size) {
		this.heap = new int[size];
		this.cnt = 0;
		this.size = size;
	}

	public abstract void insert(int data);

	public abstract int delete(int index);

	public abstract int deleteData(int dataValue);

	public abstract int deleteMin();

	public abstract int getMinimum();

	public abstract int deleteMax();

	public abstract int getMaximum();

	public int parent(int index) {
		return returnValidIndex((index - 1) / 2);
	}

	public int leftChild(int index) {
		return returnValidIndex((2 * index) + 1);
	}

	public int rightChild(int index) {
		return returnValidIndex((2 * index) + 2);
	}

	public int returnValidIndex(int index) {
		return isValid(index) ? index : -1;
	}

	public boolean isValid(int index) {
		return 0 <= index && index <= cnt;
	}

	public int[] getHeap() {
		return heap;
	}

	public void setHeap(int[] heap) {
		this.heap = heap;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
