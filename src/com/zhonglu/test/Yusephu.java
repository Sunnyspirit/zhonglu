package com.zhonglu.test;

public class Yusephu {
	public static void main(String[] args) {
		
	}
	
	
	//创建一个节点类

}

class Boy {
	
	private Boy first = null;
	private Integer no;
	private Boy next;
	
	public Boy() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public Boy getNext() {
		return next;
	}

	public void setNext(Boy next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Boy [first=" + first + ", no=" + no + ", next=" + next + "]";
	}
	
}