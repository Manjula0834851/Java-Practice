package Oops;

public class Constant {
	
	final double PI=3.142;
	public void area1 (int a)
	{
	double ar= PI*a*a;
	System.out.println("Area of 1st Circle" + ar);
	}public void area2 (int a)
	{
	double ar= PI*a*a;
	System.out.println("Area of 1st Circle" + ar);
	}
	public static void main(String[] args)
	{
	Constant c=new Constant();
	c.area1(5);
	c.area2(10);
	}
	

}
