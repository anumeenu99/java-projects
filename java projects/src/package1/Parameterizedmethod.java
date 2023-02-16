package package1;

public class Parameterizedmethod {
	public static void main(String []args)
	{
		Parameterizedmethod.add(5,8);
	}
	public static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum= "+sum); // without return type
	}
}
