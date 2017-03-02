/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.heap;

import java.util.Arrays;

/**
 * @author SuJi, Lee
 *
 */
public class BinaryMinHeap extends BinaryHeap {
	public BinaryMinHeap(int size) {
		super(size);
	}

	@Override
	public void insert(int data) {
		if (size == cnt) {
			heap = Arrays.copyOf(heap, size * 2);
			size = size * 2;
		}

		heap[cnt] = data; //힙의 마지막에 데이터 넣기
		int parentIndex = parent(cnt);
		int currentIndex = cnt;

		while (isValid(parentIndex) && heap[parentIndex] > heap[currentIndex]) { // 부모보다 작으면 heapifying
			int temp = heap[currentIndex];
			heap[currentIndex] = heap[parentIndex];
			heap[parentIndex] = temp;

			currentIndex = parentIndex;
			parentIndex = parent(parentIndex);
		}

		cnt++; //힙 개수 증가
	}

	@Override
	public int delete(int index) {
		if (isValid(index) == false) {
			return -1;
		}

		int data = heap[index]; //지울 데이터
		heap[index] = heap[cnt - 1];
		cnt--;
		heapifying(index);
		heap[cnt] = 0;

		return data;
	}

	@Override
	public int deleteData(int dataValue) { // 같은 데이터는 없다고 가정
		int index = -1;

		for (int i = 0; i < cnt; i++) {
			if (heap[i] == dataValue) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			int data = heap[index];
			heap[index] = heap[cnt - 1];
			cnt--;
			heapifying(index);
			heap[cnt] = 0;
			return data;
		} else {
			return index;
		}
	}

	@Override
	public int deleteMin() {
		if (cnt == 0) {
			return -1;
		}

		int data = heap[0]; // 루트 복사
		heap[0] = heap[cnt - 1]; // 제일 마지막 요소를 루트에 복사
		cnt--;
		heapifying(0); // heapifying
		heap[cnt] = 0;

		return data;
	}

	@Override
	public int getMinimum() {
		if (cnt == 0) {
			return -1;
		} else {
			return heap[0];
		}
	}

	private void heapifying(int index) {
		if (isValid(index) == false) {
			return;
		}

		int min = index;

		int leftIndex = leftChild(index);
		if (isValid(leftIndex) && heap[index] > heap[leftIndex]) {
			min = leftIndex;
		}

		int rightIndex = rightChild(index);
		if (isValid(rightIndex) && heap[min] > heap[rightIndex]) {
			min = rightIndex;
		}

		if (min != index) {
			int temp = heap[index];
			heap[index] = heap[min];
			heap[min] = temp;
			heapifying(min);
		}
	}

	@Override
	public int deleteMax() {
		System.out.println("not supported");
		return 0;
	}

	@Override
	public int getMaximum() {
		System.out.println("not supported");
		return 0;
	}

	@Override
	public String toString() {
		return "BinaryMinHeap [heap=" + Arrays.toString(heap) + ", cnt=" + cnt + ", size=" + size + "]";
	}
}
