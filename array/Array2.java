package array;

public class Array2 {

	
		public static void printNum(int[] a1)
		{
		int first=0;
		int last=a1.length-1;
		int mid=last/2;
		System.out.println( "first = " +a1[first]);
		System.out.println( "Last = " +a1[last]);
		System.out.println(
		"mid = " +a1[mid]);
		}
		public static void main (String ar[])
		{
		int num[]={5,1,2,3,5};
		printNum(num);
		

	}

}
