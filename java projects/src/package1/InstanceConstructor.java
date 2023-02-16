package package1;

public class InstanceConstructor {
int length,width,height;
public static void main(String []args)
{
	InstanceConstructor obj=new InstanceConstructor();
	System.out.println(obj.volume());
	InstanceConstructor obj1=new InstanceConstructor(4,3,5);
	System.out.println(obj1.volume());
}
InstanceConstructor()
{
	length=width=height=5;
}
InstanceConstructor(int l,int w,int h)
{
	length=l;
	width=w;
	height=h;
}
public int volume()
{
	int v=length*width*height;
	return v;
}
}
