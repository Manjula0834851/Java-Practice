package Oops;

public class RefVariable {
	
	public RefVariable() {
		
	}
	static int s = 20;
	int a=23;

	public static void main(String[] args) {

		RefVariable a1 = new RefVariable();
		System.out.println("value of s = " + s);
		a1.a=55;
		System.out.println("value of a = " + a1.a);
		a1.a=52;
		System.out.println("value of a1 = " + a1.a);
		
		RefVariable r1 = new RefVariable();
		System.out.println(" Address of Variable r = " + r1);
		r1.s = 30;
		System.out.println(" Value of r1 = " + r1.s);
		RefVariable r2 = r1;
		System.out.println(" Value of r2 = " + r2.s);

	}

}
