package inheritance;

class Account {
	public void createAccount() {
		System.out.println("Your account is created");
	}
}

class SavingAcnt extends Account {
	public void showSavings() {
		System.out.println("Your saving account is 2000");
	}
}

class LoanAcnt extends Account {
	public void showLoan() {
		System.out.println("Your pending loan is 3000");
	}
}

class HierarchialInheritance {
	public static void main(String[] args) {
		LoanAcnt l = new LoanAcnt();
		l.createAccount();
		l.showLoan();
		SavingAcnt s = new SavingAcnt();
		s.createAccount();
		s.showSavings();
	}
}