package com.acorn.aop.ex.실습;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex01 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 
		
		 //Calculator calculator = new Calculator();		 
		
		 //int result  =calculator.add(5, 3);
		 //System.out.println(  result);
		 
		 
		 
		 
		 
		 //
		 Class clazz  = Calculator.class;		 
		 Method[]  methods=  clazz.getDeclaredMethods();
		 
		 Calculator  cal  = (Calculator) clazz.newInstance();		 
		 
		 MyAdvice  advice  =new MyAdvice();
		 
		 
		 for( Method  m: methods) {
			    advice.invoke(m, cal);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
