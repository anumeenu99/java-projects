package package1;

public class MultiSum {
	public static void main(String []args)
	{
		int a[][]={{1,2},{2,3}};
		int b[][]={{4,5},{3,6}};
		int sum[][]=new int[2][2];
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}
