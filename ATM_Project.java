package ATM_Java_Project;

import java.util.Scanner;

public class ATM_Project {
    public static void main(String[] args) {
        int balance = 100000, withdraw, deposit;
        Scanner s = new Scanner(System.in);


        while(true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for check balance");
            System.out.println("Choose 4 for Exit");
            System.out.println("Choose the operation you want to perform from above : ");

            int choice = s.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter money to be withdraw : ");
                    withdraw = s.nextInt();
                    if(balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter money to be deposited : ");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
