package package1;

public class ThisEx {
	int length,width,height;
	ThisEx()
	{
		this(4,2,5);
		length=width=height=5;
		this.volume();
	}
	ThisEx(int l,int w,int h)
	{
		length=l;
		width=w;
		height=h;
		this.volume();
	}
	public void volume()
	{
		int a=length*width*height;
		System.out.println(a);
	}
	public static void main(String []args)
	{
		ThisEx obj=new ThisEx();
		obj.volume();
	}
}
