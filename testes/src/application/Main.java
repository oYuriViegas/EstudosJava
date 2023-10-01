package application;

import entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account;

        int number;
        System.out.print("Enter account number: ");
        number = sc.nextInt();
        sc.nextLine(); // clean buffer

        String holder;
        System.out.print("Enter account holder: ");
        holder = sc.nextLine();

        char answer;
        System.out.print("Is there an initial deposit (y/n)? ");
        answer = sc.next().charAt(0);

        if (answer == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            sc.nextLine(); // clean buffer
            account = new Account(number, holder, initialDeposit);
        }
        else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        double value;
        System.out.print("Enter a deposit value: ");
        value = sc.nextDouble();
        sc.nextLine();// clean buffer
        account.deposit(value);

        System.out.println();
        System.out.println("Update account data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        sc.nextLine();// clean buffer
        account.withdraw(value);

        System.out.println("Update account data:");
        System.out.println(account);

        sc.close();
    }
}