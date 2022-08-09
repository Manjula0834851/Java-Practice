package inheritance;

abstract class Super {
	abstract public void test();
}

abstract class Sub extends Super {
}

class ab extends Sub {
	public void test() {
		System.out.println("this is test()");
	}
}

class practice {
	public static void main(String[] args) {
		ab a = new ab();
		a.test();
	}
}
