package String;

public class String8 {

	public static void main(String[] args) {
		String s1 = "My name is Khan. My name is Bob. My name is Sonoo.";
		// String replaceString=s1.replaceAll("is","was");
		String replaceString = s1.replace("n", "m");
		System.out.println(replaceString);
		System.out.println(s1.endsWith("n"));

	}

}
