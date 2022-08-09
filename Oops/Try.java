package Oops;

public class Try {

		int z1=123;
		public void view()
		{
		System.out.println("this is view() of Try");
		System.out.println("value of a = " + z1);
		}
		public static void main(String[] args)
		{
		System.out.println("Z1 = " + new Try().z1);
		new Try().view();
		}}
