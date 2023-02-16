package package1;

public class BubbleSort {
public static void main(String []args)
{
	int a[]= {21,6,64,33,55};
	int i,j,temp=0;
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
			}
			
		}
	}
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");	
	}
	
}
}
