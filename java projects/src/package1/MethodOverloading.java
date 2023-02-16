package package1;

public class MethodOverloading {
	public static void main(String []args)
	{
		MethodOverloading.average(10,20,30);
		MethodOverloading.average(10.0f,20.0f,30.0f);
	}
	public static void average(int a,int b,int c)
	{
		int average=(a+b+c)/3;
		System.out.println("average= "+average);
	}
	public static void average(float z,float y,float x)
	{
		float w=(z+y+x)/3;
		System.out.println("float average= "+w);
	}
}
