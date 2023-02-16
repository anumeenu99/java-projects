package package1;
import java.util.Scanner;
public class Mark {
	public static void main(String []args)
	{
		int mark;
		Scanner obj=new Scanner(System.in);
		System.out.print("enter your number: ");
		mark=obj.nextInt();
		
		if((mark>=40)&&(mark<64))
		{
			System.out.println("pass with grade:C");
		}
		else if((mark>=65)&&(mark<80))
		{
			System.out.println("pass with grade:B");
		}
		else if((mark>=80)&&(mark<90))
		{
			System.out.println("pass with grade:A+");
		}
		else if(mark>=90)
		{
			System.out.println("pass with grade:O");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
