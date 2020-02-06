package com.hdfc.loans.carloans;

public class ThirdClass 
{
		
	//data -- properties(data variable)
	//Operation -- behavior(method)

	int a=10,b=20,c; // properties
		

	public void add()
	{
		c=a+b;
		System.out.println("Addition of A & B is : " + c);
	}
		
	public void sub() 
	{
		c=a-b;
		System.out.println("Substration of A & B is :" + c);
	}
	
	public static void main(String[] args)
	{
		System.out.println("hi");
		ThirdClass obj=new ThirdClass();
		obj.add();
		obj.sub();
		System.out.println(obj.c);
	}
	

}
