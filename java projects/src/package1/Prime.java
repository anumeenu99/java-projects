package package1;
import java.util.Scanner;
public class Prime {
	public static void main(String []args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your number= ");
		
		int num=obj.nextInt();;
		int i,count=0;
		for(i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
}
