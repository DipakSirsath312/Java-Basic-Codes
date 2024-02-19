import java.util.*;
class FunctionCheck{
	public static boolean Condition(int age){
		if(age>=18){
				return true;
			}
			return false;

	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		System.out.println(Condition(age));
	}
}