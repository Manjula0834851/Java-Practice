package Oops;

public class mathoperations {

	public static void main(String[] args) {
		int x = 5;
		int y = 8;
		int z = 10;
		System.out.println(Math.max(z, (Math.max(x, y))));
		System.out.println(Math.min(x, y));
		System.out.println(Math.sqrt(z));
		System.out.println(Math.abs(-4.7));
		int randomNum = (int) (Math.random() * 101);
		System.out.println(randomNum);

		System.out.println(x == 10);
		System.out.println(x < 10);
		System.out.println(x < y);
		System.out.println(x == y);
	}

}
