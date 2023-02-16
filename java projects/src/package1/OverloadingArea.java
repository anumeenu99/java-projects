package package1;

public class OverloadingArea {
	public static void main(String []args)
	{
		OverloadingArea.area(4.02);
		OverloadingArea.area(4,2);
		OverloadingArea.area(4);
	}
	public static void area(double r)
	{
		double circle=3.14*(r*r);
		System.out.println("area of circle= "+circle);
	}
	public static void area(int l,int b)
	{
		int rectangle=l*b;
		System.out.println("area of rectangle= "+rectangle);
	}
	public static void area(int a)
	{
		int square=(a*a);
		System.out.println("area of square= "+square);
	}
}
