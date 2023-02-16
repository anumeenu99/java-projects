package package1;

public class LinearSearch {
	public static void main(String []args)
	{
		int i,key=52;
		int a[]=new int [5];
		a[0]=30;
		a[1]=22;
		a[2]=34;
		a[3]=52;
		a[4]=13;
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(i=0;i<a.length;i++)
		{  
			
			if(a[i]==key)
			{
				System.out.println("key= "+key+" at index "+i);
			}
		
		}
		
		 
	}
}
