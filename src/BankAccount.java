
public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		if (initialBalance > 0) {
			this.balance = initialBalance;
		} 
	}

	public double getBalance() {
		return this.balance;
	}

	public void deposit(double amount) {
		System.out.println("Depositing: "+ "$"+ amount);
		this.balance = this.balance + amount;
	}

	public void withdraw(double amount) {
		System.out.println("Withdrawing: "+ "$"+ amount);
		if (balance >= amount) {
			this.balance = this.balance - amount;
		} else {
			System.out.println("The amount you want to withdraw is insufficient !");
		}
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		if(account.balance > 0) {
			System.out.println("Opening Balance: " + "$" + account.getBalance());
			account.deposit(500);
			System.out.println("New Balance: " + "$" + account.getBalance());
			account.withdraw(2000);
			System.out.println("New Balance: " + "$" + account.getBalance());
		} else {
			System.out.println("The initial Balance can't be negative value");
		}
	}

}
