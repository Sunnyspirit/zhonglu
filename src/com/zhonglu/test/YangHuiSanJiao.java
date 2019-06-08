package com.zhonglu.test;

import junit.framework.Test;

public class YangHuiSanJiao {
	
	public static void main(String[] args) {
		test(15);
		
	}
	
	public static void test(int n) {
		if(n < 1) {
			return;
		}
		
		int[][] yanghui = new int[n][]; 
		
		for (int i = 0; i < yanghui.length; i++) {
			yanghui[i] = new int[i+1];
			yanghui[i][0] =yanghui[i][i] = 1;
			
			for (int j = 1; j < yanghui[i].length-1; j++) {
				yanghui[i][j] = yanghui[i][j-1]+yanghui[i-1][j];
			}
		}
		
		for (int i = 0; i < yanghui.length; i++) {
			for (int j = 0; j < yanghui[i].length; j++) {
				System.out.print(yanghui[i][j]+"\t");
			}
			System.out.println("");
		}
	}

}
