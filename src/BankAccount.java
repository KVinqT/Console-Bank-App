
public class BankAccount {
	private double balance;

	public void getBalance() {
		System.out.println("Your account's current balance is :" + "$" +this.balance);
	}

	public void deposit(double amount) {
		System.out.println("Depositing: " + "$" + amount);
		this.balance = this.balance + amount;
		System.out.println("You amount of " +"$"+ amount + " is successfully deposited");
	}

	public void withdraw(double amount) {
		System.out.println("Withdrawing: " + "$" + amount);
		if (balance >= amount) {
			this.balance = this.balance - amount;
			System.out.println("You amount of " + amount + " is successfully withdrawed");
		} else {
			System.out.println("The amount you want to withdraw is insufficient !");
		}
	}

}
