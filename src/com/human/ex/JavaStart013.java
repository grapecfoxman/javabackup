package com.human.ex;

public class JavaStart013 {

	public static void main(String[] args) {
//		int a=10;
//		if(a>5) {
//			System.out.println("���İ�� true���� a�� 5����ũ��.");			
//		}else {
//			System.out.println("���İ�� false���� a�� 5���� ũ�� �ʴ�.");
//		}
//		
//		if(1>5) {
//			System.out.println("���İ�� true�̴�");			
//		}else {
//			System.out.println("���İ�� false�̴�.");
//		}
//		int i=1;
//		if(i>0) {
//			System.out.println("i�� ���");
//		}else if(i<0) {
//			System.out.println("i�� ����");
//		}else if(i==0) {
//			System.out.println("i�� 0");
//		}else {
//			System.out.println("i�� ���,����,0�ƴ�");
//		}
		//5�� �ֿ�� 4�� ��� 3�� ���� 2,1,0�� ���հ�
		// ctrl+/   �ּ� ������ ����
//		int i=5;
//		if(i==5) {
//			System.out.println("�ֿ��");
//		}else if(i==4) {
//			System.out.println("���");
//		}else if(i==3) {
//			System.out.println("����");
//		}else {
//			System.out.println("���հ�");
//		}
		//switch case������ �����غ���.
		//�⺻������ ��Ȯ�� ������ ���
		//���ڿ� �Ǽ� ������� ����
		//�ֽ� ���α׷��� �ڹٿ��� ������̳� �Ǽ��� ����ϱ⵵��
		//switch���� ���� ��ȸ�� �ȵȴ�.
		//������ȸ �ϰ� ������ else if���� ����Ͽ��� �Ѵ�.
		//�����ø� �߰��غ���. �����ô� 5~0 �̿��� ���ڰ� ������
		//�����÷� ǥ���Ѵ�.
//		int i=4;
//		switch(i) {
//		case 5:
//			System.out.println("�ֿ��");
//			break;
//		case 4:
//			System.out.println("���");
//			break;
//		case 3:
//			System.out.println("����");
//			break;
//		default:
//			System.out.println("���հ�");
//				
//			break;
//		}
		//�����ø� �߰��غ���. �����ô� 5~0 �̿��� ���ڰ� ������
		//�����÷� ǥ���Ѵ�.
//		int i=4;
//		switch(i) {
//		case 5:
//			System.out.println("�ֿ��");
//			break;
//		case 4:
//			System.out.println("���");
//			break;
//		case 3:
//			System.out.println("���հ�");
//			break;
//		case 2:
//			System.out.println("���հ�");
//			break;
//		case 1:
//			System.out.println("���հ�");
//			break;
//		case 0:
//			System.out.println("���հ�");
//			break;
//			
//		default:
//			System.out.println("������");
//				
//			break;
//		}

//		int i=4;
//		switch(i) {
//		case 5:
//			System.out.println("�ֿ��");
//			break;
//		case 4:
//			System.out.println("���");
//			break;
//		case 3:
//		case 2:
//		case 1:
//		case 0:
//			System.out.println("���հ�");
//			break;
//			
//		default:
//			System.out.println("������");
//				
//			break;
//		}
		
		
		
//		int i=1;
//		if(i>0){
//			System.out.println("i�� ���");
//		}else {
//			if(i<0){
//				System.out.println("i�� ����");	
//			}else {
//				if(i==0) {
//					System.out.println("i�� 0");
//				}else {
//					System.out.println("i�� ���,����,0�ƴ�");
//				}
//			}	
//		}
		//���������� �����Ѱ���� ������ ���α׷��� �����غ���.
		//�����ڵ�� if���� ��ø�Ǿ��ִµ� if���� ��ø�����ʰ� ���� ������������� �����غ���.
		boolean isFlag1=true,isFlag2=true;
		isFlag1=2>1;isFlag2=2>1;
		if(isFlag1==true) {
			if(isFlag2==true) {
				System.out.println("1�� isFlag1�� true isFlag2�� true ");
			}else {
				System.out.println("2�� isFlag1�� true isFlag2�� false ");				
			}			
		}else {
			if(isFlag2==true) {
				System.out.println("3�� isFlag1�� false isFlag2�� true ");				
			}else {
				System.out.println("4�� isFlag1�� false isFlag2�� false ");				
			}			
		}
		//1~4���� �ϳ��� �����Ѵٸ�
		//�ߺ��� if���� �ϳ��� if���� ����ؼ� ������ ���� ��µǵ��� ���ǽ��� �����
		//�����غ���.
		//1���� ��� �Ǵ��� �ƹ��͵� ��µ��� �ʴ���
		//2���� ��� �Ǵ��� �ƹ��͵� ��µ��� �ʴ���
		//3���� ��� �Ǵ��� �ƹ��͵� ��µ��� �ʴ���
		//4���� ��� �Ǵ��� �ƹ��͵� ��µ��� �ʴ���
		//������ && �� ! , ||�� ! 2������ ���� �������.
		
	}
		
		
		
		
		
		
		
		
	

}
