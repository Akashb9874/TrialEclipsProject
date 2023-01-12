package com.Assert;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

public class AssertionTestNg {
	SoftAssert soft=new SoftAssert();
	@Test
	public void Soft()
	{
		System.out.println("1111");
		System.out.println("222");
		soft.assertEquals(2, 2);
		System.out.println("3333");
		System.out.println("444");
		soft.assertAll();
	}
	
	@Test
	public void hard()
	{
		System.out.println("AssertCheck.Assertt()");
		  System.out.println("1111");
		  System.out.println("2222");
		  Assert.assertEquals(2, 2);
		  System.out.println("33333");
	}

}
