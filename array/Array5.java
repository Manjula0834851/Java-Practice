package array;
import java.util.Arrays;   
import java.util.Collections;

public class Array5 {

	public static void main(String[] args) {
		String [] strarray = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};   
		 
		Arrays.sort(strarray, Collections.reverseOrder());   
		System.out.println("Array elements in descending order: " +Arrays.toString(strarray));

	}

}
