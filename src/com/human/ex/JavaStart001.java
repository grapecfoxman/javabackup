package com.human.ex;

public class JavaStart001 {

	public static void main(String[] args) {
		// 한줄 주석
		/*
		 * window->show view->package explorer

		 * 여러줄 주석
		 * 아래프로그램은 처음 시작하는 자바 프로그램입니다.
		 * 
		 */
		//System.out.println("hello World");
		int a=6;
		int b=6;
		int sum=a+b;
		a=7;
		//방향키 누르면 커서가 움직인다.
		//shift 누른상태에서 방향키 선택
		//end키 코드 맨 마지막 줄 이동
		System.out.println(sum);//12
		System.out.println(a);//7
		System.out.println(b);//6
		
		System.out.println("다시 계산후 출력");
		sum=a+b;
		
		//선택후 ctrl+c 복사
		//ctrl+v 붙여넣기		
		System.out.println(sum);//12
		System.out.println(a);//7
		System.out.println(b);//6
		

	}

}
