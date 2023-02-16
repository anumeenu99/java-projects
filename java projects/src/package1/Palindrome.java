package package1;

public class Palindrome {
	public static void main(String []args)
	{
		int num=121;
		int temp=num;
		int rev=0,rem;
		System.out.print("num= "+num);
		
		while(num>0)
		{
		rem=num%10;
		rev=(0*10)+rem;
		num=num/10;
		System.out.println(rev);
		
		}
		if(temp==rev)
		{
			System.out.println("number is palindrome ");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
		
		
	}
}
