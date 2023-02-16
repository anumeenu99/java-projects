package package1;

public class MultidiMulti {
	public static void main(String []args)
	{
		int i,j,k;
		int a[][]={{1,2,3},{2,3,4},{3,5,6}};
		int b[][]={{2,1,3},{3,2,1},{4,2,5}};
		int mul[][]=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mul[i][j]=0;
				for(k=0;k<3;k++)
				{
					mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
				}
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
	}
}
