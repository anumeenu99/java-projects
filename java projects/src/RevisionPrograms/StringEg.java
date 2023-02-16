package RevisionPrograms;

public class StringEg {
public static void main(String []args) {
	String a="Good";
	String b= "Morning";
	System.out.println(a.length());
	System.out.println(a.charAt(0));
	System.out.println(a.indexOf('d'));
	System.out.println(a.equals(b));
	System.out.println(a.toUpperCase());
	StringBuilder sb=new StringBuilder(b);
	StringBuilder c=sb.append("Have a nice day");
	System.out.println(c);
}
}
