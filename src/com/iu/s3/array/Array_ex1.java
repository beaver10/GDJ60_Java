package com.iu.s3.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 학생수 입력
		// 2. 학생의 수만큼 이름을 입력 ex: iu, winter
		// 3. 학생의 수만큼 학생의 번호, 국어, 영어, 수학 입력
		//	iu 학생의 번호 :
		//	iu 학생의 국어 :
		// 	iu 학생의 영어 :
		// 	iu 학생의 수학 :
		// 총점 평균 계산 	:
		
		//모든 학생의 정보 출력
		//이름	번호		국어		영어		수학		총점		평균
		//iu	1		54		63		24		124		 45.3
		//.........
		
		System.out.println("학생수를 입력하세요");
		int count =sc.nextInt();
		String[]names=new String [count]; //이름을 모을 배열
		int []nums=new int[names.length]; //번호
		int []kor=new int[names.length]; //국어
		int []eng=new int[names.length]; //영어
		int []math=new int[names.length]; //수학
		int []total=new int[names.length]; //총합
		double []avg=new double[names.length]; //평균
		
		//int total=kor+eng+math;
		//total=new int[names.length];
		
		//double []avg = total/3;
	
		
		
		for(int i =0;i<names.length;i++) {
			System.out.println(i+1+"번째 이름을 입력하세요");
			names[i]=sc.next();
		}
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+"의 번호를 입력하세요");
			nums[i]=sc.nextInt();
			System.out.println(names[i]+"의 국어 점수를 입력하세요");
			kor[i]=sc.nextInt();
			System.out.println(names[i]+"의 수학 점수를 입력하세요");
			math[i]=sc.nextInt();
			System.out.println(names[i]+"의 영어 점수를 입력하세요");
			eng[i]=sc.nextInt();
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			
			
		}
			
		System.out.println("이름 \t 번호 \t 국어 \t 수학 \t 영어 \t 총합 \t 평균");
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" \t ");
			System.out.print(nums[i]+" \t ");
			System.out.print(kor[i]+" \t ");
			System.out.print(math[i]+" \t ");
			System.out.print(eng[i]+" \t ");
			System.out.print(total[i]+" \t ");
			System.out.println(avg[i]);
		}
		
		
		
		
	}

}
