package Polymorphism;

class Superclass5 {
	public  void disp() {
		System.out.println("this is disp method of superclass");
	}
}

class Subclass extends Superclass5 {

	public void disp() {
		System.out.println("This is disp() method of subclass");
	}
}

class MainOverride {
	public static void main(String[] args) {
		Superclass5 s1 = new Superclass5();
		s1.disp();
		Subclass s2 = new Subclass();
		s2.disp();
	}

}
