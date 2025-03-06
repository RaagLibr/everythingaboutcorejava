package com.enfy.string;

public class MethodStringEx2 {
	public static void main(String[] args) {
		String s= "My Name is Ragini Yadav";
		//		System.out.println(s.substring(0,2));
//		System.out.println(s.substring(3,7));       
//        System.out.println(s.substring(7,11));
//        System.out.println(s.substring(11,17));
//        System.out.println(s.substring(18));
//      
		
//		char c=' ';
//
//        for(int i=0;i<s.length();i++)
//        {
//        	if(s.charAt(i)==c)
//        	{
//        		System.out.println();
//        		
//        	}
//        	else
//        		System.out.print(s.charAt(i));
//    		
//        }
        
        
        String str = "I am Ragini Yadav";
        String[] arrOfStr = str.split(" ", 5);
 
        for (String a : arrOfStr)
            System.out.println(a);
        
         
		
		
//		String s1=" Yadav";
		
//		String name=s.concat(s1);
//		System.out.println(name);
//		
//		char name1=s.charAt(2);
//		System.out.println(name1);
//		
//		 String Str = new String("Ragini");
//		 
//	        // using substring() to extract substring
//	        System.out.print(Str.substring(3,6));
//	        System.out.print(" Yadav");
//	        
	        
		       
	}
}
