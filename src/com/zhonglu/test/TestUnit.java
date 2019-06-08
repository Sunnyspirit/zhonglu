package com.zhonglu.test;

import static org.junit.Assert.*;

import java.security.acl.Permission;
import java.util.ArrayList;

import org.junit.Test;

public class TestUnit {

	private Object newInstance;

	@Test
	public void test() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person(1, "zhingasd"));
		list.add(new Person(2, "fdsf"));
		list.add(new Person(3, "dfd"));
		list.add(new Person(88, "xvcx"));
		
		Person p = null;
		
		for (Person person : list) {
			if(3 == person.getAge()) {
				p = person;
				break;
			}
		}
		
		if(p != null) {
			p.setAge(100);
		}
		
		for (Person person : list) {
			System.out.println("年龄是---------"+person.getAge());
			
		}
		
		Class<?> forName = Class.forName("com.sd");
	Person	newInstance = (Person) forName.newInstance();
	
	}

}
