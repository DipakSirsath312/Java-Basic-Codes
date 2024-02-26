import java.util.*;
class Strings{
	public static void main(String args[]){
		StringBuilder sb =new StringBuilder("Tony");
		System.out.println(sb);

		// charAt Index 0
		System.out.println(sb.charAt(3));

		//Set charAT Index 0
		sb.setCharAt(0,'S');
		System.out.println(sb);
	}
}