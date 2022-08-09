package loops;

import java.util.Scanner;

public class Looping4 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of rows: ");
			int n=sc.nextInt();	
			int i=1;
			int j;
			while(i <= n)
			{
				j = 1;
				while(j <= n)
				{
					System.out.print("*"); 
					j++;
				}
				i++;
				System.out.print("\n"); 
			}
		}	     
		
		
		
    }

}
