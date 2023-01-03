package com.iu.s4.objects2;

public class Monster {
	
	//멤버변수, instance 변수
	int power;
	int hp;
	
	//멤버메서드, instance 메서드
	
	public boolean checkValue(Monster monster) {
		//나의 power와 몬스터의 power가 같고, 나의 hp가 같다면 true 리턴 틀리면 false 리턴
		if(monster.hp==this.hp && monster.power==this.power) {
			System.out.println("같음");
			return true;
			
		}else {
		System.out.println("틀림");
		return false;
		}
	}
	
	
	//공격
	
	//어슬렁
	
	public void info() {
		System.out.println(this);
		//참조변수 this : class 내부에서만 사용 가능, 생성된 객체 주소를 담음
		System.out.println(this.power);
		//this는 생략가능
		System.out.println(hp);
		
		attack();
	}
	
	public void attack() {
		System.out.println("공격합니다");
	}
	
	public void setHp(int hp) {
		this.hp=hp;
	}
	
	

}
