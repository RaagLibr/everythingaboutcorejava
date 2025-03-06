package com.enfy.interface4;

public class Tyre implements MovableEx2,Rollable{
	
	int width;
	public boolean isMovable()
	{
		
		return true;
	}
	
	public boolean isRollable()
	{
		return true;
	}
	public static void main(String[] args) {
		Tyre tr =  new Tyre();
		System.out.println(tr.isMovable());
		System.out.println(tr.isRollable());
	}

}
