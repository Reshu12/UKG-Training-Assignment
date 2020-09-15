package Day2assignmentQ3;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		String username;
		double initialBalance;
		String typeOfAccount;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter username");
		username = in.nextLine();
		System.out.println("Enter type of account");
		typeOfAccount = in.nextLine();
		if (typeOfAccount.equalsIgnoreCase("Saving")) {
			System.out.println("Enter initial balance >500");
			initialBalance = in.nextDouble();
			if (initialBalance < 500.0)
				initialBalance = 500.0;
			System.out.println("Enter maximum withdrawal limit");
			double max_limit = in.nextDouble();
			SavingAccount account = new SavingAccount(username, initialBalance, max_limit);
			System.out.println("Account created having account no. " + account.getAccountNumber());
			while (true) {
				System.out.println(
						"Welcome\n Choose the action to be performed \n 1. Deposit money \n 2. Withdraw money \n 3. Display balance of account \n 4. Press 0 to exit");
				int option = in.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter amount to be deposited");
					double money = in.nextDouble();
					account.deposit(money);
					System.out.println("new balance = " + account.getAccountBalance());
					break;
				case 2:
					System.out.println("Enter amount to be withdrawn");
					double withdraw_money = in.nextDouble();
					if (account.getAccountBalance() > withdraw_money)
						account.withdraw(withdraw_money);
					break;
				case 3:
					System.out.println("Account balance");
					account.getAccountBalance();
					break;
				case 0:
					return;
				}
			}
		} else if (typeOfAccount.equalsIgnoreCase("Current")) {
			System.out.println("Enter trade licence number");
			String tradeLicenceNumber = in.nextLine();
			System.out.println("Enter initial balance >500");
			initialBalance = in.nextDouble();
			if (initialBalance < 500.0)
				initialBalance = 500.0;
			CurrentAccount account = new CurrentAccount(username, initialBalance, tradeLicenceNumber);
			System.out.println("Account created having account no. " + account.getAccountNumber());
			while (true) {
				System.out.println(
						"Welcome\n Choose the action to be performed \n 1. Deposit money \n 2. Withdraw money \n 3. Display balance of account \n 4. Press 0 to exit");
				int option = in.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter amount to be deposited");
					double money = in.nextDouble();
					account.deposit(money);
					System.out.println("new balance = " + account.getAccountBalance());
					break;
				case 2:
					System.out.println("Enter amount to be withdrawn");
					double withdraw_money = in.nextDouble();
					if (account.getAccountBalance() > withdraw_money)
						account.withdraw(withdraw_money);
					break;
				case 3:
					System.out.println("Account balance");
					account.getAccountBalance();
					break;
				case 0:
					return;
				}
			}
		} else
			System.out.println("Wrong input account type");
	}
}
