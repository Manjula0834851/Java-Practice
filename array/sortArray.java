package array;
import java.util.Arrays;
import java.util.Collections;

public class sortArray {

	public static void main(String[] args) {
		Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};     
		//Arrays.sort(array);
		//System.out.println("Array elements in descending order: " +Arrays.toString(array));   
		//Arrays.sort(array, 0,11);
		//System.out.println("Array elements from 9-1: " +Arrays.toString(array)); 
		Arrays.sort(array, Collections.reverseOrder());
		System.out.printf("Modifier:%s",Arrays.toString(array));
		
	}

}
