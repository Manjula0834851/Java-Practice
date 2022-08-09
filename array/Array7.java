package array;
import java.util.Arrays;
public class Array7 {

	public static void main(String[] args) {
		int [] roll= {9, 8, 7, 6, 5, 4, 3, 2};
		
		System.out.println("Roll no unsorted:" + Arrays.toString(roll));
		Arrays.sort(roll);
		System.out.println("Roll no sorted:" + Arrays.toString(roll));
		

	}

}
