package package1;
import java.util.Scanner;
public class Switch {
	public static void main(String []args)
	{
	int week;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter your number");
	week=obj.nextInt();
	switch(week)
	{
	case 1:
	{
	System.out.println("sunday");
	break;
	}
	case 2:
	{
	System.out.println("Monday");
	break;
	}
	case 3:
	{
	System.out.println("Tuesday");
	break;
	}
	default:
	{
		System.out.println("enter your valid number");
	}
	}
	}
}
