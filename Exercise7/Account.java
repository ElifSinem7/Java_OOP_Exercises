package Exercise7;

public class Account {
	private String name;
	private String accountNumber;
	private double balance;

	public Account(String name, String accountNumber, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
		}
		else {
			System.out.println("There is not enough money to withdraw.");
		}
	}

	public static void main(String[] args) {
		Account account1 = new Account("Peter Irmgard", "C0011", 5000);
		Account account2 = new Account("Katja Ruedi", "C0121", 4500);
		Account account3 = new Account("Marcella Gebhard", "C0222", 20000);
		
		System.out.println("***** Account Informations *****");
		System.out.println("First Account: \nName: " + account1.getName() + "\nAccount number: " + account1.getAccountNumber() + "\nBalance: " + account1.getBalance());
		System.out.println("\nSecond Account: \nName: " + account2.getName() + "\nAccount number: " + account2.getAccountNumber() + "\nBalance: " + account2.getBalance());
		System.out.println("\nThird Account: \nName: " + account3.getName() + "\nAccount number: " + account3.getAccountNumber() + "\nBalance: " + account3.getBalance());
		
		account1.deposit(1550);
		account2.withdraw(5000);
		account3.withdraw(1300);
		
		System.out.println("\nAccounts' new balances: ");
		System.out.println("First account's balance: " + account1.getBalance() + "\nSecond account's balance: " + account2.getBalance() + "\nThird account's balance: " + account3.getBalance());

	}

}
