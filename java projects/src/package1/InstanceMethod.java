package package1;

public class InstanceMethod {
String name;
public static void main(String []args)
{
	InstanceMethod obj=new InstanceMethod();
	obj.getName();
}
public void getName()
{
	name="Anu";
	System.out.println("Name :"+name);
}
}
