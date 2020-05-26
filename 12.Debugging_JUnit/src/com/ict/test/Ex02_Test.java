package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex02;

public class Ex02_Test {
	
	Ex02 ex02;

	@Before	
	public void tBefore() {
		System.out.println("Test Before");
		ex02 = new Ex02();
		
	}
	@Test
	public void test() {
		int res = ex02.mul(3, 4);
		assertEquals(12, res);
		
	}
	
	@After
	public void tAfter() {
		System.out.println("Test After");
	}

}
