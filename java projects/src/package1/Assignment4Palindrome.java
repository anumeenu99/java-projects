package package1;

public class Assignment4Palindrome {
	String a;
	
	public static void main(String []args)
	{
		Assignment4Palindrome obj=new Assignment4Palindrome("java");
		obj.palindrome();
		Assignment4Palindrome obj1=new Assignment4Palindrome("malayalam");
		obj1.palindrome();
	}
	public void palindrome()
	{
		String arev="";
		int length=a.length();
		for(int i=(length-1);i>=0;i--)
		{
			char c=a.charAt(i);
			arev=arev+c;
		}
		System.out.println("String is:"+a);
		System.out.println("Reversed string is: "+arev);
		if (a.equalsIgnoreCase(arev)==true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not Palindrome");
		}
		
	}
	Assignment4Palindrome(String z)
	{
		a=z;	
	}
}
