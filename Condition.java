import java.util.*;
class Condition {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Age:-");
		int age=sc.nextInt();
		if(age>=18){
				System.out.println("Allowed For Voting");
		}else{
				System.out.println("Not Allowed For voting");
			}
	}
}