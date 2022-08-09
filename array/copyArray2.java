package array;
import java.util.Arrays;
public class copyArray2 {
		public static void main(String[] args) {
		String[] array= new String[] { "First","Second","Third","Fourth"};
		System.out.println(array.toString());
		System.out.println(Arrays.toString(array));
		array[0]="Last";
		System.out.println(Arrays.toString(array));
		

	}

}
