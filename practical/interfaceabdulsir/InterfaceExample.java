package com.enfy.interfaceabdulsir;


class Phone
{
	public void call()
	{
		System.out.println("phone call");
	}
	
	public void sms()
	{
		System.out.println("sms ");
	}
}

interface Icamera 
{
	public void Flash();
	public void photosGaller();
}

interface Imusic
{
	public void play();
	public void stop();
	
}
class SmartPhone extends Phone implements Icamera,Imusic
{
	public void lences()
	{
		System.out.println("lens");
	}
	public void Flash()
	{
		System.out.println("flash lights");
	}
	public void play()
	{
		System.out.println("play");
	}
	public void stop()
	{
		System.out.println("stop");
	}
	
	public void photosGaller()
	{
		System.out.println("phototgallery");
	}
	
}

public class InterfaceExample {
public static void main(String[] args) {
	Phone ph = new SmartPhone();
	ph.call();
	ph.sms();
	
	Icamera  ic = new SmartPhone();
	ic.Flash();
	ic.photosGaller();
	
	Imusic im = new SmartPhone();
	im.play();
	im.stop();
	
	SmartPhone sp= new SmartPhone();
	sp.call();
	sp.Flash();
	
	}

	
}
