package methods;

public class METHOD {

	public static void main(String[] args) {
		class Addition {
			public int add(int a, int b) {

				int sum = a + b;
				return sum;
			}

			public int add(int a, int b, int c) {

				int sum = a + b + c;
				return sum;
			}
		}

		Addition ob = new Addition();
		int sum1 = ob.add(1, 2);
		System.out.println("sum of the two integer value :" + sum1);
		int sum2 = ob.add(1, 2, 3);
		System.out.println("sum of the three integer value :" + sum2);

	}

}
