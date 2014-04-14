package com.symbio.guoyi;

public class TestImp1 implements TestInterface {

	@Override
	public String test(String a) {
		return TestImp1.class.getName() +  " " +  a;
	}
	
	public String add(String a, String b) {
		return TestImp1.class.getName() + " " + a + b;
	}

}
