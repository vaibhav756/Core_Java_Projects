package com;

public class SBIBank implements RBIBank{

	public void moneyTransfer() {
		System.out.println("Money transfered using SBIBank...");	
	}
	public void checkBalance() {
	    System.out.println("Balance check using SBIBank...");		
	}
	
	public static void main(String[] args) {
		RBIBank sbi=new SBIBank();
		sbi.moneyTransfer();
		sbi.checkBalance();
		
	}
}
