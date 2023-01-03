package com.iu.s3.array;

public class Array8 {

	public static void main(String[] args) {
		int[]ar= {9,5,8,3,6};
		
		//9,8,6,5,3 =>내림차순
		//3,5,6,8,9 =>오름차순
		//0: 1,2,3,4	95836
		//1: 2,3,4		98536
		//2: 3,4		98635
		//3: 4			98653
		
		System.out.println("정렬 전 값은");
		for(int i = 0;i<ar.length;i++) {
			System.out.println( "ar["+(i)+"] 값은" +ar[i]);
			
		}
		for(int i=0; i<ar.length;i++) {
			for(int j=0;j<ar.length-1;j++) {
				if(ar[j]<ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					
				}
			}
		}
		

System.out.println(" 정렬후 값은");

for (int i=0; i<ar.length;i++){

System.out.println( "ar["+(i)+"] 값은" +ar[i]);

}

		
		
	}

}
//https://blog.naver.com/kji9653/222091381963 참고 및 설명