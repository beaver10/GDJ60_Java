package com.iu.s4.objects5.characters;

public class Main {

	public static void main(String[] args) {
	
		Archer archer = new Archer();
		Knight knight = new Knight();
		
		Character character = null;
		
		//아처는 아처타입이면서 캐릭터타입이다..
		character= archer;
		
		//하지만 이렇게는 안된다...
		//archer=character;
		
		//하지만 이렇게 강제형변환으로 해결가능
		archer= (Archer)character;
		
		//이건 불가능
		//character.attack();
		
		//하지만 이렇게는 된다!
		archer.attack();
		knight.attack();
		
		
		
	}

}
