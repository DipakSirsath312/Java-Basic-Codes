import java.util.*;
class Array2D_AddMax{
	public static void main(String args[]){
		int a[]=new int[5];
		int b[]=new int[5];
		int sum[]=new int[5];
		int i,max,max1;

		System.out.println("Enter the First Array Element:-");
		Scanner obj=new Scanner(System.in);

		max=a[0];
		for(i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
			if(max<a[i]){
					max=a[i];
				}
		}
		System.out.println("Max:-"+max);

		System.out.println("Enter The Second Array Element:-");
		max1=b[0];
		for(i=0;i<b.length;i++)
		{
			b[i]=obj.nextInt();
			if(max1<b[i])
			{
				max1=b[i];
			}
		}
		System.out.println("max1:-"+max1);

		for(i=0;i<sum.length;i++)
		{
			sum[i]=a[i]+b[i];
			System.out.println("sum:-"+sum[i]);
		}

	}
}