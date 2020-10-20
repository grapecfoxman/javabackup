package com.human.ex;

//1. 사용자 정의 데이터 클래스 정의
class Human{
	public String name="";
	public int age=0;
	public double height=0;
}

public class JavaStart012 {
	public static void main(String[] args) {
		//2. 사용을 위한 클래스 선언
		Human h1=new Human();
		//3. 클래스 데이터 입력
		h1.name="홍길동";
		h1.age=25;
		h1.height=166.5;
		//4. 클래스 데이터 출력
		System.out.println("name:"+h1.name);
		System.out.println("age:"+h1.age);
		System.out.println("heigt:"+h1.height);
		
		Human h2=h1;
		//3. 클래스 데이터 입력
		h2.name="홍길남";
		h2.height=164.5;
		//4. 클래스 데이터 출력
		System.out.println("name:"+h1.name);
		System.out.println("age:"+h1.age);
		System.out.println("heigt:"+h1.height);
		
		System.out.println("name:"+h2.name);
		System.out.println("age:"+h2.age);
		System.out.println("heigt:"+h2.height);
		

	}
}
