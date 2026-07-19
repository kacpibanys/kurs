package com.example.task_08_exceptions;

public class Task3 {
    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String msg) { super(msg); }
    }

    static final class BankAccount {
        private int balance;
        public BankAccount(int initial) { this.balance = initial; }

        public void withdraw(int amount) throws InsufficientFundsException {
            // TODO: gdy amount > balance -> throw new InsufficientFundsException(...)
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds! Balance: " + balance + " amount to withdraw: " + amount);
            }
            // w p.p. zmniejsz balance
            balance -= amount;
        }
    }

    static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(20);
        try {
            System.out.println("Withdraw start");
            bankAccount.withdraw(10);
            System.out.println("Withdraw successful");

        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Withdraw end");
        }
    }
}
