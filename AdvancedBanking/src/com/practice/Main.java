package com.practice;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    private static double[] balance = {0.0, 0.0};

    public static void main(String[] args) {
        int option = 1;
        double deposit;
        double withdraw;
        //Ask the user which bank account they would like to access
        while (option != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please select a Bank account: Checking (1), Savings (2), Terminate (0): ");
            option = scanner.nextInt();
            //If Checking account is selected
            if (option == 1) {
                Scanner scanner4 = new Scanner(System.in);
                System.out.print("Please select an operation: Deposit (1), Withdraw (2), Check Checking Balance (3), Terminate (0): ");
                int option2 = scanner4.nextInt();

                if (option2 == 1) {
                    //Asks the user how much they would like to deposit
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("Please enter the amount you would like to Deposit: (Example format: 16.32 = $16.32): ");
                    deposit = scanner2.nextDouble();
                    if (deposit < 1.00) {
                        System.out.println("You must deposit at least $1, please try again");
                    } else {
                        balance[0] = balance[0] + deposit;
                        System.out.println("Deposit Successful");
                    }
                }
                if (option2 == 2) {
                    //Asks the user how much they would like to withdraw
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.print("Please enter the amount you like to Withdraw: (Example format: 17.55 = $17.55): ");
                    withdraw = scanner3.nextDouble();
                    if (withdraw > balance[0]) {
                        System.out.println("You do not have enough balance to withdraw this amount, please try again.");
                    } else {
                        balance[0] = balance[0] - withdraw;
                        System.out.println("Withdraw Successful");
                    }
                }
                //Displays the Checking balance to the user
                if (option2 == 3) {
                    String currency = NumberFormat.getCurrencyInstance().format(balance[0]);
                    System.out.println("Your current Checking balance is " + currency);
                }
            }

            //If Savings account is selected
            if (option == 2) {
                Scanner scanner5 = new Scanner(System.in);
                System.out.print("Please select an operation: Deposit (1), Withdraw (2), Check Checking Balance (3), Terminate (0): ");
                int option3 = scanner5.nextInt();

                if (option3 == 1) {
                    //Asks the user how much they would like to deposit
                    Scanner scanner6 = new Scanner(System.in);
                    System.out.print("Please enter the amount you would like to Deposit: (Example format: 16.32 = $16.32): ");
                    deposit = scanner6.nextDouble();
                    if (deposit < 1.00) {
                        System.out.println("You must deposit at least $1, please try again");
                    } else {
                        balance[1] = balance[1] + deposit;
                        System.out.println("Deposit Successful");
                    }
                }
                if (option3 == 2) {
                    //Asks the user how much they would like to withdraw
                    Scanner scanner7 = new Scanner(System.in);
                    System.out.print("Please enter the amount you like to Withdraw: (Example format: 17.55 = $17.55): ");
                    withdraw = scanner7.nextDouble();
                    if (withdraw > balance[1]) {
                        System.out.println("You do not have enough balance to withdraw this amount, please try again.");
                    } else {
                        balance[1] = balance[1] - withdraw;
                        System.out.println("Withdraw Successful");
                    }

                }
                //Displays the Savings balance to the user
                if (option3 == 3) {
                    String currency = NumberFormat.getCurrencyInstance().format(balance[1]);
                    System.out.println("Your current Savings balance is " + currency);
                }
            }
        }
    }
}




