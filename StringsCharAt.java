import java.util.*;
class StringsCharAt{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String Firstname=sc.next();
		String Lastname=sc.next();

		String Fullname= Firstname+Lastname;
		System.out.println(Fullname.length());
		for(int i=0;i<Fullname.length();i++){

			System.out.println(Fullname.charAt(i));
		}
	}
}