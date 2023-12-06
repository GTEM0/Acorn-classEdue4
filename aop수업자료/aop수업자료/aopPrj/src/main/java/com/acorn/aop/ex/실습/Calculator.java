package com.acorn.aop.ex.실습;

public class Calculator {
	public int add(int num1, int num2) {
		
		//시작전
		long start = System.currentTimeMillis();
		int result = num1 + num2;
		
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		return result;
	}
	
	
	public int sub(int num1, int num2) {
		int result = num1-num2;
		return result;
	}
	
	
}
