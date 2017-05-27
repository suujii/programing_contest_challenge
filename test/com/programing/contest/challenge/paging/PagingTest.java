package com.programing.contest.challenge.paging;

import org.junit.Test;

public class PagingTest {

	@Test
	public void testPringPage() {
		Paging p = new Paging();
		p.pringPage(0, 1);
		p.pringPage(1, 1);
		p.pringPage(2, 1);
		p.pringPage(1, 10);
		p.pringPage(10, 10);
		p.pringPage(11, 10);

	}

}
