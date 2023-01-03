package com.iu.s4.objects1;

public class ObjectsMain2 {

	public static void main(String[] args) {
		//Sword Instance 생성
		
		
		Sword s1 = new Sword();
		s1.name="집행검";
		s1.damage=50;
		s1.life=200;
		s1.level=3;
		s1.pirce=50000;
		
		Knight k1 = new Knight();
		k1.name="비버";
		k1.hp=100;
		k1.che=50;
		k1.str=50;
		k1.dex=30;
		k1.wiz=10;
		
		k1.sword=s1;
		
		System.out.println(k1.sword.name);
		
		//변수 선언
		Sword s2=null;
		
		System.out.println(s2.damage);
		

	}

}
