package String;

public class String5 {

	public static void main(String[] args) {
		String name = "Nitin";
		Boolean flag = true;
		name = name.toLowerCase();
		for (int i = 0; i < name.length() / 2; i++) {
			if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not a palindrome");

	}

}
