import java.util.*;
class StudentDemo{
	Scanner sc =new Scanner(System.in);
	int Rollno;
	String Name;
	double Fees;
	void input(){
			System.out.print("Enter The Roll Number:-");
			Rollno=sc.nextInt();
			System.out.print("Enter The Student Name:-");
			Name=sc.next();
			System.out.print("Enter The College Fees:-");
			Fees=sc.nextDouble();
		}void output(){
			System.out.println("RollnNo:"+Rollno);
			System.out.println("StudentName:"+Name);
			System.out.println("CollegeFees:"+Fees);
			}
	public static void main(String args[]){
		StudentDemo s=new StudentDemo();
		s.input();
		s.output();
	}
}