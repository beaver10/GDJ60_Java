package com.iu.s4.objects3.p2;

import com.iu.s4.objects3.p1.Secret;
//import com.iu.s4.objects3.p1.*; 별은 모든것 이라는 의미

public class SecretMain {
	public static void main(String[] args) {
		
		Secret secret = new Secret();
		
		//현재 import는 p1패키지지만 p2패키지에 있는 같은 클래스 이름 시크릿 가져오는 법
		com.iu.s4.objects3.p2.Secret secret2= new com.iu.s4.objects3.p2.Secret();
		
		secret.money=100;
		
		secret.s1();
		//secret.s2();
		
		System.out.println(secret.point);
		//Test test = new Test();
		//System.out.println(test.point);
		
	}

}
