package inheritance;

interface AccountNo {
	public void deposit();

	public void withdraw();
}

class Saving implements AccountNo {
	public void deposit() {
		System.out.println("Money is deposit in saving account");
	}

	public void withdraw() {
		System.out.println("money is withdraw from saving account");
	}
}

class Fd implements AccountNo {
	public void deposit() {
		System.out.println("money is deposit in FD account");
	}

	public void withdraw() {
		System.out.println("money is withdraw from FD account");
	}
}

class AcntMgr {
	public static AccountNo createAcnt(char type) {
		AccountNo a1;
		if (type == 'S') {
			a1 = new Saving();
			return a1;
		} else {
			a1 = new Fd();
			return a1;
		}
	}
}

class Mainclass1 {
	public static void main(String[] args) {
		AccountNo a1 = AcntMgr.createAcnt('S');
		a1.deposit();
		a1.withdraw();
	}
}