package String;

public class Strings5 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s5 = "hello";
		String s6="Barefoot";
		String s3 = "me";
		
		String sub=s6.substring(0,4);
		String sub1=s6.substring(1,4);
		String sub2= s6.substring(2,3) + s6.substring(5,7) + s6.substring(4,5) ;

		s1 = s1.concat("Everyone");
		String s4 = s1.concat(s3);
		String se1 = String.format("name is %s", s5);

		System.out.println(s1.compareTo(s5));
		System.out.println(s5);
		System.out.println(s4);
		System.out.println(s1.contains("l"));
		System.out.printf(se1);
		System.out.println(s3);
		System.out.println("Subbstring of" + s6 +" is : "+sub);
		System.out.println("Subbstring of" + s6 +" is : "+sub1);
		System.out.println("Subbstring of" + s6 +" is : "+sub2);
	}

}
