import java.util.*;
class ArrayEle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Size Element:-");
		int Size=sc.nextInt();
		int Number[]=new int[Size];

		for(int i=0;i<Size;i++){
			Number[i]=sc.nextInt();
		}
		for(int i=0;i<Size;i++){
			System.out.println("Array Element="+Number[i]);
		}
	}
}