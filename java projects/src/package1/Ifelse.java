package package1;
import java.util.Scanner;
public class Ifelse {
public static void main(String []args)
{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter your age");
	int a=obj.nextInt();
	if(a>18)
	{
		System.out.println("you are eligible");
	}
	else
	{
		System.out.println("you are not eligible");
	}
}
}
