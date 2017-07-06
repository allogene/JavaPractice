package com.doug;

public class Main {

    public static void main(String[] args) {

/*        account BankAccount = new account();//"123456",100000.00,"Doug Schiano", "doug@email.com","678-469-2232");
        System.out.println("Name: " + BankAccount.getCustomerName());
        System.out.println("Email: " + BankAccount.getEmail());


        BankAccount.deposit(1000.00);
        System.out.println("Balance = " + BankAccount.getBalance());

        BankAccount.withdrawl(100.99);
        System.out.println("Balance = " + BankAccount.getBalance());

        BankAccount.deposit(0);
        System.out.println("Balance = " + BankAccount.getBalance());

        BankAccount.withdrawl(900);
        System.out.println("Balance = " + BankAccount.getBalance());

        BankAccount.withdrawl(0);
        System.out.println("Balance = " + BankAccount.getBalance());

        account newaccount = new account("Doug","doug@email.com","1234567890");
        System.out.println("Customor: " + newaccount.getCustomerName() + " Email: " + newaccount.getEmail() + " Phone: " + newaccount.getPhoneNumber());
        */

        VIPCustomer newAccount = new VIPCustomer();
        System.out.println(newAccount.getName() + " " + newAccount.getCreditLine() + " " + newAccount.getEmail());

        VIPCustomer newAccount2 = new VIPCustomer("Joe Smith", "jsmith@email.com");
        System.out.println(newAccount2.getName() + " " + newAccount2.getCreditLine() + " " + newAccount2.getEmail());

        VIPCustomer newAccount3 = new VIPCustomer("Jane Smith", 100.00, "smithj@email.com");
        System.out.println(newAccount3.getName() + " " + newAccount3.getCreditLine() + " " + newAccount3.getEmail());
    }
}
