package package1;

public class ConstructorEx {
public static void main(String []args)
{
	ConstructorEx obj=new ConstructorEx();
	
	ConstructorEx obj1=new ConstructorEx("Anu",20,22);
}
ConstructorEx()
{
	int a=10;
	System.out.println(a);
	
}
ConstructorEx(String n,int b,int c)
{
	String name=n;
	int z=b;
	int y=c;
	
	System.out.println(name);
	System.out.println(z);
	System.out.println(y);
}
}
