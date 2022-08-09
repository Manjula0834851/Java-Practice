package Polymorphism;

class SuperClass {
	public void view() {
		System.out.println("This is view() of SuperClass");
	}

	public void disp() {
		System.out.println("This is display() of SuperClass");
	}
}

class Subclass5 extends SuperClass {
	public void view() {
		super.view();
		System.out.println("this is the view() of Subclass");
	}

	public void disp(int n)
	{
	System.out.println("this is the disp(int n) ofsubclass");
	}
}

class SuperClassOverride {
	public static void main(String[] args) {
		Subclass5 ref1 = new Subclass5();
		ref1.view();
		ref1.disp();
		ref1.disp(10);
	}
}
