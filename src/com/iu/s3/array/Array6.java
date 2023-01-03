package com.iu.s3.array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]ar= {8,5,13,9,6};
		
		//키보드로부터 중간에 있는 값을 삭제하기
		
		System.out.println("삭제하고싶은 값 입력");
		int delete = sc.nextInt();
		
		int[]copy=new int[ar.length-1];
		int idx=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==delete) {
				continue;
			}
			copy[idx]=ar[i];
			idx++;
			
		}
		
		ar=copy;
		
		for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}
		

	}

}

