package String;

public class String6 {

	public static void main(String[] args) {
		String str = "123";
		  int i = Integer.parseInt(str);
		  System.out.println(str + 50); 
		  System.out.println(i + 50); 
		  
		  
		  char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		  String s=new String(ch); 
		  System.out.println(ch); 
		  String str4=str.concat(s);
		  System.out.println(str4);
		  
		  System.out.println(str+s);

	}

}
