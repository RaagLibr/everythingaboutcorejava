package com.enfy.constructvolume;

public class VolumeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box(3.00f,2.00f);
		System.out.println("volume of cylinder ="+b1.vc);
		
		Box b2 = new Box(4.4f);
		System.out.println("volume sphere= "+b2.vs);
		
		Box b3 = new Box(2.0f,3.0f,1.0f);
		System.out.println("volume ="+b3.vcub);
		
		
		Box b4 = new Box(1.0f,2.0f);
		System.out.println("volume="+b4.vcone);
		
	}

}

