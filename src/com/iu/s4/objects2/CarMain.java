package com.iu.s4.objects2;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Car c1 = new Car();
		c1.info();
		
		Car c2 = new Car("black");
		c2.info();
		
		Car c3 = new Car("Pink", 2500);
		c3.info();
		
		Car c4 = new Car("Lemon", 5000, "레몬모루카");
		c4.info();

	}

}
