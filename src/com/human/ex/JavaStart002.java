package com.human.ex;

public class JavaStart002 {

	public static void main(String[] args) {
		
		java.util.Scanner scanner =						new java.util.Scanner(System.in);	
		System.out.println("입력>>");
		int i=Integer.parseInt(scanner.nextLine());	
		System.out.println(i);
		
		int i1=11;
		int i2=11;
		int i3=11;
		int i4=11;
		
		
		byte b1=23;	//byte 범위에 맞는 정수를 입력
		//short s1=23;//short범위에 맞는 정수를 입력
		//int i1=23;	//int  범위에 맞는 정수를 입력
		
		short s1=23;//short범위에 맞는 정수를 입력
		short s2=55;//short형 상수로 인식된다.
		short s5=1+1;
		short s3=s1;
		//short s4=s1+s2;
		//상위는 컴파일러에서 허용해 줄만한데 허용해주지 않는다.
		//int i=s1+s2;
		//이런 문제들이 있을 수 있다는 것 정도만 알아 두자.
		
		
		//int a;
//		java.util.Scanner scanner =
//				new java.util.Scanner(System.in);
//		System.out.print("사용자 숫자 입력>>");
//		int i=Integer.parseInt(scanner.nextLine());
//		System.out.print("사용자가 입력한값은>>");
//		System.out.println(i);
//		System.out.print("두번째 숫자 입력>>");
//		i=Integer.parseInt(scanner.nextLine());
//		System.out.print("두번째 값은>>");
//		System.out.println(i);
		
		//문제 입력한 두수를 더해서 출력해보자.
		//
//		java.util.Scanner scanner =
//				new java.util.Scanner(System.in);
//		System.out.print("사용자 숫자 입력>>");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.println("출력>>"+a);
//		System.out.print("사용자 숫자 입력>>");
//		int b=Integer.parseInt(scanner.nextLine());
//		System.out.println("출력>>"+b);
//		System.out.print("a+b="+(a+b));
//		
//		int sum=0;
//		int i=0;
//		System.out.print("사용자 숫자 입력>>");
//		i=Integer.parseInt(scanner.nextLine());
//		System.out.print("출력>>"+i);
//		sum=sum+i;
//		System.out.print("사용자 숫자 입력>>");
//		i=Integer.parseInt(scanner.nextLine());
//		System.out.print("출력>>"+i);
//		sum=sum+i;
//		System.out.print("출력>>"+sum);
//		
		
//		if(true) {
//			System.out.println("1-true일때  출력");
//		}else {
//			System.out.println("1-false일때  출력");
//		}
//		
//		if(false) {
//			System.out.println("2-true일때  출력");
//		}else {
//			System.out.println("2-false일때  출력");
//		}
//		
//		if(10>5) {
//			System.out.println("10이 5보다 크다.");
//		}else {
//			System.out.println("10이 5보다 크지 않다.");
//		}
//		if(10 ? 5) {
//			System.out.println("10이 5보다 크다.");
//		}else {//==,<,<= ...
//			//이부분이 출력되려면 ?에 무엇이 들어가야 할 것인가?
//			System.out.println("10이 5보다 크지 않다.");
//		}
//		
		
//		System.out.println("1첫번째 출력");
//		//if문에 조건식이 true이면 if문다음 중괄호 블럭이 시행되고
//		//if문에 조건식이 false이면 else다음에 중괄호블럭이 
//		//실행된다.
//		if(10<2) {
//			//true 일때 실행
//			System.out.println("2번째 출력");
//			System.out.println("3번째 출력");
//		}else {
//			//false 일때 실행
//			System.out.println("4번째 출력");
//		}
//		System.out.println("5번째 출력");
//		
//		
//
//		java.util.Scanner scanner=new java.util.Scanner(System.in);
//		
//		int sum=0;
//		System.out.print("숫자입력>>");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.println("윗변>>"+a);
//		System.out.print("숫자입력>>");
//		int b=Integer.parseInt(scanner.nextLine());
//		System.out.println("아랫변>>"+b);
//		System.out.print("숫자입력>>");
//		int c=Integer.parseInt(scanner.nextLine());
//		System.out.println("높이>>"+c);
//		
//		sum=(a+b)*c/2;
//				
//		System.out.print("비용>>"+sum);
//		
//		
	
//		int i=0;
//		while(i<3) {
//			System.out.println("안녕");
//			i++;			
//		}
//		
//		for(int i=0;i<3;i++) {
//			System.out.println("안녕");
//		}
//		
//		
		
		
		
	}

}









