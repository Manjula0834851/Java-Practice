package Oops;

public class Demo2 {

	double k1=123.45;
	public void count()
	{
	System.out.println("this is view() of Demo");
	}}
	class Demo4
	{
	public static void main(String[] args)
	{
	System.out.println("Program Strts ");
	System.out.println("k1 = " + new Demo2().k1);
	new Demo2().count();
	System.out.println("Progrm end " );
	}
	}