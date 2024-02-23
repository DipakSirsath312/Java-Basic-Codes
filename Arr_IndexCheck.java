import java.util.*;
class Arr_IndexCheck{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Size Element:-");
	int Size=sc.nextInt();
	int Number[]=new int[Size];

	for(int i=0;i<Size;i++){
		Number[i]=sc.nextInt();
	}

	int x=sc.nextInt();

	for(int i=0;i<Number.length;i++){
		if(Number[i]==x){
			System.out.println("x Found At Index:-"+i);
			}


		}

	}
}