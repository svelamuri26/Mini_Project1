package MiniProject_BankingSystem;

import java.util.Scanner;

class Customer implements Runnable {


    private BankBalance balance ;
    private double depositAmount;


    public Customer(BankBalance balance, double depositAmount ) {
        this.balance = balance;
        this.depositAmount = depositAmount;

    }


    @Override
    public void run() {

        System.out.println("Deposit Amount : €" + depositAmount);
        balance.deposit(depositAmount);
        System.out.println("New balance: €" + balance.getBalance());
    }
}