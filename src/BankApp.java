import java.util.Scanner;

public class BankApp {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		launch(bankAccount);
		displayMessage("-----------------------------------");
		displayMessage("Thanks for using our banking system");
	}

	public static void launch(BankAccount bankAccount) {
		displayMessage("Welcome from our banking system");
		displayMessage("-------------------------------");
		boolean reRun = true;
		do {
			displayMessage("Please choose operation what you want to do: \n 1.deposit \n 2.withdraw \n 3.get balance");
			byte operation = scanner.nextByte();
			switch (operation) {
			case 1 -> {
				System.out.print("Please Enter a deposit amount: ");
				double amount = scanner.nextDouble();
				bankAccount.deposit(amount);
			}
			case 2 -> {
				System.out.print("Please Enter a withdraw amount: ");
				double amount = scanner.nextDouble();
				bankAccount.withdraw(amount);
			}
			case 3 -> bankAccount.getBalance();

			default -> displayMessage("Invalid Operaion !");

			}
			reRun = reRun();
		} while (reRun);
	}

	public static void displayMessage(String messsage) {
		System.out.println(messsage);
	}

	public static boolean reRun() {
		System.out.print("Do u want to  operate again? y(yes)/n(no): ");
		String reOperate = scanner.next();
		if (reOperate.equalsIgnoreCase("y")) {
			return true;
		} else if (reOperate.equalsIgnoreCase("n")) {
			return false;
		} else {
			displayMessage("Invalid input");
			return reRun();
		}
	}
}
