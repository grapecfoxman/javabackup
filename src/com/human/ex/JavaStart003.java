package com.human.ex;

public class JavaStart003 {

	public static void main(String[] args) {
		
		java.util.Scanner sr=new java.util.Scanner(System.in);
		int account=0;
		int input=9;
		//1.�Ա� 2.��� 3.��ȸ 4.����
		
		while(input!=4) {
			System.out.println("����ݾ�:"+account);
			System.out.println("1.�Ա� 2.��� 3.��ȸ 4.���� >>");
			input=Integer.parseInt(sr.nextLine());
			//else if, switch
			switch(input) {			
			case 1:
				//input�� 1�϶� ����Ǵ� �κ� ���
				break;
			case 2:
				//input�� 2�϶� ����Ǵ� �κ� ���
				break;
			case 3:
				//input�� 3�϶� ����Ǵ� �κ� ���
				break;
			default:
				//��� �ƴѶ� ����Ǵ� �κ�
			
			}
			
//			if(input==1) {
//				//input�� 1�϶� ����Ǵ� �κ� ���
//			}else if(input==2) {
//				//input�� 2�϶� ����Ǵ� �κ� ���
//			}else if(input==3) {
//				//input�� 3�϶� ����Ǵ� �κ� ���
//			}else {
//				//��� �ƴѶ� ����Ǵ� �κ�
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
//				System.out.println("�Ա��ұݾ�>>");
//				account=account+Integer.parseInt(sr.nextLine());
//			}else {
//				if(input==2) {
//					System.out.println("����ұݾ�>>");
//					account=account-Integer.parseInt(sr.nextLine());	
//				}else {
//					if(input==3) {
//						System.out.println("��ȸ���>>"+account);
//					}else {
//						
//					}
//				}
//				
//			}
		}
			
		System.out.println("���α׷� ����");

	}

}
