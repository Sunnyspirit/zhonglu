package com.zhonglu.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {
		test1();

	}

	public static void test1() {
		List<String> list1 = Arrays.asList("a", "b", "c");
		List<String> list2 = Arrays.asList("a", "b", "c", "e", "f");

		ArrayList<Object> arrayList1 = new ArrayList<>(list1);
		ArrayList<Object> arrayList2= new ArrayList<>(list2);
		
//		HashSet<String> hashSet1 = new HashSet<>(list1);
//		HashSet<String> hashSet2 = new HashSet<>(list2);
//		boolean retainAll = hashSet2.retainAll(hashSet1);
		boolean removeAll = arrayList2.removeAll(arrayList1);
		System.out.println(arrayList2);
//
//		System.out.println(retainAll);
//		System.out.println(hashSet2);

	}
}
