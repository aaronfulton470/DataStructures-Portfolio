
/*BankAccount class represents a simple bank account
 * Part of CSCI 2302 Curriculum
 * Author: Aaron Fulton
 * Date: November 2, 2025
 */

public class BankAccount {

        public static void main(String[] args) {
        

        //Create two BankAccount objects
        BankAccount accountOne = new BankAccount("12345", "Alice", 1000.0);
        BankAccount accountTwo = new BankAccount("67890", "Bob", 500.0);
        
        //Display initial account details
        System.out.println(accountOne.toString());
        System.out.println(accountTwo.toString());  
}

        //Private attributes
        private String accountNumber;
        private double balance;
        private String ownerName;


    //Constructor
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;      
    }
    //Getters and Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    //Methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Amount to add should be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    @Override
    public String toString() {
        return "BankAccount " + accountNumber + " is owned by " + ownerName + " with balance: $" + balance;
    }
        
}



