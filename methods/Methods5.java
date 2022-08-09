package methods;

public class Methods5 {
	public static double prod(int a, int b, int c) {
		int d = a * b * c;
		System.out.println("Multiplication of a,b,&c=" + d);
		return d;

	}

	static double div(int e, int f, int g) {
		int x = e / f / g;
		System.out.println(+x);
		return x;
	}

	static void add(int e, int f, int g) {
		int y = e + f + g;
		System.out.println("Addion of given no is" + y);
	}
	
	  static void sub(int a, int b, int c) { int z=a-b-c;
	  System.out.println("subtraction of given no is"+z); }
	 

	public static void main(String[] args) {
		 new Methods5();
		System.out.println(Methods5.prod(5, 5, 5));
		div(15, 3, 4);
		add(3, 4, 5);

	}

}
