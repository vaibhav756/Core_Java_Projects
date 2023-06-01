package com;

public class HDFCBank implements RBIBank{
	
	public void moneyTransfer() {
		System.out.println("MoneyTransfered using HDFCBank...");
	}
	public void checkBalance() {
		System.out.println("Balanced checked using HDFCBank...");
	}

	public static void main(String[] args) {
		RBIBank hdfc=new HDFCBank();   //Interface can hold reference of child implementation class object
		hdfc.moneyTransfer();
		hdfc.checkBalance();
	}
}