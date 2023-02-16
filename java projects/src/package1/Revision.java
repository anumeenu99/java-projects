package package1;

public class Revision {
static int a=10,b=20; 
public static void main(String []args)
{
	Revision.add();
	Revision.sub();
	Revision.product();
	Revision.division();
}
public static void add()
{
	int sum=a+b;
	System.out.println("Sum="+sum);
}
public static void sub()
{
	int m=b-a;
	System.out.println("m="+m);
}
public static void product()
{
	int prod=a*b;
	System.out.println("prod="+prod);
}
public static void division()
{
	int quo=b/a;
	System.out.println("quo="+quo);
}
}
