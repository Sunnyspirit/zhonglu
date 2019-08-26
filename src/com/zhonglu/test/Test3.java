package com.zhonglu.test;

public enum Test3 {
	SPRING,
	SUMMER,
	AUTUMN,
    WINTER;
	
	public static void main(String[] args) {
		Test3 spring2 = Test3.SPRING;
		System.out.println(SPRING.equals(spring2));
		System.out.println("7777777777777777777777777777这是分支");
		System.out.println(SPRING.equals(spring2));
		System.out.println(SPRING.equals(spring2));

	}

}
