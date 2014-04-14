package com.symbio.guoyi;

public interface TestInterface {
	
	String test(String a);
	
	default String add(String a, String b) {
		return TestInterface.class.getName() + " " + a + b;
	}
	
	static boolean isEmpty (String a) {
		return a == null || a.isEmpty();
	}

}
