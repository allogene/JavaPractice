package com.doug;

/**
 * Created by Acer on 4/25/2017.
 */
public class account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public account(){
        this("67889", 909.99, "Default Name","email@email.com", "678-111-11111");
        System.out.println("Empty constructor called");
    }

    public account(String customerName, String email, String phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public account(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private void setBalance(double balanace) {
        this.balance = balanace;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
       return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void deposit(double amount){
        if(amount > 0){
            setBalance((getBalance() + amount));
            System.out.println("$" + amount + " deposited.");
            System.out.println("New Balance = " + getBalance());
        }
    }

    public void withdrawl(double amount){
        if((amount > 0) && (getBalance() > 0)){
            if ((getBalance() - amount) >0) {
                setBalance((getBalance() - amount));
                System.out.println("$" + amount + " withdrawn.");
                System.out.println("New Balance = " + getBalance());
            }else{
                System.out.println("Insufficient Funds.");}

        }
    }
}
