package com.symbio.guoyi;

public class TestImp2 implements TestInterface {

	@Override
	public String test(String a) {
		return TestImp2.class.getName() + " " + a;
	}

}
