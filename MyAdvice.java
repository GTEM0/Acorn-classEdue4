package com.acorn.aop.ex.실습;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//위임객체
//클래스 작성
public class MyAdvice {

	
	public  Object  invoke( Method m  ,  Object obj , Object ...objects) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//부가적인 코드
		
		System.out.println("hi");	
		
		System.out.println(   m.getName()   + "호출!!!");
		Object result  =m.invoke(obj, objects);
		
		
		System.out.println("bye");
		
		//부가적인 코드
		return result;
		
		
	}
	
	
}
