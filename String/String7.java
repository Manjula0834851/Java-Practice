package String;
import java.util.Scanner;
public class String7 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String sentence = obj.nextLine();
        sentence = sentence.replaceAll("t", "d");
        System.out.println("Text after removing spaces: " + sentence);

	}

}
