package methods;

public class Methods1 {
	public static double calcArea(int a, int b, int c)
	{
	double avg;
	avg=(a+b+c)/3;
	return avg;
	}

	public static void main(String[] args) {
		
		double res=calcArea(10,20,30);
		System.out.println("res is"+ res*2);
		double res1=calcArea(20,10,30);
		System.out.println("res1 is"+res1*0.3);
		
	}

}
