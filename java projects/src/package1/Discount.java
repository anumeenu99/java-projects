package package1;

public class Discount {
	int dress,cake,sweets;
public static void main(String []args)
{
	Discount obj=new Discount(4200,1700,900);
	obj.discount();
	Discount obj1=new Discount(2500,900,500);
	obj1.discount();
	
}
public int total()
{
	int amount=dress+cake+sweets;
	return amount;
}
public int discount()
{
	int t=total();
	if(t>=5000)
	{
		int d=t/5;
		System.out.println("your discount amount is"+d);
		t=t-d;
		System.out.println("your total amount after discount:"+t);
	}
	else
	{
		System.out.println("your total amount is "+t);
		
	}
	return t;
}
Discount(int z,int y,int x)
{
	dress=z;
	cake=y;
	sweets=x;
}
}
