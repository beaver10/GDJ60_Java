package com.iu.s4.objects2;

public class Car {
	
	static String company="BMW";
	String name;
	int price;
	String color;
	
	{
		//초기화 블럭
		System.out.println("초기화 블럭 : " + this.company);
		this.company="AUDI";
		
	}
	
	
	public Car() {
//		this("White"); //생성자 내에서 다른 생성자 호출 , 가장 첫줄에 위치해야함
		System.out.println("생성자 : "+this.company);
		this.company="하영자동차";
		this.name="모루카";
		this.price=3500;
		this.color="White";
	}
	
	
	
	public Car(String color) {
		this(color,3500); 
//		this.company="하영자동차";
//		this.name="모루카";
//		this.price=3500;
//		this.color=color;
	}
	
	public Car(String color, int price) {
		this(color, 3500, "레몬모루카");
//		this.company="하영자동차";
//		this.name="모루카";
//		this.price=price;
//		this.color=color;
	}
	
	public Car(String color,int price, String name) {
		this.company="하영자동차";
		this.name=name;
		this.price=price;
		this.color=color;
	}
	
	
	
	
	public void info() {
		System.out.println("name : "+ this.name);
		System.out.println("company : "+ this.company);
		System.out.println("price : "+ this.price);
		System.out.println("color : "+ this.color);
		
		
	}
	

}
