package package1;

public class ArrayMax {
public static void main(String []args)
{
	int a[]= {11,32,44,23,17};
	int i,max=0,j;
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
		
	}
	System.out.println();
	for(j=0;j<a.length;j++)
	{
		max=a[0];
	if(a[j]>max)
	{
		max=a[j];
		
	}
	}
	System.out.println(max);
}
}
