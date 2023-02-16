package package1;

public class StringEx {
	public static void main(String []args)
	{
		String a="good";
		String b="morning";
		System.out.println(a.length());
		System.out.println(a.charAt(3));
		System.out.println(a.indexOf(0));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.equals(b));
		StringBuilder sb=new StringBuilder(b);
		StringBuilder z=sb.append("guys");
		System.out.println(z);
		StringBuilder y=sb.reverse();
		System.out.println(y);
		
	}
}
