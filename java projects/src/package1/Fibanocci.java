package package1;
import java.util.Scanner;
public class Fibanocci {
public static void main(String []args)
{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter your n1,n2 numbers:");
	int n1=obj.nextInt();
	int n2=obj.nextInt();
	for(int i=0;i<=10;i++)
	{
		int n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
	}
}
}
