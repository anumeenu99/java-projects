package package1;

public class Pyramid {
	public static void main(String []args)
	{
		int i,j,k,l,m;
		
		for(i=1;i<=4;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=j;k++)
			{
				System.out.print("*");
			}
			for(l=2;l<=j;l++)
			{
				System.out.print("*");
			}
			for(m=4;m>=l;m--)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
