package package1;

public class Armstrong {
public static void main(String []args)
{
	int a=153,rem,rev=0;
	int temp=a;
	while(temp!=0)
	{
		rem=temp%10;
		rev=rev+(rem*rem*rem);
		temp=temp/10;
	}
	if(rev==a)
	{
		System.out.println("armstrong");
	}
	else
	{
		System.out.println("not armstrong");
	}
}
}
