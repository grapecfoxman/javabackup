package com.human.ex;

public class JavaStart010 {
	public static void main(String[] args) {
		//현실세계의 데이터 3~4개정도 선정해서 
		//프로그램으로 만들고 그림을 그려보자.
		
		
		//2. 사용을 위한 클래스 선언
		com.human.dto.Human h1=new com.human.dto.Human();
		//3. 클래스 데이터 입력
		h1.name="홍길동";
		h1.age=25;
		h1.height=166.5;
		//4. 클래스 데이터 출력
		System.out.println("name:"+h1.name);
		System.out.println("age:"+h1.age);
		System.out.println("heigt:"+h1.height);

	}
}
