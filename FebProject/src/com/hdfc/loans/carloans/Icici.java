package com.hdfc.loans.carloans;

public class Icici implements Rbi
{

	public static void main(String[] args) 
	{
		Icici i=new Icici();
		i.deposit();
		i.withdrawl();
	}
	

	@Override
	public void withdrawl() 
	{
		System.out.println("iam overridden withdrawl from rbi ");
	}

	@Override
	public void deposit() 
	{
		System.out.println("iam overridden deposit from rbi");
	}
}