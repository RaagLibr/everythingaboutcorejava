package com.enfy.finalusage;

public class FinalVarMethod {
	
	final int a=10;
	public void Finalvar()
	{
		final int i=0;
//		for(i=0;i<5;i++)
//		{
//			System.out.println("final variable i");
//		}
		
		//final variable can not change
		
		
	}
	
	public static void main(String[] args) {
		FinalVarMethod fvm = new FinalVarMethod();
		fvm.Finalvar();
		
	}
	
}
