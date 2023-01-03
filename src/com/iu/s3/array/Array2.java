package com.iu.s3.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[]ar=new int[3];
		int[]ar2=new int[5];
		
		//키보드로부터 숫자를 입력받아서 해당숫자만큼 배열을 생성

		System.out.println("숫자를 입력");
		int count = sc.nextInt();
		
		int[]ar3=new int[count];
		
		for(int i=0;i<ar3.length;i++) {
			System.out.println(i+1+" 번째 숫자를 입력");
			ar3[i]=sc.nextInt();
		}
	
		for(int i =0;i<count;i++) {
			System.out.println(ar3[i]);
			
		}
		
		
		

	}

}
