package String;

public class Strings {

	public static void main(String[] args) {
		int count = 0;
		String myName = "ManjulaNayak";
		myName = myName.toUpperCase();
		for (int i = 0; i < myName.length(); i++)
			if (myName.charAt(i) == 'A') {
				count++;
			}
		System.out.println("No of times A in my name:" + count);

	}

}
