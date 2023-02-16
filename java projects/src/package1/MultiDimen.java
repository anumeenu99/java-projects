package package1;

public class MultiDimen {
public static void main(String []args)
{
	int a[][]= new int[2][2];
	a[0][0]=1;
	a[0][1]=2;
	a[1][0]=3;
	a[1][1]=5;
	int i,j;
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
