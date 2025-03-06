package com.enfy.testxyz;

public class Method10 {
	
	int x=10;

	void m1()
	{
		int y=100;
		x= x+1;
		y=y+1;
		System.out.println(x+" "+y);
	}

		int sumOfNatNo1(int n)    //This are the methods or behaviour to pass an arguments
		{
			int	num = n*n+1/2;
			return num;   			//return var in main to print in console
		}
		double profit2( double sellPric  , double costPric)
		{	
			double pro = sellPric - costPric;
			return pro;
			
		}
		
		double simpleInterest3( double principle , double rate ,double time)
		{
			double si= principle*rate *time/100;
			return si ;
		}
		
		int naturalN04(int n)
		{
			int i = 0;
			int natsum=0;
			for(i=1;i<=n;++i)
			{
				natsum = natsum + i;
			}
			return natsum;

		}
		
		int sumOfOdd5( int n )
		{
			int sum = 2 * n;
			return sum;
		}
		
		
		
		public double areaOfSqu(int a)
		{
			double as = a * a;
			return as;
		}
		public double areaOfCircle(double r)
		{
			double  ac = 3.14*r*r;
			return ac;
		}
		public double areaOfCircumphOfCircle(double r)
		{
			double acs = 2*3.14*r;
			
			return acs;
		}

		public double areaOfTrap(double a, double b, double h)
		{
			double trap = 0.5*a+b*h;
			return trap;
		}
		
		public double areaOfRectangle(double l, double h, double b)
		{
			double ar = l*h*b;
			return ar;
		}

		
		
}
