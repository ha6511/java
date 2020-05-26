package com.ict.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex01;
import com.ict.junit.Ex02;
import com.ict.junit.Ex03;

public class Ex03_test {

	Ex03 ex03;
	Ex02 ex02;
	Ex01 ex01;
	
	@Before
	public void testBefore() {
		ex03 = new Ex03();
		ex02 = new Ex02();
		ex01 = new Ex01();
	}

	@Test
	public void test03() {

		assertEquals(9, ex01.add(7, 2));
		assertEquals(-9, ex01.add(-7, -2));
		assertEquals(-5, ex01.add(-7, 2));
		assertEquals(5, ex01.add(7, -2));
		
		assertEquals(3, ex03.div(7, 2));
		
		
	}
	
	@Test
	public void test02() {
		int res = ex02.mul(7, 2);
		assertEquals(14, res);
	}

	@After
	public void testAfter()  {
		
	}

}
