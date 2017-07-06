package com.doug;

/**
 * Created by Acer on 4/28/2017.
 */
public class VIPCustomer {
    private String name;
    private double creditLine;
    private String email;

    public VIPCustomer() {
        this("Deafult Name", 200.00,"default@email.com");
    }

    public VIPCustomer(String name, String email) {
        this(name, 1000.00, email);
    }

    public VIPCustomer(String name, double creditLine, String email) {
        this.name = name;
        this.creditLine = creditLine;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
       return email;
    }

    public double getCreditLine() {
        return creditLine;
    }
}
