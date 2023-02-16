package package1;
import java.util.Scanner;
public class Assignment2 {
	static int l,b,a;
	static double r; 
public static void main(String []args)
{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter your option:");
	System.out.println("1.Area of circle");
	System.out.println("1.Area of rectangle");
	System.out.println("1.Area of square");
	int a=obj.nextInt();
	if(a==1)
	{
		Assignment2.circle();
	}
	else if(a==2)
	{
		Assignment2.rectangle();
	}
	else if(a==3)
	{
		Assignment2.square();
	}
	else
	{
		System.out.println("invalid option");
	}
}
	public static void circle()
	{
		System.out.println("enter your radius value: ");
		Scanner obj1=new Scanner(System.in);
		r=obj1.nextDouble();
		double area1=3.14*r*r;
		System.out.println("are of circle= "+area1);
	}
	public static void rectangle()
	{
		System.out.println("enter your length and breadth values: ");
		Scanner obj2=new Scanner(System.in);
		l=obj2.nextInt();
		b=obj2.nextInt();
		int area2=l*b;
		System.out.println("are of rectangle= "+area2);
	}
	public static void square()
	{
		System.out.println("enter your side value: ");
		Scanner obj3=new Scanner(System.in);
		a=obj3.nextInt();
		int area3=a*a;
		System.out.println("are of square= "+area3);
	}
}
