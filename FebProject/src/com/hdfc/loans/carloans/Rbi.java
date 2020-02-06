package com.hdfc.loans.carloans;

public interface Rbi
{
	public abstract void withdrawl();
	public abstract void deposit();
	
	public static void main(String[] args) {
		
		Rbi r=new Axis();
		r.deposit();
		r.withdrawl();
		
		
		Rbi r1=new Icici();
		r1.deposit();
		r1.withdrawl();
		
	}
}