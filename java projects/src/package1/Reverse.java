package package1;

public class Reverse {
	public static void main(String []args)
	{
		int num=123,rem,rev;
		System.out.println(num);
		for(;num!=0;)
		{
			rem=num%10;
			rev=(0*10)+rem;
			num=num/10;
			System.out.print(rev);
		}
	}
}
