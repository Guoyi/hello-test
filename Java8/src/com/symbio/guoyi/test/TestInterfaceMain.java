package com.symbio.guoyi.test;

import com.symbio.guoyi.TestImp1;
import com.symbio.guoyi.TestImp2;
import com.symbio.guoyi.TestInterface;

public class TestInterfaceMain {

	public static void main(String[] args) {
		
		TestInterface t1 = new TestImp1();
		System.out.println(t1.test("t1"));
		System.out.println(t1.add("t1a", "t1b"));
		
		System.out.println("===================");
		
		TestInterface t2 = new TestImp2();
		System.out.println(t2.test("t2"));
		System.out.println(t2.add("t2a", "t2b"));
	}

}
