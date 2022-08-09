package array;
import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {
		String [] names= new String[] {"Neha", "Nayana", "Bhavana", "Shweta"};
		Arrays.sort(names);
		System.out.println("Alpha:"+Arrays.toString(names));
		names[1]= "Shreya";
		System.out.println("after changes:"+Arrays.toString(names));
		

	}

}
