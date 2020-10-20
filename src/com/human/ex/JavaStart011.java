package com.human.ex;
import com.human.dto.Human;
//1. 사용자 정의 데이터 클래스 정의
//class Human{
//	public String name="";
//	public int age=0;
//	public double height=0;
//}

public class JavaStart011 {
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
		
		h1=new Human();
		//3. 클래스 데이터 입력
		h1.name="홍길남";
		h1.age=26;
		h1.height=164.5;
		//4. 클래스 데이터 출력
		System.out.println("name:"+h1.name);
		System.out.println("age:"+h1.age);
		System.out.println("heigt:"+h1.height);
		

	}
}
