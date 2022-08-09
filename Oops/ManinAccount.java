package Oops;

class Accounts {
	int actno = 12345;
	String name = "Dinga";
	String branch = "basvangudi";
	double balance = 5000;
	String type = "Savings";
	static String bankName = "ICICi";

	public void deposit(int amt) {
		balance = balance + amt;
	}

	public void withdraw(int amt) {
		balance = balance - amt;
	}

	public void checkBalance() {
		System.out.println(" Avaialable balance " + balance);
	}

	public void showAccount() {
		System.out.println("act no = " + actno);
		System.out.println("name = " + name);
		System.out.println("brnch = " + branch);
		System.out.println("balance = " + balance);
		System.out.println("acount type = " + type);
		System.out.println("acount type = " + bankName);
	}
}

class ManinAccount {
	public static void main(String ar[]) {
		Accounts a1 = new Accounts();
		a1.checkBalance();
		System.out.println();
		a1.deposit(5000);
		a1.checkBalance();
		System.out.println();
		a1.withdraw(2000);
		System.out.println();
		a1.checkBalance();
		a1.showAccount();
	}
}
