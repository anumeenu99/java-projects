package package1;
import java.util.Scanner;
public class Banking {
static int b=5000;
public static void main(String []args)
{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter your option:");
	System.out.println("1.deposit");
	System.out.println("2.withdrawal");
	System.out.println("3.balance");
	int a=obj.nextInt();
	if(a==1)
	{
		Banking.deposit();
	}
	else if(a==2)
	{
		Banking.withdrawal();
	}
	else if(a==3)
	{
		Banking.balance();
	}
	else
	{
		System.out.println("invalid option");
	}
}
public static void deposit()
{
	System.out.print("enter your deposit amount:");
	Scanner obj1=new Scanner(System.in);
	int dep=obj1.nextInt();
	Banking.b=Banking.b+dep;
	System.out.println("your balance is "+b);
}
public static void withdrawal()
{
	System.out.print("enter your withdrawal amount: ");
	Scanner obj2=new Scanner(System.in);
	int withd=obj2.nextInt();
	if(b>=withd)
	{
		Banking.b=Banking.b-withd;
		System.out.println("your balance is "+b);
	}
	else
	{
		System.out.println("insufficient balance");
	}
}
public static void balance()
{
	System.out.println("your new balance is "+b);
}
}
