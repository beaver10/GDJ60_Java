package com.iu.s4.objects3.p1;

public class Member {
	
	//비만 관리 회원 등록
	private String name;
	private int age;
	private double height;
	private double weight;
	private boolean check;
	
	public Member() {}
	
	

	
	public boolean isCheck() {
		return check;
	}




	public void setCheck(boolean check) {
		this.check = check;
	}




	//setter 메서드
	//set+변수명의 첫글자를 대문자로 바꾼것
	public void setAge(int age) {
		if(age>0 && age<200) {
			this.age=age;
		}
	}
	
	//getter 메서드
	//get+변수명의 첫글자를 대문자로 바꾼것
	public int getAge() {
		return this.age;
	}
	
	
	public void setHeight(double height) {
		if(height>100 && height<250) {
			this.height=height;
		}
	}
	
	public double getHeight() {
		return this.height;
	}
	
	

	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getWeight() {
		return weight;
	}




	public void setWeight(double weight) {
		this.weight = weight;
	}




	public void info() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);

		
	}

}
