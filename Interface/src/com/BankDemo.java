package com;

public class BankDemo {

	public static void main(String[] args) {

		RBIBank bank;
		bank=new SBIBank();
		bank.checkBalance();
		bank.moneyTransfer();
		System.out.println("======================================");
		bank=new HDFCBank();
		bank.checkBalance();
		bank.moneyTransfer();
		System.out.println("======================================");
	}

}
