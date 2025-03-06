package com.enfy.finalvariable;

public class FinalEx1 {
    FinalEx1() {
        System.out.println("this is default constructor");
    }

    final int a = 100;

    final void show() {
        System.out.println("final show method");
    }

    void welcome() {
        System.out.println("welcome to java by");
    }
}

class FinalTestEx extends FinalEx1 {
    // Cannot override the final method from FinalEx1
//     void show() {
//         System.out.println("this is method final test");
//     }
//	
	
	public FinalTestEx()
	{
		System.out.println("child constructor");
	}
	
}
