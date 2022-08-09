package Oops;

public class Reference {
	Demo r1 = new Demo();
	Demo r2 = r1;
	public static void main(String[]args) {
		Reference r = new Reference(); 
		Reference r2=r;
		System.out.println( " Address of Variable r = " +r);
		System.out.println( " Address of Variable r1 = " +r2);
	}

}
