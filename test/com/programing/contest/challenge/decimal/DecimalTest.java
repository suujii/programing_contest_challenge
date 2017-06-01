package com.programing.contest.challenge.decimal;

import org.junit.Test;

public class DecimalTest {

	@Test
	public void testGetDecimal0() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal(4, 2));
	}

	@Test
	public void testGetDecimal1() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal(233, 2));
	}

	@Test
	public void testGetDecimal2() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal(233, 8));
	}

	@Test
	public void testGetDecimal3() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal(233, 16));
	}

	@Test
	public void testGetDecimal4() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal(233, 13));
	}

	@Test
	public void testGetDecimal5() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal2(4, 2));
	}

	@Test
	public void testGetDecimal6() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal2(233, 2));
	}

	@Test
	public void testGetDecimal7() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal2(233, 8));
	}

	@Test
	public void testGetDecimal8() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal2(233, 16));
	}

	@Test
	public void testGetDecimal9() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal2(233, 13));
	}

	@Test
	public void testGetDecimal10() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal3(4, 2));
	}

	@Test
	public void testGetDecimal11() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal3(233, 2));
	}

	@Test
	public void testGetDecimal12() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal3(233, 8));
	}

	@Test
	public void testGetDecimal13() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal3(233, 16));
	}

	@Test
	public void testGetDecimal14() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal3(233, 13));
	}

	@Test
	public void testGetDecimal16() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal(1000, 32));
	}

	@Test
	public void testGetDecimal17() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal2(1000, 32));
	}

	@Test
	public void testGetDecimal18() {
		Decimal d = new Decimal();
		System.out.println(d.getDecimal3(1000, 32));
	}

}
