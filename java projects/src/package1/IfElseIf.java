package package1;
import java.util.Scanner;
public class IfElseIf {
public static void main(String []args)
{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter your age ");
	int a=obj.nextInt();
	if(a>18)
	{
		System.out.println("you are eligible");
	}
	else if((a>0)&&(a<18))
			{
		System.out.println("not eligible");
			}
	else
	{
		System.out.println("enter valid number");
	}
}
}
