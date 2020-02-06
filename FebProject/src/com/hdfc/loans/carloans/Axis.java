package com.hdfc.loans.carloans;

public class Axis  implements Rbi 
{
	
	

	

	public static void main(String[] args) 
	{
		
		
		Axis i=new Axis();
		i.deposit();
		i.withdrawl();

	}

	
	@Override
	public void withdrawl() 
	{
		System.out.println("iam overridden withdrawl from AXIS ");
	}

	@Override
	public void deposit() 
	{
		System.out.println("iam overridden deposit from AXIS");
	}

}
