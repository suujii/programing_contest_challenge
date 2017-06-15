/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.dynamic.programing;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class DynamicProgramingTest {
	@Test
	public void test() {
		int count = 4;
		Product[] products = new Product[count];
		int totalWeight = 5;

		Product product1 = new Product();
		product1.setWeight(2);
		product1.setPrice(3);
		products[0] = product1;

		Product product2 = new Product();
		product2.setWeight(1);
		product2.setPrice(2);
		products[1] = product2;

		Product product3 = new Product();
		product3.setWeight(3);
		product3.setPrice(4);
		products[2] = product3;

		Product product4 = new Product();
		product4.setWeight(2);
		product4.setPrice(2);
		products[3] = product4;

		DynamicPrograming d = new DynamicPrograming(count, products, totalWeight);
		d.printMaxTotalPrice();
	}

	@Test
	public void test2() {
		int count = 2;
		Product[] products = new Product[count];
		int totalWeight = 2;

		Product product1 = new Product();
		product1.setWeight(3);
		product1.setPrice(3);
		products[0] = product1;

		Product product2 = new Product();
		product2.setWeight(3);
		product2.setPrice(2);
		products[1] = product2;

		DynamicPrograming d = new DynamicPrograming(count, products, totalWeight);
		d.printMaxTotalPrice();
	}

	@Test
	public void test3() {
		int count = 3;
		Product[] products = new Product[count];
		int totalWeight = 4;

		Product product1 = new Product();
		product1.setWeight(4);
		product1.setPrice(3);
		products[0] = product1;

		Product product2 = new Product();
		product2.setWeight(1);
		product2.setPrice(2);
		products[1] = product2;

		Product product3 = new Product();
		product3.setWeight(1);
		product3.setPrice(4);
		products[2] = product3;

		DynamicPrograming d = new DynamicPrograming(count, products, totalWeight);
		d.printMaxTotalPrice();
	}

	@Test
	public void test4() {
		int count = 3;
		Product[] products = new Product[count];
		int totalWeight = 6;

		Product product1 = new Product();
		product1.setWeight(6);
		product1.setPrice(3);
		products[0] = product1;

		Product product2 = new Product();
		product2.setWeight(3);
		product2.setPrice(2);
		products[1] = product2;

		Product product3 = new Product();
		product3.setWeight(3);
		product3.setPrice(4);
		products[2] = product3;

		DynamicPrograming d = new DynamicPrograming(count, products, totalWeight);
		d.printMaxTotalPrice();
	}

	@Test
	public void test5() {
		int count = 3;
		Product[] products = new Product[count];
		int totalWeight = 5;

		Product product1 = new Product();
		product1.setWeight(1);
		product1.setPrice(1);
		products[0] = product1;

		Product product2 = new Product();
		product2.setWeight(4);
		product2.setPrice(1);
		products[1] = product2;

		Product product3 = new Product();
		product3.setWeight(3);
		product3.setPrice(3);
		products[2] = product3;

		DynamicPrograming d = new DynamicPrograming(count, products, totalWeight);
		d.printMaxTotalPrice();
	}

}
