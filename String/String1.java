package String;

public class String1 {

	public static void main(String[] args) {
		String sent="Here is the book, please take it";
		int count=0;
		for (int i=0; i<sent.length();i++) {
			if (sent.charAt(i)!=' ')
				count++;
		}
		System.out.println("No of Elements in the given sentence is:"+count);

	}

}
