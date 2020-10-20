package com.human.ex;

public class JavaStart004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a1=0, a2=0, a3=0, a4=0, a5=0 
		//a[5],a[]={0,0,0,0,0}
//		int a1=0;
//		int a2=0;
//		int a3=0;
//		//int []a=new int[5];
//		int a[]=new int[5];
//		a[0]=0; a[1]=0;//a[5]=0;
//		System.out.println(a[0]);
//		
//		int a[]=new int[3];
//		a[0]=5;
//		a[2]=3;
//		int b[]= {0,4,6,0};
//		System.out.println(a[0]);
//		System.out.println(b[2]);
//		a[1]=8;b[0]=1;
//		b[3]=a[1]+b[0];
//		
		int a[]=new int[3];		
		int count=0;
		while(count<3) {
			a[count]=count+1;
			count++;			
		}
		count=0;
		while(count<3) {
			System.out.println(a[count]);
			count++;			
		}
		
		for(int i=0;i<3;i++) {
			a[i]=i+1;
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(a[i]);
		}

		
		
		//a=new int[6];
		//b= {1,2,3};

	}

}
