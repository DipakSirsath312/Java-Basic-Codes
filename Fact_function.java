import java.util.*;
class Fact_function{
	public static void PrintFactorial(int n){
		int factorial=1;
		for(int i=n;i>=1;i--){
				factorial =factorial*i;
			}

			System.out.println(factorial);
			return;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		PrintFactorial(n);
	}
}