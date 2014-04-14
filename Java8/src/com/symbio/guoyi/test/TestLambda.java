package com.symbio.guoyi.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestLambda {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Kevin", "Nic", "Mingle", "Alex",
				"Seven");

		TestLambda tl = new TestLambda();

		tl.old(list);

		System.out.println("============");

		tl.new4jdk8(list);

		System.out.println("============");

		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < 10; i++) {
			map.putIfAbsent(i, "val" + i);
		}
		
		map.forEach((id, val) -> System.out.println(val));

	}

	public void old(List<String> list) {
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);

			}
		});

		for (String a : list) {
			System.out.println(a);
		}
	}

	public void new4jdk8(List<String> list) {
		Collections.sort(list, (o1, o2) -> o2.compareTo(o1));

		// list.forEach(new TestLambda()::print);
		list.forEach((a) -> {
			a += "_";
			System.out.println(a);
		});
	}

	public void print(String a) {
		System.out.println(a);
	}

}
