package com.human.ex;

public class JavaStart013 {

	public static void main(String[] args) {
//		int a=10;
//		if(a>5) {
//			System.out.println("수식결과 true여서 a가 5보다크다.");			
//		}else {
//			System.out.println("수식결과 false여서 a가 5보다 크지 않다.");
//		}
//		
//		if(1>5) {
//			System.out.println("수식결과 true이다");			
//		}else {
//			System.out.println("수식결과 false이다.");
//		}
//		int i=1;
//		if(i>0) {
//			System.out.println("i는 양수");
//		}else if(i<0) {
//			System.out.println("i는 음수");
//		}else if(i==0) {
//			System.out.println("i는 0");
//		}else {
//			System.out.println("i는 양수,음수,0아님");
//		}
		//5는 최우수 4는 우수 3은 보통 2,1,0은 불합격
		// ctrl+/   주석 생성및 삭제
//		int i=5;
//		if(i==5) {
//			System.out.println("최우수");
//		}else if(i==4) {
//			System.out.println("우수");
//		}else if(i==3) {
//			System.out.println("보통");
//		}else {
//			System.out.println("불합격");
//		}
		//switch case문으로 변경해보자.
		//기본적으로 명확한 정수만 허용
		//문자열 실수 허용하지 않음
		//최신 프로그램언어나 자바에서 문장려이나 실수를 허용하기도함
		//switch문은 범위 조회는 안된다.
		//범위조회 하고 싶으면 else if문을 사용하여야 한다.
		//미응시를 추가해보자. 미응시는 5~0 이외의 숫자가 들어오면
		//미응시로 표기한다.
//		int i=4;
//		switch(i) {
//		case 5:
//			System.out.println("최우수");
//			break;
//		case 4:
//			System.out.println("우수");
//			break;
//		case 3:
//			System.out.println("보통");
//			break;
//		default:
//			System.out.println("불합격");
//				
//			break;
//		}
		//미응시를 추가해보자. 미응시는 5~0 이외의 숫자가 들어오면
		//미응시로 표기한다.
//		int i=4;
//		switch(i) {
//		case 5:
//			System.out.println("최우수");
//			break;
//		case 4:
//			System.out.println("우수");
//			break;
//		case 3:
//			System.out.println("불합격");
//			break;
//		case 2:
//			System.out.println("불합격");
//			break;
//		case 1:
//			System.out.println("불합격");
//			break;
//		case 0:
//			System.out.println("불합격");
//			break;
//			
//		default:
//			System.out.println("미응시");
//				
//			break;
//		}

//		int i=4;
//		switch(i) {
//		case 5:
//			System.out.println("최우수");
//			break;
//		case 4:
//			System.out.println("우수");
//			break;
//		case 3:
//		case 2:
//		case 1:
//		case 0:
//			System.out.println("불합격");
//			break;
//			
//		default:
//			System.out.println("미응시");
//				
//			break;
//		}
		
		
		
//		int i=1;
//		if(i>0){
//			System.out.println("i는 양수");
//		}else {
//			if(i<0){
//				System.out.println("i는 음수");	
//			}else {
//				if(i==0) {
//					System.out.println("i는 0");
//				}else {
//					System.out.println("i는 양수,음수,0아님");
//				}
//			}	
//		}
		//다음문제와 동일한결과가 나오는 프로그램을 구현해보자.
		//다음코드는 if문이 중첩되어있는데 if문을 중첩하지않고 같은 결과가나오도록 구현해보자.
		boolean isFlag1=true,isFlag2=true;
		isFlag1=2>1;isFlag2=2>1;
		if(isFlag1==true) {
			if(isFlag2==true) {
				System.out.println("1번 isFlag1은 true isFlag2는 true ");
			}else {
				System.out.println("2번 isFlag1은 true isFlag2는 false ");				
			}			
		}else {
			if(isFlag2==true) {
				System.out.println("3번 isFlag1은 false isFlag2는 true ");				
			}else {
				System.out.println("4번 isFlag1은 false isFlag2는 false ");				
			}			
		}
		//1~4번중 하나만 선택한다면
		//중복된 if문을 하나의 if문을 사용해서 다음과 같이 출력되도록 조건식을 만들어
		//구현해보자.
		//1번만 출력 되던지 아무것도 출력되지 않던지
		//2번만 출력 되던지 아무것도 출력되지 않던지
		//3번만 출력 되던지 아무것도 출력되지 않던지
		//4번만 출력 되던지 아무것도 출력되지 않던지
		//각각을 && 와 ! , ||와 ! 2가지로 각각 출력하자.
		
	}
		
		
		
		
		
		
		
		
	

}
