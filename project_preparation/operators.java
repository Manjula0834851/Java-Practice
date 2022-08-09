package project_preparation;

public class operators {

	public static void main(String[] args) {
		int x=5;
		int y=8;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println(x*y);
		System.out.println(++x);
		System.out.println(--y);
		int z=x+y;
		System.out.println("Sum of x & y is "+z);
		
		
		
	    System.out.println(x != y);
	    System.out.println(x == y);
	    System.out.println(x >= y);
	    System.out.println(x <= y);
	    System.out.println(x > 3 && x < 10);
	    System.out.println(x > 3 || x < 10);
	    System.out.println(!(x > 3 && x < 10));
	}

}
