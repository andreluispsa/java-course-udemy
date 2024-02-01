package orientacaoObjetoConta.application;

import orientacaoObjetoConta.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Account account;
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holderName = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n)? ");
        char isInitialDeposit = sc.next().charAt(0);
        if (isInitialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holderName, initialDeposit);
        } else {
            account = new Account(number, holderName);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Updated account data: ");
        System.out.println(account);


        sc.close();

    }
}
