package com.flexon.practice;
import static org.junit.Assert.*;

import org.junit.Test;

public class ShanAppTest 
{

	@Test
	public void Test1()
	{
		assertTrue(true);
		System.out.println("This is Test 1");

	}

	@Test
	public void Test2() {
		int results;

		System.out.println("This is test case 2");
		results = ShanApp.sum(2,2);
		assertEquals(4,results);
	}

	@Test
	public void Test3() {
		int results;

		System.out.println("This is test case 2");
		results = ShanApp.sum(0,2);
		assertEquals(2,results);
	}

}
