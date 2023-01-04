package com.iu.s4.objects5.characters;

public class Main {

	public static void main(String[] args) {
		Magition magition = new Magition();
		magition.getMp();
		magition.setMp(0);
		magition.setName("");
		
		Archer archer = new Archer();
		archer.setDex(0);
		archer.setLevel(3);
		
		magition.attack();
		archer.attack();
		
		
		
	}

}
