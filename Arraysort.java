import java.util.*;
class Arraysort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int number[]=new int[size];

		for(int i=0;i<size;i++){
			number[i]=sc.nextInt();
		}
		boolean isAscending=true;
		for(int i=0;i<number.length-1;i++){
			if(number[i]>number[i+1]){
				isAscending=false;
			}
		}
		if(isAscending){
			System.out.println("The Array is Sorted in Ascending Order");
		}else{
			System.out.println("The Array is Not Sorted in Ascending order");
		}
	}
}