package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class MenuController {
	
	//start 메서드
	//1.등록
	//2.수정
	//3.삭제
	//4.종료
	
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		StudentInput si = new StudentInput();
		StudentView sv = new StudentView();
		
		
		System.out.println("학생수를 입력하세요");
		int count=sc.nextInt();
		Student [] students =new Student[count];
		
	
		
		
		while(check) {
			System.out.println("1.학생 정보 입력 \t 2.학생 검색 정보출력 \t 3.학생 전체 정보출력 \t 4.학생 추가 \t 5.종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 :
				System.out.println("정보 입력");
				si.setALLStudents(students);
				break;
			case 2 :
				System.out.println("학생 검색 정보출력");
				Student student = si.findStudent(students);
				if(student !=null) {
					sv.viewOne(student);
				}else {
					System.out.println("일치하는 학생 찾지 못함");
				}
				break;
			case 3 :
				sv.viewList(students);
				break;
			case 4 :
				students = si.setStudent(students);
				break;
			default :
				System.out.println("종료");
				check=false;
				break;
			
			}
			
			
			
			
		}
		
		
		
	}
	
	
	
	

}
