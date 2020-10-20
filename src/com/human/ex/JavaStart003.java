package com.human.ex;

public class JavaStart003 {

	public static void main(String[] args) {
		
		java.util.Scanner sr=new java.util.Scanner(System.in);
		int account=0;
		int input=9;
		//1.입금 2.출금 3.조회 4.종료
		
		while(input!=4) {
			System.out.println("현재금액:"+account);
			System.out.println("1.입금 2.출금 3.조회 4.종료 >>");
			input=Integer.parseInt(sr.nextLine());
			//else if, switch
			switch(input) {			
			case 1:
				//input이 1일때 실행되는 부분 기술
				break;
			case 2:
				//input이 2일때 실행되는 부분 기술
				break;
			case 3:
				//input이 3일때 실행되는 부분 기술
				break;
			default:
				//모두 아닌때 실행되는 부분
			
			}
			
//			if(input==1) {
//				//input이 1일때 실행되는 부분 기술
//			}else if(input==2) {
//				//input이 2일때 실행되는 부분 기술
//			}else if(input==3) {
//				//input이 3일때 실행되는 부분 기술
//			}else {
//				//모두 아닌때 실행되는 부분
//			}
			
			
//			if(input==1) {
//				
//			}else {
//				
//			}
//			if(input==2) {
//				
//			}else {
//				
//			}
			
//			if(input==1) {
//				System.out.println("입금할금액>>");
//				account=account+Integer.parseInt(sr.nextLine());
//			}else {
//				if(input==2) {
//					System.out.println("출금할금액>>");
//					account=account-Integer.parseInt(sr.nextLine());	
//				}else {
//					if(input==3) {
//						System.out.println("초회결과>>"+account);
//					}else {
//						
//					}
//				}
//				
//			}
		}
			
		System.out.println("프로그램 종료");

	}

}
