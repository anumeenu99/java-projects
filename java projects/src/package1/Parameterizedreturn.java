package package1;

public class Parameterizedreturn {
	public static void main(String []args)
	{
		Parameterizedreturn.add(5,8);
	}
	public static int add(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum= "+sum);		// with return type
		return sum;
		
	}
}
