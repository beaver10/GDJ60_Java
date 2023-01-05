package com.iu.s4.objects6;

public class Robot {
	
	private ArmLeft armLeft;
	private ArmRight armRight = new ArmRight();
	
	//로봇은 팔다리없이 안됨 = 의존적이다 (Dependency)
	//집어넣는 과정 (inject: 주입)
	//의존성 주입 D.I
	
	//클래스 내부에서 끼워넣을수도있다
	public Robot() {
		this.armRight = new ArmRight();
	}
	public Robot(ArmRight armRight) {
		this.armRight=armRight;
	}
	
	
	public ArmLeft getArmLeft() {
		return armLeft;
	}
	public void setArmLeft(ArmLeft armLeft) {
		this.armLeft = armLeft;
	}
	public ArmRight getArmRight() {
		return armRight;
	}
	public void setArmRight(ArmRight armRight) {
		this.armRight = armRight;
	}
	
	
}
